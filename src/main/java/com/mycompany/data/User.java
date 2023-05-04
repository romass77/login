package com.mycompany.data;

import java.util.Date;
import java.util.Objects;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUser;
    private String Email;
    private byte Password;
    private Date createdDate;
    @ManyToOne
    @JoinColumn(name = "idright")
    private Integer right_idright;

    public User() {
    }

    public User(Integer idUser, String Email, byte Password, Date createdDate, Integer right_idright) {
        this.idUser = idUser;
        this.Email = Email;
        this.Password = Password;
        this.createdDate = createdDate;
        this.right_idright = right_idright;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public byte getPassword() {
        return Password;
    }

    public void setPassword(byte Password) {
        this.Password = Password;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getRight_idright() {
        return right_idright;
    }

    public void setRight_idright(Integer right_idright) {
        this.right_idright = right_idright;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.idUser);
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
        final User other = (User) obj;
        return Objects.equals(this.idUser, other.idUser);
    }

    @Override
    public String toString() {
        return "User{" + "idUser=" + idUser + ", Email=" + Email + ", Password=" + Password + ", createdDate=" + createdDate + ", right_idright=" + right_idright + '}';
    }
    
    

}
