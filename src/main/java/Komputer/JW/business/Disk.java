package Komputer.JW.business;


public class Disk<T> extends Parts<T>{
	Computer comp;	
	private String nazwa_firmy;
	private int ilosc;
	private int pojemnosc;
	private int cena;
	private int id_dysku;
	
	public Disk(Computer comp){
		this.comp = comp;	
		}	
	
	public Disk(String nazwa_firmy, int ilosc, int pojemnosc,
			int cena) {
		this.nazwa_firmy = nazwa_firmy;
		this.ilosc = ilosc;
		this.pojemnosc = pojemnosc;
		this.cena = cena;
		
	}
	
	public int getId() {
		return id_dysku;
	}

	public void setId(int id_dysku) {
		this.id_dysku = id_dysku;
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
    public int getPojemnosc() {
		return pojemnosc;
	}
    
    public void setPojemnosc(int pojemnosc) {
		this.pojemnosc = pojemnosc;
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
		return comp.about(nazwa_firmy) + "DYSK" + nazwa_firmy ;	
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
		
		s+=id_dysku+" "+nazwa_firmy+" "+ilosc+" "+pojemnosc+" "+cena;
		
		return s;	
	}
}
	