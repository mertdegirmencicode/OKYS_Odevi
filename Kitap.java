import java.util.ArrayList;
import java.util.List;

public class Kitap {
    private String isbn;
    private String ad;
    private String yazar;
    private List<KitapKopyasi> kopyalar; 

    public Kitap(String isbn, String ad, String yazar) {
        this.isbn = isbn;
        this.ad = ad;
        this.yazar = yazar;
        this.kopyalar = new ArrayList<>();
    }

    public void kopyaEkle(KitapKopyasi kopya) {
        kopyalar.add(kopya);
    }

    public String getAd() { return ad; }
    public String getIsbn() { return isbn; }
}