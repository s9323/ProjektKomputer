package Komputer.JW.business;


public class Drivers<T> extends Parts<T>{
	Computer comp;	
	private String nazwa_firmy;
	private int ilosc;
	private int cena;
	private int id_stacji;
	
	public Drivers(Computer comp){
		this.comp = comp;	
		}	
	
	public Drivers(String nazwa_firmy, int ilosc,
			int cena) {
		this.nazwa_firmy = nazwa_firmy;
		this.ilosc = ilosc;
		this.cena = cena;
	}
	
	public int getId() {
		return id_stacji;
	}

	public void setId(int id_stacji) {
		this.id_stacji = id_stacji;
	}
	
    public String getNazwa_firmy() {
		return nazwa_firmy;
	}

    public void setNazwa_firmy(String nazwa_firmy) {
    	this.nazwa_firmy = nazwa_firmy;
	}
    
    public int getIlosc() {
		return ilosc;
	}
	
    public void setIlosc(int ilosc) {
		this.ilosc = ilosc;
		
	}
   
    public int getCena() {
		return cena;
	}
    
    public void setCena(int cena) {
	  this.cena = cena;
	}
    
	
	
	@Override	
	public String about(String nazwa_firmy) 
	{
		return comp.about(nazwa_firmy) + "STACJA DYSK�W" + nazwa_firmy ;	
	}	
	
	public double cena()
	{		
		return comp.cena()+ cena;			
	}


	@Override
	public boolean check(T obj) {
		
		return false;
	}
	
	@Override
	public String toString (){
		String s="";
		s+=id_stacji+" "+nazwa_firmy+" "+ilosc+" "+cena;
		
		return s;	
	}

}