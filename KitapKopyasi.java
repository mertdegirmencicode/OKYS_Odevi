public class KitapKopyasi {
    private String kopyaId;
    private boolean oduncVerilebilir;
    private Kitap kitap; 

    public KitapKopyasi(String kopyaId, Kitap kitap) {
        this.kopyaId = kopyaId;
        this.kitap = kitap;
        this.oduncVerilebilir = true; 
    }

    public boolean isOduncVerilebilir() { return oduncVerilebilir; }
    public void setOduncVerilebilir(boolean durum) { this.oduncVerilebilir = durum; }
    public Kitap getKitap() { return kitap; }
    public String getKopyaId() { return kopyaId; }
}