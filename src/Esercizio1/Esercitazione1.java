package Esercizio1;

public class Esercitazione1 {

    public static void main(String[] args) {
   
    	Esercitazione Esercitazione = new Esercitazione("Luca", "Tedesco", "3959944761");
    	
    	Esercitazione.setCognome("Toma");
    	Esercitazione.setNome("Francesco");
    	
    	//Esercitazione.setTelefono("3413344650");
    	System.out.println("il numero di telefono è " + Esercitazione.getTelefono());
    	
    	System.out.println("Il nome completo è: " + Esercitazione.getNome() + " " + Esercitazione.getCognome());
    	
    	Persona1();
    	
    	
    	Esercitazione.Ispeziona();
    	System.out.println(Esercitazione.Ispeziona());
    	
    	System.out.println("Il contenitore è formato da " + Esercitazione.Confronto() + " pezzi");
    	System.out.println("La media di questo contenitore è " + Esercitazione.MediaContenotore());
    	System.out.println("La lampadina sarà accesa o spenta? " + Esercitazione.MovimentoLampadina());
    	}
    
    
    	
    public static void Persona1() {
    	
    	String NomePersona = "Andrea";
    	String CognomePersona = "Tedesco";
    	String CodiceFiscale = "TGFFBN92E04B956K";
    	
    	System.out.println("I dati di questa persona sono " + NomePersona + " " + 
    	CognomePersona + " e il suo codice ficsale è " + CodiceFiscale);
    	
    }
    
    
    
   
}