package es.uah.matcomp.mp.e1.ejerciciosclases.practica_a.g;

public class Time {

    private int hour;
    private int minute;
    private int second;

    private String resultado;

    public Time (int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour () {return hour;}
    public int getMinute () {return minute;}
    public int getSecond () {return second;}

    public void setHour (int hour) {this.hour = hour;}
    public void setMinute (int minute) {this.minute = minute;}
    public void setSecond (int second) {this.second = second;}

    public void setTime (int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString () {
        if (this.hour < 10) {
            if (this.minute < 10) {
                if (this.second < 10) {
                    resultado = ("0" + this.hour + ":0" + this.minute + ":0" + this.second);
                } else {
                    resultado = ("0" + this.hour + ":0" + this.minute + ":" + this.second);
                }
            } else {
                if (this.second < 10) {
                    resultado = ("0" + this.hour + ":" + this.minute + ":0" + this.second);
                } else {
                    resultado = ("0" + this.hour + ":" + this.minute + ":" + this.second);
                }
            }
        }
        else {
            if (this.minute < 10) {
                if (this.second < 10) {
                    resultado = (this.hour + ":0" + this.minute + ":0" + this.second);
                } else {
                    resultado = (this.hour + ":0" + this.minute + ":" + this.second);
                }
            } else {
                if (this.second < 10) {
                    resultado = (this.hour + ":" + this.minute + ":0" + this.second);
                } else {
                    resultado = (this.hour + ":" + this.minute + ":" + this.second);
                }
            }
        }
        return resultado;
    }

    public Time nextSecond () {
            this.second = this.second+1;

            if (this.second == 60) {
                this.second = 0;
                this.minute = this.minute+1;

                if (this.minute == 60) {
                    this.minute = 0;
                    this.hour = this.hour+1;

                    if (this.hour == 24) {
                        this.hour = 0;
                    }
                }
            }
            return this;
    }

    public Time previousSecond() {
        this.second = this.second -1;

        if (this.second < 0) {
            this.second = 59;
            this.minute = this.minute -1;

            if (this.minute < 0) {
                this.minute = 59;
                this.hour = this.hour -1;

                if (this.hour < 0) {
                    this.hour = 23;
                }
            }
        }
        return this;
    }

}
