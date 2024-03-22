// Date.java

package model;

public class Date{
    private int day;
    private int month;
    private int year;

    public Date(int pDay, int pMonth, int pYear){
        this.day = pDay;
        this.month = pMonth;
        this.year = pYear;
    }

    public String toString(){
        return day + "/" + month + "/" + year;
    }
}