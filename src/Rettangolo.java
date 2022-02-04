

public class Rettangolo {

	/*  Mi istanzio tutte le variabili relative alla classe Rettangolo */
	

	int altezza ;
	int perimetro ;
	int area ;
	
	/* Getters & Setters */

	int base ;
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
		
		return area ;
	}
	
	
}
