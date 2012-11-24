package com.example.resources;

import java.util.List;

public interface KlientInterface<TEntity> {

	public TEntity get(int id);
	public List<TEntity> getAll();
	public boolean save(TEntity obj);
	public boolean delete(TEntity obj);
	
	
}