//
// This file was generated by the JPA Modeler
//
package fr.trendev.postalhelper.entities;

import java.io.Serializable;



public class PostalCodeFRPK implements Serializable {

    private String code;

    private String town;

    public PostalCodeFRPK(){
    }

    public PostalCodeFRPK(String code,String town){
        this.code=code;
        this.town=town;
    }


   public String getCode() {
        return this.code;
    }

    public void setCode (String code) {
        this.code = code;
    }

   public String getTown() {
        return this.town;
    }

    public void setTown (String town) {
        this.town = town;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {return false;}
        if (!java.util.Objects.equals(getClass(), obj.getClass())) {return false;}
        final PostalCodeFRPK other = (PostalCodeFRPK) obj;
        if (!java.util.Objects.equals(this.getCode(), other.getCode())) {        return false;        }
        if (!java.util.Objects.equals(this.getTown(), other.getTown())) {        return false;        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (this.getCode() != null ? this.getCode().hashCode() : 0);
        hash = 97 * hash + (this.getTown() != null ? this.getTown().hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "PostalCodeFRPK{" + " code=" + code + ", town=" + town + '}';
    }

}
