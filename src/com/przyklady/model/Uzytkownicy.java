/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.przyklady.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author admin
 */
@Entity
@Table(name = "uzytkownicy")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Uzytkownicy.findAll", query = "SELECT u FROM Uzytkownicy u")
    , @NamedQuery(name = "Uzytkownicy.findByNazwaUzytkownika", query = "SELECT u FROM Uzytkownicy u WHERE u.nazwaUzytkownika = :nazwaUzytkownika")
    , @NamedQuery(name = "Uzytkownicy.findByHaslo", query = "SELECT u FROM Uzytkownicy u WHERE u.haslo = :haslo")
    , @NamedQuery(name = "Uzytkownicy.findByAdresEmail", query = "SELECT u FROM Uzytkownicy u WHERE u.adresEmail = :adresEmail")
    , @NamedQuery(name = "Uzytkownicy.findByIdUzytkownika", query = "SELECT u FROM Uzytkownicy u WHERE u.idUzytkownika = :idUzytkownika")})
public class Uzytkownicy implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "nazwaUzytkownika")
    private String nazwaUzytkownika;
    @Column(name = "haslo")
    private String haslo;
    @Column(name = "adres_email")
    private String adresEmail;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_uzytkownika")
    private Short idUzytkownika;

    public Uzytkownicy() {
    }

    public Uzytkownicy(Short idUzytkownika) {
        this.idUzytkownika = idUzytkownika;
    }

    public String getNazwaUzytkownika() {
        return nazwaUzytkownika;
    }

    public void setNazwaUzytkownika(String nazwaUzytkownika) {
        this.nazwaUzytkownika = nazwaUzytkownika;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    public String getAdresEmail() {
        return adresEmail;
    }

    public void setAdresEmail(String adresEmail) {
        this.adresEmail = adresEmail;
    }

    public Short getIdUzytkownika() {
        return idUzytkownika;
    }

    public void setIdUzytkownika(Short idUzytkownika) {
        this.idUzytkownika = idUzytkownika;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUzytkownika != null ? idUzytkownika.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Uzytkownicy)) {
            return false;
        }
        Uzytkownicy other = (Uzytkownicy) object;
        if ((this.idUzytkownika == null && other.idUzytkownika != null) || (this.idUzytkownika != null && !this.idUzytkownika.equals(other.idUzytkownika))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.przyklady.model.Uzytkownicy[ idUzytkownika=" + idUzytkownika + " ]";
    }
    
}
