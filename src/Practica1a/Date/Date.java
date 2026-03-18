package Practica1a.Date;

public class Date {
    private int day;
    private int month;
    private int year;

    //Tanto en setters como en el constructor si metes un formato inválido
    //la fecha queda a 00/00/0000

    //CONSTRUCTORES

    public Date (int day,int month,int year){
        setDate(day,month,year);
    }

    //GETTERS

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    //SETTERS

    public void setDay(int day) {
        if (day>=1 && day<=31){
            this.day=day;
        }
    }

    public void setMonth(int month) {
        if (month>=1 && month<=12){
            this.month=month;
        }
    }

    public void setYear(int year) {
        if (year>=1900 && year<=9999){
            this.year=year;
        }
    }

    public void setDate(int day,int month,int year){
        if (day>=1 && day<=31 && month>=1 && month<=12 && year>=1900 && year<=9999){
            this.day=day;
            this.month=month;
            this.year=year;
        }
    }

    //MÉTODOS

    public String toString(){
        String d;
        if(day<10){
            d="0"+day;
        }
        else{
            d=""+day;
        }
        String m;
        if(month<10){
            m="0"+month;
        }
        else{
            m=""+month;
        }
        String y;
        if(year==0){
            y="0000";
        }
        else{
            y=""+year;
        }
        return d+"/"+m+"/"+y;
    }
}
