package com.cydeo;

import static com.cydeo.Currency.PENNY;

public class Main {
    public static void main(String[] args) {


        System.out.println("How to access a constant");

        Currency c = Currency.DIME;
        System.out.println(c);
        System.out.println(PENNY);


        System.out.println("How to get all constant");
        Currency[] currencies = Currency.values();

        for (Currency currency : currencies) {
            System.out.println(currency);
        }


        System.out.println("How to use switch_case with enums");

        switch (Currency.PENNY) {
            case PENNY:
                System.out.println("It's a 1 cent");
                break;
            case NICKLE:
                System.out.println("It's 5 cent");
                break;
            case DIME:
                System.out.println("It's 10 cent");
                break;
            case QUARTER:
                System.out.println("It's 25 cent");
                break;

        }




    }

    private static void calculate(double x, double y, MethOperations operation){



        switch(operation){
            case PLUS:
                System.out.println(x+y);
                break;
            case MINUS:
                System.out.println(x-y);
                break;
            case MULTIPLY:
                System.out.println(x*y);
                break;
            case DIVIDE:
                System.out.println(x/y);
                break;


        }
    }
}
