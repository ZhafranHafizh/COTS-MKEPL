import src.main.java.Kalkulator;

public class Driver {

	public static void main(String[] args) {
		
		Kalkulator counter = new Kalkulator();
		
		System.out.println("hasil :" + counter.getHasil());
		
		counter.tambah();
		
		System.out.println("Hasil :" + counter.getHasil());
		
		counter.kalikanDengan(2);
		
		System.out.println("Hasil :" + counter.getHasil());
		
	}

}
