package com.example.main;

import com.example.resources.Client;
import com.example.resources.DbAdapter;
import com.example.resources.DiskManager;
import com.example.resources.DriversManager;
import com.example.resources.GraphicsCardManager;
import com.example.resources.HousingManager;
import com.example.resources.MotherBoardManager;
import com.example.resources.PowerManager;
import com.example.resources.ProcessorManager;
import com.example.resources.RamMemoryManager;
import com.example.services.Disk;
import com.example.services.Drivers;
import com.example.services.GraphicsCard;
import com.example.services.Housing;
import com.example.services.MotherBoard;
import com.example.services.Power;
import com.example.services.Processor;
import com.example.services.RamMemory;

public class Main {

	public static void main(String[] args) {
		
	
	
		DbAdapter mgr = new DbAdapter();		
		mgr.save(new Client("Adam", "Kolwaski" ,"Podwale"));
		Client ktos = mgr.get(1);
	
		
		System.out.println(mgr.getAll());
	
	 
	    DiskManager dm = new DiskManager();
	    //dm.save(new Disk("Segate", 10, 500, 200));
	   
	   System.out.println(dm.search("Segate"));
	    
	   
	    DriversManager drm = new DriversManager();
	    //drm.save(new Drivers("LG", 10, 150));
        
	    System.out.println(drm.search("LG"));
        
        
	    GraphicsCardManager gcm = new GraphicsCardManager();
	    //gcm.save(new GraphicsCard("Radeon hd9550", "Gigabyte", 2 , 512, 200));
	   
	    System.out.println(gcm.search("Gigabyte"));
	    
	    
	    HousingManager hm = new HousingManager();
	    //hm.save(new Housing("Antec", 3 , 400));
	   
	    System.out.println(hm.search("Antec"));
	    
	    
	    MotherBoardManager mbm = new MotherBoardManager();
	    //mbm.save(new MotherBoard("Gigabyte", 2 , 1000));
	   
	   System.out.println(mbm.search("Gigabyte"));
	    
	    
	    PowerManager pm = new PowerManager();
	    //pm.save(new Power("Areocool", 5 , 200));
	   
	   System.out.println(pm.search("Areocool "));
	    
	    
	    ProcessorManager mp = new ProcessorManager();
	    //mp.save(new Processor("Intel core i7", 2 , 4 , 1500));
	   
	    System.out.println(mp.search("Intel core i7"));
	    
	    
	    RamMemoryManager rmm = new RamMemoryManager();
	    //rmm.save(new RamMemory("Kingston", 2 , 2, 400));
	   
	    System.out.println(rmm.search("Kingston"));
	}

}     
