public class Main {
    public static void main(String[] args) {
        // 1. Sınıflardan Nesneler Üretme
        Kitap kitap1 = new Kitap("978-975-07-1938-7", "Şeker Portakalı", "José Mauro de Vasconcelos");
        Kullanici kullanici1 = new Kullanici("OGR-202301", "Ayşe Yılmaz");
        
        // 2. İlişkileri Kurma (Kitap ve Kopya ilişkisi)
        KitapKopyasi kopya1 = new KitapKopyasi("KOPYA-001", kitap1);
        kitap1.kopyaEkle(kopya1); 

        // 3. Programı Çalıştırma: Ödünç Alma İşlemi
        System.out.println(">>> Ödünç Alma İşlemi Yapılıyor...");
        OduncKaydi kayit = new OduncKaydi("KAYIT-100", kullanici1, kopya1);
        kayit.bilgiYazdir();
        
        // 4. İade İşlemini Gerçekleştirme
        System.out.println(">>> İade İşlemi Yapılıyor...");
        kayit.iadeEt();
        kayit.bilgiYazdir();
    }
}