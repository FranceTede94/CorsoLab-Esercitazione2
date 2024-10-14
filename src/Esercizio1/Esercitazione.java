package Esercizio1;

public class Esercitazione {
    
    private String nome;
    private String cognome;
    private String Telefono = "3959944761";
    private int Numero1 = 200;
    private int Numero2 = 100;
    
    private int[] NumeroContenitore = {9, 6, 6, 7, 7, };
    
    private boolean Lampadina;
    
    
    public Esercitazione(String nom, String cogn, String Tel) {
        this.nome = nom;
        this.cognome = cogn;
        this.Telefono = Tel;
    }
    
   
    public String Ispeziona() {
    	if(Telefono.equals("3959944761")) {
    		return "è corretto";
    	}
    	else {
    		 return "non è corretto";
    	}
    }
    
    public int Confronto() {
    	
    	if(Numero1 > 100) {
    		return Numero1 + Numero2;
    
    	}
    	else {
    		return Numero1 - Numero2;
    	}	
    	
    }
    
    public double MediaContenotore() {
    	double Totalenumeri = 0;
    	
    	for(int i=0;i<NumeroContenitore.length;i++) {
    		Totalenumeri += NumeroContenitore[i];
    	}
    	return Totalenumeri/NumeroContenitore.length;
    }
    
    
    
    public String MovimentoLampadina()
    {
    	if(Lampadina) {
    		return "La lampadina è accesa";
    	}
    	else {
    		return "La lampadina è spenta";
    	}	
    }
    
    
    public String NomeCompleto(String nom, String cogn) {
        return nome + " " + cognome;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
}