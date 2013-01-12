package com.example.resources;

import java.util.List;

import com.example.services.Disk;

public interface ManagerInterface<TEntity> {
	
	public TEntity get(int id);
	public List<TEntity> getAll();
	public boolean save(TEntity obj);
	public boolean delete(TEntity obj);
	
	
}
