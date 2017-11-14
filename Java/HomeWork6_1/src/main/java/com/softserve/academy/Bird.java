package com.softserve.academy;

public abstract class Bird {
    protected boolean feathers;
    protected boolean layEggs;
    protected int mass;
    protected int eggs;

    public abstract boolean fly();

    public abstract String getName();
    public abstract String getType();

    public boolean isFeathers() {
        return feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    public int getMass() {
        return mass;
    }

    public int getEggs() {
        return eggs;
    }
}





