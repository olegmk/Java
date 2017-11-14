package com.softserve.academy;

public abstract class NonFlyingBird extends Bird {

    public boolean fly() {
        return false;
    }

    public String getType() {
        return "Nonflying bird";
    }

}
