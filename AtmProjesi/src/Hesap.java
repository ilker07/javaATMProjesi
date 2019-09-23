
public class Hesap {

	
	private String kullanici_adi;
	private String parola;
	private int bakiye;
	
	
	
	public Hesap(String kullanici_adi, String parola, int bakiye) {
		
		this.kullanici_adi = kullanici_adi;
		this.parola = parola;
		this.bakiye = bakiye;
		
		
	}



	public String getKullanici_adi() {
		return kullanici_adi;
	}



	public void setKullanici_adi(String kullanici_adi) {
		this.kullanici_adi = kullanici_adi;
	}



	public String getParola() {
		return parola;
	}



	public void setParola(String parola) {
		this.parola = parola;
	}



	public int getBakiye() {
		return bakiye;
	}



	public void setBakiye(int bakiye) {
		this.bakiye = bakiye;
	}
	
 public void paraYatir(int miktar)
 {
	 this.bakiye+=miktar;
	 System.out.println(miktar+" TL yat�rd�n�z..Yeni Bakiye: "+this.bakiye);
 }

 
 public void paraCek(int miktar)
 {
	 if(miktar>1000)
	 {
		 System.out.println("Bir g�nde 1000 TL den fazla para �ekemezsiniz..Bakiye: "+this.bakiye);
		 
		 
	 }
	 
	 else if(this.bakiye<miktar)
	 {
		 System.out.println("�ekilmek istenen miktar bakiyeden fazla..Bakiye: "+this.bakiye);
		 
		 
	 }
	 else
	 {
		 this.bakiye -=miktar;
		 System.out.println(miktar+" TL �ektiniz..Yeni bakiye: "+this.bakiye);
	 }
	 
	 
	 
	 
	 
 }
	
	
	
}
