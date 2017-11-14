package com.softserve.academy;

public class Kiwi extends NonFlyingBird {

    public void Swallow (boolean feathers, boolean layEggs){
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    @Override
    public String getName() {
        return "Kiwi";
    }
}
