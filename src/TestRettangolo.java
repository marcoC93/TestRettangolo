/* Scrivere una classe Rettangolo i cui oggetti rappresentano rettangoli. Lo stato interno di
un rettangolo `e dato dai valori della base e dell’altezza. Un rettangolo deve mettere a disposizione tre
operazioni: ridimensiona() che prende come parametri due nuovi valori di base e altezza e aggiorna
lo stato, perimetro() che restituisce il perimetro e area() che restituisce l’area. Prevedere inoltre un
costruttore che inizializza base e altezza del rettangolo.
Per testare la classe, scrivere un programma TestRettangolo che crea tre rettangoli (oggetti della
classe Rettangolo) ne calcola la somma delle aree e la somma dei perimetri (stampando i risultati),
ridimensiona uno dei tre rettangoli e ristampa le somme.  
*/

public class TestRettangolo {

	public static void main(String[] args) {

	Rettangolo rettangolo1 = new Rettangolo() ;
	Rettangolo rettangolo2 = new Rettangolo() ;
	Rettangolo rettangolo3 = new Rettangolo() ;
	int totalePerimetri ;
	int totaleAree ;
	
	/* setto le misure per il 1o rettangolo */
	
	rettangolo1.setBase(2);
	rettangolo1.setAltezza(3);
	
	/* Eseguo le operazioni richieste */
	
	rettangolo1.perimetro(rettangolo1.getBase(),rettangolo1.getAltezza() );
	rettangolo1.area(rettangolo1.getBase(),rettangolo1.getAltezza() );
	
	// Output
	
	
	System.out.println(rettangolo1.getPerimetro());
	System.out.println(rettangolo1.getArea());	
	
	//
	
	rettangolo2.setBase(5);
	rettangolo2.setAltezza(5);
	
	//
	
	rettangolo2.perimetro(rettangolo2.getBase() , rettangolo2.getAltezza());
	rettangolo2.area(rettangolo2.getBase() , rettangolo2.getAltezza());
	
	// Output
	
//	System.out.println(rettangolo2.getPerimetro());
//	System.out.println(rettangolo2.getArea());
	
	//
	
	rettangolo3.setBase(10);
	rettangolo3.setAltezza(6);
	
	//
	
	rettangolo3.perimetro(rettangolo3.getBase() , rettangolo3.getAltezza());
	rettangolo3.area(rettangolo3.getBase() , rettangolo3.getAltezza());
	
	// Output
	
	System.out.println(rettangolo3.getPerimetro());
	System.out.println(rettangolo3.getArea());

	totaleAree = rettangolo1.getArea() + rettangolo2.getArea() + rettangolo3.getArea() ;
	totalePerimetri =rettangolo1.getPerimetro() + rettangolo2.getPerimetro() + rettangolo3.getPerimetro() ;
	
	System.out.println(totaleAree);
	System.out.println(totalePerimetri);
	
	}

}
