package com.company;

public class loops {

    public void countHundred(int a) {

        for (int i = a; i <= 100; i++) {

            System.out.println(i);

        }

    }

    public void countMinusHundred(int a) {

        for (int i = a; i >= -100; i--) {

            System.out.println(i);

        }

    }

    public void countBetween(int a, int b) {

        for (int i = a; i <= b; i++) {

            System.out.println(i);

        }


        for (int i = a; i >= b; i--) {

            System.out.println(i);

        }

    }

    public void countBet(int a, int b) {

        if(a < b){

            for (int i = a; i <= b; i++) {

                System.out.println(i);

            }

        } else if(b < a){

            for (int i = b; i <= a; i++) {

                System.out.println(i);

            }

        }else{

            System.out.println("Numbers are equal");

        }

    }

    public void displayEvenNumbers() {

        for(int i = 0; i<= 100;i++){

            if(i % 2 == 0){

                System.out.println(i);

            }

        }

    }
    public void displayUnevenNumbers() {

        for(int i = 0; i<= 100;i++){

            if(i % 2 != 0){

                System.out.println(i);

            }

        }

    }

    public int returnSum(int a) {

        int sum = 0;

        for(int i = a; i<= 100;i++){

            sum += i;

        }

        return sum;

    }

    public int returnAverage(int a) {

        int sum = 0;

        int counter = 0;

        for(int i = a; i<= 100;i++){

            sum += i;

            counter ++;

        }

        return sum/counter;

    }

    public void printPattern() {

        for (int j = 7; j >= 1; j--) {

            String text = "";

            for (int i = j; i >= 1; i--) {

                text = text + "*";

            }

            System.out.println(text);

        }

    }


}
