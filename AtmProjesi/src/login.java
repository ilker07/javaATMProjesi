import java.util.Scanner;

public class login {

	
	
	public  boolean girisIslemi(Hesap hesap)
	{
		Scanner scan=new Scanner(System.in);
		
		
		String k_adi;
		String parola;
		
		System.out.print("Kullanýcý adýn girin:");
		k_adi=scan.nextLine();
		System.out.print("Parola girin:");
		parola=scan.nextLine();
		
		if(hesap.getKullanici_adi().equals(k_adi) && hesap.getParola().equals(parola))
		{
			return true;
		}
		else
		{ 
		
		   return false;
		   
		}
	}
}
