package com.mycompany.data;

import java.util.Objects;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Righ {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idright;
    private String description;
    private boolean rightactive;

    public Righ() {
    }

    public Righ(Integer idright, String description) {
        this.idright = idright;
        this.description = description;
    }

    public Integer getIdright() {
        return idright;
    }

    public void setIdright(Integer idright) {
        this.idright = idright;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isRightactive() {
        return rightactive;
    }

    public void setRightactive(boolean rightactive) {
        this.rightactive = rightactive;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.idright);
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
        final Righ other = (Righ) obj;
        return Objects.equals(this.idright, other.idright);
    }

    @Override
    public String toString() {
        return "Righ{" + "idright=" + idright + ", description=" + description + ", rightactive=" + rightactive + '}';
    }

}
