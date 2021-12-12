package entity;

import javax.persistence.*;

/**
 * id
 * adi
 * soyadi
 * email
 * telefon
 * */
@Entity
@Table(name = "KULLANICI")
public class Kullanici {
    @SequenceGenerator(name = "generator", sequenceName = "FIRST_ENTITY_ID_SEQ")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "ADI", nullable = false, length = 50)
    private String adi;

    @Column(name = "SOYADI", nullable = false, length = 50)
    private String soyadi;

    @Column(name = "EMAIL", nullable = false, length = 50)
    private String email;

    @Column(name = "TELEFON", nullable = false, length = 15)
    private Long telefon;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getTelefon() {
        return telefon;
    }

    public void setTelefon(Long telefon) {
        this.telefon = telefon;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }
}
