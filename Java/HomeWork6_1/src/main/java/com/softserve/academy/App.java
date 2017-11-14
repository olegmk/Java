package com.softserve.academy;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Bird bird1 = new Eagle();
        Bird bird2 = new Swallow();
        Bird bird3 = new Penguin();
        Bird bird4 = new Kiwi();

        ArrayList<Bird> a = new ArrayList<Bird>();

        a.add(bird1);
        a.add(bird2);
        a.add(bird3);
        a.add(bird4);

        for(int i=0; i<4; i+=1) {
            Bird b = a.get(i);

            System.out.println("name = " + b.getName());
            System.out.println("type = " + b.getType());
            System.out.println("Mass = " + b.getMass());
            System.out.println("Eggs = " + b.getEggs());

            if (b.fly() || b instanceof FlyingBird) {
                FlyingBird fb = (FlyingBird) b;
                System.out.println("Max flying height = " + fb.getMaxHeight());
            }
        }
    }
}
