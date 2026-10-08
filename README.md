# OKYS Projesi Diyagramları

## 1. Use Case Diyagramı
```mermaid
usecaseDiagram
    actor Kullanici
    actor Kutuphaneci
    
    Kullanici --> (Kitap Odunc Al)
    Kullanici --> (Kitap Iade Et)
    Kullanici --> (Kitap Ara)
    
    Kutuphaneci --> (Sisteme Kitap Ekle)
    Kutuphaneci --> (Kitap Kopyasi Ekle)
    Kutuphaneci --> (Odunc Kayitlarini Yonet)classDiagram
    class Kitap {
        -String isbn
        -String ad
        -String yazar
        +kopyaEkle(KitapKopyasi)
    }
    class KitapKopyasi {
        -String kopyaId
        -boolean oduncVerilebilir
        -Kitap kitap
    }
    class Kullanici {
        -String id
        -String adSoyad
    }
    class OduncKaydi {
        -String kayitId
        -Kullanici kullanici
        -KitapKopyasi kopya
        -LocalDate verilisTarihi
        -LocalDate iadeTarihi
        +iadeEt()
        +bilgiYazdir()
    }

    Kitap "1" *-- "*" KitapKopyasi : "sahip"
    Kullanici "1" -- "*" OduncKaydi : "yapar"
    KitapKopyasi "1" -- "*" OduncKaydi : "icerir"