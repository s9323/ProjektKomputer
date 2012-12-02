package com.example.services;

public class GraphicsCard<T> extends Parts<T>{
	Computer comp;	
	double x;
	
	
	public GraphicsCard(Computer comp){
		this.comp = comp;	
		}	
	
	
	@Override	
	public String about(String firma) 
	{
		return comp.about(firma) + "KARTA GRAFICZNA" + firma ;	
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
