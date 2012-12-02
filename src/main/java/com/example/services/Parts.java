package com.example.services;

public abstract class Parts<T> extends Computer {     
	     public abstract String about(String Firma);      
	     public abstract boolean check(T obj);
}