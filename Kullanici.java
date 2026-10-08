public class Kullanici {
    private String id;
    private String adSoyad;

    public Kullanici(String id, String adSoyad) {
        this.id = id;
        this.adSoyad = adSoyad;
    }

    public String getAdSoyad() { return adSoyad; }
    public String getId() { return id; }
}