package org.example.model;

import jakarta.persistence.*;



@Entity
public class Fournisseur {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String societe;
    private String adresse;
    private String contact;
    private String email;
    private String telephone;
    private String ville;
    private String ice;
    public Fournisseur() {
    }

    public Fournisseur(Long id, String ice, String ville, String email, String telephone, String contact, String adresse, String societe) {
        this.id = id;
        this.ice = ice;
        this.ville = ville;
        this.email = email;
        this.telephone = telephone;
        this.contact = contact;
        this.adresse = adresse;
        this.societe = societe;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIce() {
        return ice;
    }

    public void setIce(String ice) {
        this.ice = ice;
    }

    public String getSociete() {
        return societe;
    }

    public void setSociete(String societe) {
        this.societe = societe;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
