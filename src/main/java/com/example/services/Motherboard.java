package com.example.services;

public class Motherboard<T> extends Parts<T>{
	Computer comp;	
	double x;
	
	
	public Motherboard(Computer comp){
		this.comp = comp;	
		}	
	
	
	@Override	
	public String about(String firma) 
	{
		return comp.about(firma) + "P£YTA G£ÓWNA" + firma ;	
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
