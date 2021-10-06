
import Objetos.Coche;
import Objetos.Concesionario;

public class Start {
	public static void main(String[] args) {
		
		Concesionario concesionario1= new Concesionario();
		concesionario1.print();
		
		Coche c1= new Coche();
		c1.setColor("Amarillo");
		
		Coche c2= new Coche();
		c2.setColor("Gris");
		c2.setMarca("Honda");
		
		Coche c3= new Coche();
		c3.setColor("Ocre");
		c3.setMarca("Volvo");
		
		concesionario1.setCoche1(c1);
		concesionario1.setCoche2(c2);
		concesionario1.setCoche3(c3);
		
		concesionario1.print();
		System.out.println("**********Añadir coche al concesionario**************");

		
		if (concesionario1.comprar(c1)) {
			System.out.println("El coche se ha añadido correctamente");
		}else {
			System.out.println("Cocesionario completo");

		}
		
	}
}
