import java.util.Scanner;

public class Atm�slemleri {
	
	public void calis(Hesap hesap)
	{
		
		int giris_hakki=3;
		
		login giris=new login();
		System.out.println("Bankaya ho�geldiniz...");
		
		
		
		
		
		
		
		
		
		while(giris_hakki>0)
		{
			

			boolean sonuc=giris.girisIslemi(hesap);
			if(sonuc)
			{
				System.out.println("Tebrikler giri� yapt�n�z");
				break;
			}
			
			else
			{
				
				giris_hakki --;
				System.out.println("Hatal� giri� yapt�n�z.Yeniden deneyin.Kalan hak: "+giris_hakki);
			}
			if(giris_hakki==0)
			{
				System.out.println("Hakk�n�z bitti.");
				
				return;//Methodu bitirmek i�in
			}
				
		}
		
		
		String islemler="1.Hesap G�r�nt�le\n"
				    +"2.Para �ek\n"
				    +"3.Para Yat�r\n"
				    +"4.��k�� yapmak i�in q ya basiniz";
		
		
		System.out.println(islemler);
		
		
		while(true)
		{
			Scanner scan=new Scanner(System.in);
			
			String secim;
			
			System.out.println("��lem se�iniz....");
			
			secim=scan.nextLine();
			
			
			if(secim.equals("q"))
			{
				
				System.out.println("��k�l�yor....");
				
				break;
			}
			
			else if(secim.equals("1"))
			{
				System.out.println("Bakiyeniz: "+hesap.getBakiye());
				
			}
			
			else if(secim.equals("2"))
			{
		      System.out.println("Ne kadar �ekeceksiniz?");
				 int para;
			       
			       para=scan.nextInt();
			       
			       
			       hesap.paraCek(para);
		       
			}
			else if(secim.equals("3"))
			{
				System.out.println("Ne kadar yat�racaks�n�z?");
				int para_deger;
				para_deger=scan.nextInt();
				hesap.paraYatir(para_deger);
			}
			
			else
			{
				System.out.println("Hatal� i�lem se�tiniz.L�tfen tekrar deneyin..");
			}
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
	}
	
	

}




