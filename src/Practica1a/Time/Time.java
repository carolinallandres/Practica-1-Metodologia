package Practica1a.Time;

public class Time {
    private int hour;
    private int minute;
    private int second;

    //Tanto en setters como en el constructor si metes un formato inválido
    //la hora queda a 00:00:00

    //CONSTRUCTORES

    public Time (int hour,int minute,int second){
        setTime(hour,minute,second);
    }

    //GETTERS

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    //SETTERS

    public void setHour(int hour) {
        if (hour>=0 && hour<=23){
            this.hour=hour;
        }
    }

    public void setMinute(int minute){
        if (minute>=0 && minute<=59){
            this.minute=minute;
        }
    }

    public void setSecond(int second) {
        if (second>=0 && second<=59){
            this.second=second;
        }
    }

    public void setTime(int hour,int minute,int second){
        if (hour>=0 && hour<=23 && minute>=0 && minute<=59 && second>=0 && second<=59){
            this.hour=hour;
            this.minute=minute;
            this.second=second;
        }
    }


    //MÉTODOS

    public String toString(){
        String h;
        if(hour<10){
            h="0"+hour;
        }
        else{
            h=""+hour;
        }
        String m;
        if(minute<10){
            m="0"+minute;
        }
        else{
            m=""+minute;
        }
        String s;
        if(second<10){
            s="0"+second;
        }
        else{
            s=""+second;
        }
        return h+":"+m+":"+s;
    }

    public Time nextSecond(){
        second+=1;
        if(second==60){
            second=0;
            minute+=1;
            if (minute==60){
                minute=0;
                hour+=1;
                if (hour==24){
                    hour=0;
                }
            }
        }
        return this;
    }

    public Time previousSecond(){
        second-=1;
        if(second<0){
            second=59;
            minute-=1;
            if (minute<0){
                minute=59;
                hour-=1;
                if (hour<0){
                    hour=23;
                }
            }
        }
        return this;
    }
}

