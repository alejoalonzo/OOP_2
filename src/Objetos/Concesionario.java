package Objetos;

public class Concesionario extends Edificio implements CompraVenta{
	
	
	protected Coche coche1;
	protected Coche coche2;
	protected Coche coche3;
	
	public Concesionario() {
		this.coche1= null;
		this.coche2= null;
		this.coche3= null;
	}
	
	//Getter & Setter--------------------------------------------
	public Coche getCoche1() {
		return coche1;
	}


	public  void setCoche1(Coche coche1) {
		this.coche1 = coche1;
	}


	public Coche getCoche2() {
		return coche2;
	}


	public void setCoche2(Coche coche2) {
		this.coche2 = coche2;
	}


	public Coche getCoche3() {
 		return coche3;
	}
 

	public void setCoche3(Coche coche3) {
		this.coche3 = coche3;
	}
	//-------------------------------------------------------------
	
	
	@Override
	public boolean comprar(Coche c) {
		// TODO Auto-generated method stub
		if ( coche1 == null ) {
			coche1 = c;
			return true;
			
		}else if ( coche2 == null ) {
			coche2 = c;
			return true;
			
		}else if ( coche3 == null) {
			coche3 = c;
		}
			
		return false;
	}

	@Override
	public boolean vender(Coche c) {
		// TODO Auto-generated method stub
		if(c.getMarca()== coche1.getMarca()) {
			coche1 = null;
			return  true;
		}else if(c.getMarca()== coche2.getMarca()) {
			coche2 = null;
			return  true;
		}else if(c.getMarca()== coche2.getMarca()) {
			coche2 = null;
			return  true;
		}
		return false;
	}
	
	//Own method-----------------------------------------------------
	public void print() {
		super.print();
		if(this.coche1!=null) {
			System.out.println("************INFO COCHE 1************** ");
			System.out.println("Marca: " + this.coche1.getMarca());
			System.out.println("Color: " + this.coche1.getColor());
			System.out.println("Ruedas: " + this.coche1.getNumeroRuedas());
			System.out.println("Velocidad: " + this.coche1.getVelocidadMAxima());
			System.out.println("Caballos: " + this.coche1.getNumeroCaballos());  
		}if(this.coche2!=null) {
			System.out.println("************INFO COCHE 2************** ");
			System.out.println("Marca: " + this.coche2.getMarca());
			System.out.println("Color: " + this.coche2.getColor());
			System.out.println("Ruedas: " + this.coche2.getNumeroRuedas());
			System.out.println("Velocidad: " + this.coche2.getVelocidadMAxima());
			System.out.println("Caballos: " + this.coche2.getNumeroCaballos());
		}
	}
	
	
	
	
}
