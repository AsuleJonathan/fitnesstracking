package com.asule.app.model.entity;

public class Lowerbody {
    private int squats;
    private int hipthrust;
    private int legpress;
    
    public Lowerbody(int squats, int hipthrust, int legpress) {
        this.squats = squats;
        this.hipthrust = hipthrust;
        this.legpress = legpress;
    }
    public Lowerbody() {
    }
    public int getSquats() {
        return squats;
    }
    public void setSquats(int squats) {
        this.squats = squats;
    }
    public int getHipthrust() {
        return hipthrust;
    }
    public void setHipthrust(int hipthrust) {
        this.hipthrust = hipthrust;
    }
    public int getLegpress() {
        return legpress;
    }
    public void setLegpress(int legpress) {
        this.legpress = legpress;
    }
    
}
