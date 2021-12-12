package entity;

import javax.persistence.*;
import java.util.Date;

/**
 * id
 * yorum
 * yorumTarihi
 * urunId
 * kullaniciId
 * */
@Entity
@Table(name = "URUNYORUM")
public class UrunYorum {
    @SequenceGenerator(name = "generator", sequenceName = "FIRST_ENTITY_ID_SEQ")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "YORUM", length = 500)
    private String yorum;

    @Column(name = "YORUM_TARIHI")
    private Date yorum_tarihi;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "URUN_ID",
            foreignKey = @ForeignKey(name = "FK_URUN_ID"))
    private Urun urun_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "KULLANICI_ID",
            foreignKey = @ForeignKey(name = "FK_URUN_YORUM_KULLANICI_ID"))
    private Kullanici kullanici_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getYorum() {
        return yorum;
    }

    public void setYorum(String yorum) {
        this.yorum = yorum;
    }

    public Date getYorumTarihi() {
        return yorum_tarihi;
    }

    public void setYorumTarihi(Date yorum_tarihi) {
        this.yorum_tarihi = yorum_tarihi;
    }

    public Urun getUrunId() {
        return urun_id;
    }

    public void setUrunId(Urun urun_id) {
        this.urun_id = urun_id;
    }

    public Kullanici getKullaniciId() {
        return kullanici_id;
    }

    public void setKullaniciId(Kullanici kullanici_id) {
        this.kullanici_id = kullanici_id;
    }

}
