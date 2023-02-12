package ba.sum.fsre.ednevnik.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.util.Date;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 40, nullable = false)
    @NotBlank(message = "Molimo vas unesite mail studenta.")
    private String email;

    @Column(length = 50, nullable = false)
    @NotBlank(message = "Molimo vas unesite ime studenta.")
    private String firstname;

    @Column(length = 40, nullable = false)
    @NotBlank(message = "Molimo vas unesite prezime studenta.")
    private String lastname;
    @Column(length = 50, nullable = false)
    @NotBlank(message = "Molimo vas unesite adresu studenta.")
    private String adresa;
    @Column(length = 10, nullable = false)
    @NotBlank(message = "Molimo vas unesite adresu stanovanja studenta.")
    private Float datumRodjenja;
    @Column(length = 40, nullable = false)
    @NotBlank(message = "Molimo vas unesite naziv fakulteta studenta.")
    private String fakultet;
    @Column(length = 40, nullable = false)
    @NotBlank(message = "Molimo vas unesite naziv studija studenta.")
    private String studij;

    public Student(){

    }

    public Student(Long id, String email, String firstname, String lastname, String adresa, Float datumRodjenja, String fakultet, String studij) {
        this.id = id;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.adresa = adresa;
        this.datumRodjenja = datumRodjenja;
        this.fakultet = fakultet;
        this.studij = studij;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public Float getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(Float datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public String getFakultet() {
        return fakultet;
    }

    public void setFakultet(String fakultet) {
        this.fakultet = fakultet;
    }

    public String getStudij() {
        return studij;
    }

    public void setStudij(String studij) {
        this.studij = studij;
    }
}
