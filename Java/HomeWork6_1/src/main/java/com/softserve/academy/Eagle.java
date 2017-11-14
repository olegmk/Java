package com.softserve.academy;

public class Eagle extends FlyingBird {

    public Eagle() {
        mass = 3000;
        eggs = 4;
        maxHeight = 5000;
    }

    @Override
    public String getName() {
        return "Eagle";
    }
}
