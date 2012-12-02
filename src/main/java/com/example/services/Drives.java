package com.example.services;

public class Drives<T> extends Parts<T>{
	Computer comp;	
	double x;
	
	
	public Drives(Computer comp){
		this.comp = comp;	
		}	
	
	
	@Override	
	public String about(String firma) 
	{
		return comp.about(firma) + "STACJA DYSKÓW" + firma ;	
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