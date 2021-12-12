package entity;

import javax.persistence.*;

/**
 * id
 * adi
 * kirilim
 * ustKategoriId
 * */
@Entity
@Table(name = "KATEGORI")
public class Kategori {

    @SequenceGenerator(name = "generator", sequenceName = "FIRST_ENTITY_ID_SEQ")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "id", nullable = false)
    private Long id;

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public Long getKirilim() {
        return kirilim;
    }

    public void setKirilim(Long kirilim) {
        this.kirilim = kirilim;
    }

    public Kategori getUstKategori() {
        return ustKategori;
    }

    public void setUstKategori(Kategori ustKategori) {
        this.ustKategori = ustKategori;
    }

    @Column(name = "ADI", nullable = false, length = 50)
    private String adi;

    @Column(name = "KIRILIM")
    private Long kirilim;

    //Bir sürü pc var ama üst kategori 1 tane var. Man TO One ilişkisi olur.
    //Entity içinde Entity çağırmak önerilmez bu nedenle LAZY yap.
    //cascade, optional incele
    //mappedBy = "ulke" -> bunu pas geç demek
    //En sık başvurulan ilişki tipi MantToOne'dır
    //@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_UST_KATEGORI")
    private Kategori ustKategori;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Kategori{" +
                "id=" + id +
                ", adi='" + adi + '\'' +
                ", kirilim=" + kirilim +
                ", ustKategori=" + ustKategori +
                '}';
    }
}
