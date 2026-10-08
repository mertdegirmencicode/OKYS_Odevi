import java.time.LocalDate;

public class OduncKaydi {
    private String kayitId;
    private Kullanici kullanici; 
    private KitapKopyasi kopya;  
    
    private LocalDate verilisTarihi;
    private LocalDate iadeTarihi;

    public OduncKaydi(String kayitId, Kullanici kullanici, KitapKopyasi kopya) {
        this.kayitId = kayitId;
        this.kullanici = kullanici;
        this.kopya = kopya;
        this.verilisTarihi = LocalDate.now();
        
        this.kopya.setOduncVerilebilir(false); 
    }

    public void iadeEt() {
        this.iadeTarihi = LocalDate.now();
        this.kopya.setOduncVerilebilir(true);
    }

    public void bilgiYazdir() {
        System.out.println("Kayıt ID: " + kayitId);
        System.out.println("Kullanıcı: " + kullanici.getAdSoyad());
        System.out.println("Kitap: " + kopya.getKitap().getAd() + " (Kopya ID: " + kopya.getKopyaId() + ")");
        System.out.println("Veriliş Tarihi: " + verilisTarihi);
        System.out.println("İade Edildi mi: " + (iadeTarihi != null ? "Evet (" + iadeTarihi + ")" : "Hayır (Hala okuyucuda)"));
        System.out.println("--------------------------------------------------");
    }
}