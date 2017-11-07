package com.softserve.academy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Person prs1 = new Person("Ivan","1970");




        System.out.println("Name: " + prs1.getName() + ". Age: " + prs1.getBirthYear());
//        System.out.println(prs1.getBirthYear());
        System.out.println(prs1.count);


    }
}
