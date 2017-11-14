package com.softserve.academy;

public class Penguin extends NonFlyingBird {

    public void Swallow (boolean feathers, boolean layEggs){
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    @Override
    public String getName() {
        return "Penguin";
    }
}
