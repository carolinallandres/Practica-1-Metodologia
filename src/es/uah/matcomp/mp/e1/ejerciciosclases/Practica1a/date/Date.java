package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1a.date;

public class Date {
    //Atributos de la clase
    private int day;
    private int month;
    private int year;

    public Date (int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //Getters y Setters
    public int getDay () { return day;}

    public int getMonth () { return month;}

    public int getYear () { return year;}

    public void setDay (int day) {this.day = day;}

    public void setMonth (int month) {this.month = month;}

    public void setYear (int year) {this.year = year;}

    //Establece la fecha completa
    public void setDate (int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString () {
        if(day<=31 && month <= 12){
            return String.format("%02d/%02d/%02d",day,month,year);
        }
        return null;
    }
}
