package com.example.services;

public class RamMemory<T> extends Parts<T>{
	Computer comp;	
	double x;
	
	
	public RamMemory(Computer comp){
		this.comp = comp;	
		}	
	
	
	@Override	
	public String about(String firma) 
	{
		return comp.about(firma) + "PAMIEÆ RAM" + firma ;	
	}	
	
	public double cena()
	{		
		return comp.cena()+ x;			
	}


	@Override
	public boolean check(T obj) {
		
		return false;
	}

}