import java.util.Scanner;

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

	Scanner s = new Scanner(System.in);	
	Rettangolo rettangolo1 = new Rettangolo() ;
	Rettangolo rettangolo2 = new Rettangolo() ;
	Rettangolo rettangolo3 = new Rettangolo() ;
	int totalePerimetri ;
	int totaleAree ;
	
	/* setto le misure per il 1o rettangolo */
	System.out.println("Definire la base");
	int base = s.nextInt(); 
	
	rettangolo1.setBase(base);
	
	
	System.out.println("Definire l'altezza");
	s.nextLine();
	int altezza = s.nextInt(); 
	rettangolo1.setAltezza(altezza);
	
	/* Eseguo le operazioni richieste */
	
	rettangolo1.perimetro(rettangolo1.getBase(),rettangolo1.getAltezza() );
	rettangolo1.area(rettangolo1.getBase(),rettangolo1.getAltezza() );
	
	// Output
	
	
	System.out.println("Perimetro 1o rettangolo " + rettangolo1.getPerimetro());
	System.out.println("Area 1o rettangolo " + rettangolo1.getArea());	
	
	//
	
	rettangolo2.setBase(5);
	rettangolo2.setAltezza(5);
	
	//
	
	rettangolo2.perimetro(rettangolo2.getBase() , rettangolo2.getAltezza());
	rettangolo2.area(rettangolo2.getBase() , rettangolo2.getAltezza());
	
	// Output
	
//	System.out.println("Perimetro 2o rettangolo " + rettangolo2.getPerimetro());
//	System.out.println("Area 2o rettangolo " + rettangolo2.getArea());
	
	//
	
	rettangolo3.setBase(10);
	rettangolo3.setAltezza(6);
	
	//
	
	rettangolo3.perimetro(rettangolo3.getBase() , rettangolo3.getAltezza());
	rettangolo3.area(rettangolo3.getBase() , rettangolo3.getAltezza());
	
	// Output
	
	System.out.println("Perimetro 3o rettangolo " + rettangolo3.getPerimetro());
	System.out.println("Area 3o rettangolo " + rettangolo3.getArea());

	totaleAree = rettangolo1.getArea() + rettangolo2.getArea() + rettangolo3.getArea() ;
	totalePerimetri =rettangolo1.getPerimetro() + rettangolo2.getPerimetro() + rettangolo3.getPerimetro() ;
	
//	System.out.println("Questo é il totale delle aree " + totaleAree);
//	System.out.println("Questo é il totale dei perimetri " + totalePerimetri);
	
	
	rettangolo3.ridimensiona();
	
	System.out.println("nuovo perimetro " + rettangolo3.getPerimetro());
	System.out.println("nuova Area " + rettangolo3.getArea());
	}

}
