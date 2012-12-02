package com.example.services;

public class Power<T> extends Parts<T>{
	Computer comp;	
	double x;
	
	
	public Power(Computer comp){
		this.comp = comp;	
		}	
	
	
	@Override	
	public String about(String firma) 
	{
		return comp.about(firma) + "ZASILACZ" + firma ;	
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
