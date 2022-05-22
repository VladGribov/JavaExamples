package com.java.practice;

public class Clock implements Runnable{
    /*Three instance variables for the hours (range 0 - 23), minutes (range 0 - 59), and seconds (range 0 - 59).
     * Three constructors:
     * default (with no parameters passed; is should initialize the represented time to 12:00:00)
     * a constructor with three parameters: hours, minutes, and seconds.
     * a constructor with one parameter: the value of time in seconds since midnight (it should be converted into the time value in hours, minutes, and seconds)*/
    int hour;
    int minutes;
    int seconds;

    Clock() {
        this.hour = 12;
        this.minutes = 0;
        this.seconds = 0;
    }

    Clock(int hour, int minutes, int seconds) {
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    Clock(int seconds) {
        setClock(seconds);
    }
    /*Instance methods:
     * a set-method method setClock() with one parameter seconds since midnight (to be converted into the time value in hours, minutes, and seconds as above).
     * get-methods getHours(), getMinutes(), getSeconds() with no parameters that return the corresponding values.
     * set-methods setHours(), setMinutes(), setSeconds() with one parameter each that set up the corresponding instance variables.*/

    public void setClock(int seconds) {
        //1 day = 24 hours
        //1 hour = 60 minutes
        //1 minute = 60 seconds
        this.hour = seconds / 3600 % 24;
        this.minutes = (seconds % 3600) / 60;
        this.seconds = (seconds % 3600) % 60;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getHour() {
        return hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    //method tick() with no parameters that increments the time stored in a Clock object by one second.
    //Add an instance method tickDown() which decrements the time stored in a Clock object by one second.
    public void tickUp() {
        this.seconds++;
        updateClock();
    }

    public void tickDown() {
        this.seconds--;
        if (this.seconds == -1) {
            this.seconds = 59;
            this.minutes--;
            if (this.minutes == -1) {
                this.minutes = 59;
                this.hour--;
                if (this.hour == -1) {
                    this.hour = 23;
                }
            }
        }
        updateClock();
    }

    //method addClock() accepting an object of type Clock as a parameter. The method should add the time represented by the parameter class to the time represented in the current class. (3hr,2min,1sec + 1hr,57min,59sec = 5hr,0min,0sec)
    public void addClock(Clock clock) {
        setClock(convertToSeconds(this) + convertToSeconds(clock));
    }

    public void subtractClock(Clock clock) {
        setClock(convertToSeconds(this) - convertToSeconds(clock));
        if (this.seconds < 0) {
            this.seconds = 60 + this.seconds;
            this.minutes--;
        }
        if (this.minutes < 0) {
            this.minutes = 60 + this.minutes;
            hour--;
        }
        if (this.hour < 0) {
            this.hour = 24 + this.hour;
        }
    }

    public void updateClock() {
        setClock(convertToSeconds(this));
    }

    public int convertToSeconds(Clock clock) {
        return clock.hour * 3600 + clock.minutes * 60 + clock.seconds;
    }

    //Add an instance method toString() with no parameters to your class. toString() must return a String representation of the Clock object in the form "(hh:mm:ss)", for example "(03:02:34)".
    @Override
    public String toString() {
        String hour;
        String minutes;
        String seconds;
        if (this.hour < 10) {
            hour = '0' + String.valueOf(this.hour);
        } else {
            hour = String.valueOf(this.hour);
        }

        if (this.minutes < 10) {
            minutes = '0' + String.valueOf(this.minutes);
        } else {
            minutes = String.valueOf(this.minutes);
        }

        if (this.seconds < 10) {
            seconds = '0' + String.valueOf(this.seconds);
        } else {
            seconds = String.valueOf(this.seconds);
        }
        return hour + ":" + minutes + ":" + seconds;
    }




    //ignore this
    Thread thread;
    public void runThread(){
        thread = new Thread(this);
        thread.start();
    }
    public void update(){
        tickUp();
        System.out.println(this);
    }

    @Override
    public void run() {
        double div = 1;
        double interval = 1000000000 / div; //0.01666 seconds
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;
        while (thread != null) {
            currentTime = System.nanoTime();

            delta += (currentTime - lastTime) / interval;
            lastTime = currentTime;

            if (delta >= 1) {
                update();
                delta--;
            }
        }
    }
}
