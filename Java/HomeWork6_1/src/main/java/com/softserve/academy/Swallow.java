package com.softserve.academy;

public class Swallow extends FlyingBird {

    Swallow(){
        mass = 29;
        eggs = 6;
        maxHeight = 1000;
    }

    /*public void Swallow (boolean feathers, boolean layEggs){
        this.feathers = feathers;
        this.layEggs = layEggs;
    }*/

    @Override
    public String getName() {
        return "Swallow";
    }
}
