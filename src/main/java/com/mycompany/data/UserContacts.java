
package com.mycompany.data;

import java.util.Objects;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


public class UserContacts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUserContacts; 
    private String Adres;
    private String City;
    private String Country;
    private String ZipCode;
    private String PhoneNumber;
    @ManyToOne
    @JoinColumn(name = "idUser")
    private Integer user_idUser;

    public UserContacts() {
    }

    public UserContacts(Integer idUserContacts, String Adres, String City, String Country, String ZipCode, String PhoneNumber, Integer user_idUser) {
        this.idUserContacts = idUserContacts;
        this.Adres = Adres;
        this.City = City;
        this.Country = Country;
        this.ZipCode = ZipCode;
        this.PhoneNumber = PhoneNumber;
        this.user_idUser = user_idUser;
    }

    public Integer getIdUserContacts() {
        return idUserContacts;
    }

    public void setIdUserContacts(Integer idUserContacts) {
        this.idUserContacts = idUserContacts;
    }

    public String getAdres() {
        return Adres;
    }

    public void setAdres(String Adres) {
        this.Adres = Adres;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String ZipCode) {
        this.ZipCode = ZipCode;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public Integer getUser_idUser() {
        return user_idUser;
    }

    public void setUser_idUser(Integer user_idUser) {
        this.user_idUser = user_idUser;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.idUserContacts);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UserContacts other = (UserContacts) obj;
        return Objects.equals(this.idUserContacts, other.idUserContacts);
    }

    @Override
    public String toString() {
        return "UserContacts{" + "idUserContacts=" + idUserContacts + ", Adres=" + Adres + ", City=" + City + ", Country=" + Country + ", ZipCode=" + ZipCode + ", PhoneNumber=" + PhoneNumber + ", user_idUser=" + user_idUser + '}';
    }
    
    
}
