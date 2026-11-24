package principal;

import ejercicio2.Cuenta;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona personaIrene = new Persona ("Irene", 25, "12345678A");
		System.out.println(personaIrene.toString());
		
		System.out.println(personaIrene.esMayorDeEdad());
	}

}
