package herencia;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mazda mzd= new mazda();
		mzd.setColor("naranja");
		mzd.setCilindraje("1200");
		mzd.setPuerta(1);
		mzd.setTransmision("Auto");
		
		System.out.println(mzd.getColor());
		System.out.println(mzd.getCilindraje());
		System.out.println(mzd.getPuerta());
		System.out.println(mzd.getTransmision());
		
		bronco bron=new bronco();
		bron.setRepuesto(true);
		
		
		System.out.println("Cambio hecho por Aguirre");
		System.out.println("Bye");
		System.out.println(bron.isRepuesto());

	}

}
