import java.util.Scanner;

public class Rettangolo {

	/*  Mi istanzio tutte le variabili relative alla classe Rettangolo */

	private int base ;
	private int altezza ;
	private int perimetro ;
	private int area ;

	/* Getters & Setters */


	public int getBase() {
		return base;
	}


	public void setBase(int base) {
		this.base = base;
	}


	public int getAltezza() {
		return altezza;
	}


	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}


	public int getPerimetro() {
		return perimetro;
	}


	public void setPerimetro(int perimetro) {
		this.perimetro = perimetro;
	}


	public int getArea() {
		return area;
	}


	public void setArea(int area) {
		this.area = area;
	}


	/* Creo i metodi  per i calcoli di perimetro , area e modifiche */

	public int perimetro (int base , int altezza) {

		perimetro = 2*(base + altezza );

		return perimetro ;
	}


	public int area (int base, int altezza) {

		area = base * altezza ;

		return area  ;
	}

	public void ridimensiona () {
		Scanner s = new Scanner(System.in);
		System.out.println("Definisci la nuova base");
		base = s.nextInt();
		System.out.println("Definisci la nuova altezza");
		altezza = s.nextInt();


		perimetro(base , altezza) ;
		perimetro(base , altezza) ;
	}	  

}
