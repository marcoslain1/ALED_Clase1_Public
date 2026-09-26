package repaso;

public class Variables {
	
	private int atributo;
	
	public static void main(String[] args) {
		// Variables
		
		// Tipos primitivos
		// Enteros
		byte tipoByte = 5;
		short tipoShort;
		int tipoInt;
		long tipoLong;
		
		// Decimales
		float tipoFloat;
		double tipoDouble;
		
		// caracteres
		char tipoChar = 'a';
		
		// Booleano
		boolean tipoBoolean;
		
		// Tipos referencia
		String s = "hola";
		int tamanoS = s.length();
		Variables v = new Variables();
		Integer i = Integer.MAX_VALUE;
		int[] arrInt = new int[3];
		//arrInt[0] = 2;
		int tamano = arrInt.length;
		
		// Operadores
		// =, ==, !=, +, -, /, *, %, &&, ||, ++, --, >, < >=, <=, 
		// == En tipos primitivos compara el valor en sí, pero en tipos de referencia o clases (String, Integer...) compara la dirección de memoria.
		// En este segundo caso habría que usar .equals().
		System.out.println(2 * 3);
		
		// Condicionales
		int edad = 16;
		if (edad > 18) {
			System.out.println("El usuario es mayor de edad");
		} else if (edad == 18) {
			System.out.println("El usuario tiene 18 años");
		} else {
			System.out.println("El usuario es menor de edad");
		}
		
		switch (edad) {
		case 18: {
			System.out.println("El usuario tiene 18 años");
			break;
		}
//		default:
//			throw new IllegalArgumentException("Unexpected value: " + edad);
		}
		
		// Bucles
		for (int j = 0; j < arrInt.length; j++) {
			System.out.println(arrInt[j]);
		}
		for (int integer : arrInt) {
			System.out.println(integer);
		}
		
		while (edad < 18) {
			System.out.println("Aun eres menor de edad");
			edad = cumple(edad);
		}
	}
	
	public static int cumple(int edad) {
		return ++edad;
	}
	public static void comer() {
		System.out.println("Estoy comiendo");
	}

	
}
