//Pet.java
package model;
// import java.util.Date;

public class Pet{
    private String name;
    private String birthDate;
    private String color;
    private String dateOfAdoption;
    private double size;
    private String typeFood;



    public Pet(String pName, String bDate, String pColor, String dateOA, double pSize, String typeFood){
            this.name = pName;
            this.birthDate = bDate;
            this.color = pColor;
            this.dateOfAdoption = dateOA;
            this.size = pSize;
            this.typeFood = typeFood;
        }

    public String toString(){
        return "Pet, name =" + name + ", Birth Date= " + birthDate + ", Color= " + color + ", Date of Adoption: " + dateOfAdoption + ", Size= " + size + ", Type Food= " + typeFood;
    }
}