//Login Class'ı Kullanıcı Girisini Kontrol edecek
//Hasap  class'ı Hesap İslemini yapacak
//ATM ise atmyi calıstıracak
public class Main {
    public static void main(String[] args) {
     ATM atm=new ATM();
     Hesap hesap=new Hesap("Mustafa", "12345", 2000);
     atm.calis(hesap);
     System.out.println("Programdan Çıkılıor...");
    }
}
