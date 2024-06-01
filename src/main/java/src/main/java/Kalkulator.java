package src.main.java;

public class Kalkulator {
    private int Hasil;
	
	public Kalkulator() {
		this.reset();
	}
		
	public void reset() {
		Hasil = 0;
	}
	
	public void tambah() {
		Hasil++;
	}
	
	public void tambahSebanyak(int i) {
		Hasil+=i;
	}
	
	public void kurang() {
		Hasil--;
	}
	
	public void kurangSebanyak(int i) {
		Hasil-=i;
	}
	
	public void kalikanDengan(int i){
		Hasil = Hasil * i;
	}
	

	public void pangkatkanDengan(int i){
		Hasil = Hasil ^ i;
	}
	
	public boolean isGenap(){
		return Hasil % 2 == 0;
	}
	
	public int getHasil() {
		return Hasil;
	}

    public float bagiDengan(int i){
        return Hasil / i;
    }

    public void kalidua(){
        Hasil = Hasil * 2;
    }
}
