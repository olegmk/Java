package com.softserve.academy;

public abstract class FlyingBird extends Bird{

    protected int maxHeight;

    public int getMaxHeight() {
        return maxHeight;
    }

    public boolean fly() {
        return true;
    }

    public String getType() {
        return "Flying bird";
    }

}