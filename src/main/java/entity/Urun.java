package entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * id
 * adi
 * fiyat
 * kayitTarihi
 * KategoriId
 */
@Entity
@Table(name = "URUN")
public class Urun {

    @SequenceGenerator(name = "generator", sequenceName = "URUN_ID_SEQ")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(length = 50)
    private String adi;

    @Column(precision = 19, scale = 2)
    private BigDecimal fiyat;


    @Temporal(TemporalType.TIMESTAMP)
    private Date kayit_tarihi;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_KATEGORI",
            foreignKey = @ForeignKey(name = "FK_URUN_KATEGORI_ID"))
    private Kategori kategori;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public BigDecimal getFiyat() {
        return fiyat;
    }

    public void setFiyat(BigDecimal fiyat) {
        this.fiyat = fiyat;
    }

    public Date getKayitTarihi() {
        return kayit_tarihi;
    }

    public void setKayitTarihi(Date kayit_tarihi) {
        this.kayit_tarihi = kayit_tarihi;
    }

    public Kategori getKategori() {
        return kategori;
    }

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }
}
