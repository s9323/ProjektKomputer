package com.example.main;

import com.example.resources.Client;
import com.example.resources.DbAdapter;

public class Main {

	public static void main(String[] args) {
		
	
	
		DbAdapter mgr = new DbAdapter();		
		mgr.save(new Client("Adam", "Kolwaski" ,"Podwale"));
		
		
		
	}
	

}
