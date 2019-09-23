import java.util.Scanner;

public class AtmÝslemleri {
	
	public void calis(Hesap hesap)
	{
		
		int giris_hakki=3;
		
		login giris=new login();
		System.out.println("Bankaya hoþgeldiniz...");
		
		
		
		
		
		
		
		
		
		while(giris_hakki>0)
		{
			

			boolean sonuc=giris.girisIslemi(hesap);
			if(sonuc)
			{
				System.out.println("Tebrikler giriþ yaptýnýz");
				break;
			}
			
			else
			{
				
				giris_hakki --;
				System.out.println("Hatalý giriþ yaptýnýz.Yeniden deneyin.Kalan hak: "+giris_hakki);
			}
			if(giris_hakki==0)
			{
				System.out.println("Hakkýnýz bitti.");
				
				return;//Methodu bitirmek için
			}
				
		}
		
		
		String islemler="1.Hesap Görüntüle\n"
				    +"2.Para Çek\n"
				    +"3.Para Yatýr\n"
				    +"4.Çýkýþ yapmak için q ya basiniz";
		
		
		System.out.println(islemler);
		
		
		while(true)
		{
			Scanner scan=new Scanner(System.in);
			
			String secim;
			
			System.out.println("Ýþlem seçiniz....");
			
			secim=scan.nextLine();
			
			
			if(secim.equals("q"))
			{
				
				System.out.println("Çýkýlýyor....");
				
				break;
			}
			
			else if(secim.equals("1"))
			{
				System.out.println("Bakiyeniz: "+hesap.getBakiye());
				
			}
			
			else if(secim.equals("2"))
			{
		      System.out.println("Ne kadar çekeceksiniz?");
				 int para;
			       
			       para=scan.nextInt();
			       
			       
			       hesap.paraCek(para);
		       
			}
			else if(secim.equals("3"))
			{
				System.out.println("Ne kadar yatýracaksýnýz?");
				int para_deger;
				para_deger=scan.nextInt();
				hesap.paraYatir(para_deger);
			}
			
			else
			{
				System.out.println("Hatalý iþlem seçtiniz.Lütfen tekrar deneyin..");
			}
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
	}
	
	

}




