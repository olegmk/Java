package com.softserve.academy;

//import java.util.Scanner;


public class App 
{

    public static void main( String[] args )
    {
        //String cnt;
        //Country country1 = new Country("Germany");


        Continent continent;
        Continent Ukraine = Continent.EUROPE;
        Continent Germany = Continent.EUROPE;
        Continent Kanada = Continent.NOTHERN_AMERICA;
        Continent Columbia = Continent.SOUTH_AMERICA;
        Continent NewZelland = Continent.AUSTRALLIA;
        Continent China = Continent.ASIA;

        System.out.println("Ukraine is " + Ukraine);
        System.out.println("Germany is " + Germany);
        System.out.println("Kanada is " + Kanada);
        System.out.println("Columbia is " + Columbia);


        /*System.out.println(country1.getCountry());
        System.out.println(Germany);

        if (country1.equals(Germany)){
            System.out.println(Germany);
        } //else if (country1.equals(Germany)){
            //System.out.println(Germany);
        //}
        else {
            System.out.println("Country out of list");
        }*/

    }

}
