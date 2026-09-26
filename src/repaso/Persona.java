package repaso;

public class Persona {
	
	String nombre;
	static int numPersonas;
	
	public Persona(String nombre) {
		this.nombre = nombre;
		numPersonas++;
	}
	
	public void comer() {
		System.out.println("Estoy comiendo...");
	}
	
	public static void main(String[] args) {
		Persona p = new Persona("David");
		// p.nombre = "David";
		System.out.println(p.nombre);
		System.out.println("Hay " + Persona.numPersonas + " personas creadas.");
	
		Persona p1 = new Persona("Carlos");
		System.out.println(p1.nombre);
		System.out.println("Hay " + Persona.numPersonas + " personas creadas.");

	}
	

}
