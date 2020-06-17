package com.company;

public class whileLoops {
    public void countToHundredWhile(int givenNumber) {

        while (givenNumber <= 100) {

            System.out.println(givenNumber);

            givenNumber++;

        }

    }

    public void countBackwardsWhile(int givenNumber) {

        while (givenNumber >= -100) {

            System.out.println(givenNumber);

            givenNumber--;

        }

    }

    public void countBetweenWhile(int firstNumber, int secondNumber) {

        while (firstNumber <= secondNumber) {

            System.out.println(firstNumber);

            firstNumber++;

        }

    }

    public void countBetweenW(int firstNumber, int secondNumber) {

        if(firstNumber < secondNumber){

            while (firstNumber <= secondNumber) {

                System.out.println(firstNumber);

                firstNumber++;

            }

        }

        else if(secondNumber < firstNumber){

            while (secondNumber <= firstNumber) {

                System.out.println(firstNumber);

                firstNumber++;

            }

        }

        else{

            System.out.println("The numbers are equal");

        }

    }

    public void evenNumbersWhile() {

        int number = 1;

        while (number <= 100) {

            number++;

            if (number % 2 == 0) {

                System.out.println(number);

            }

        }

    }

    public void unevenNumbersWhile() {

        int number = 1;

        while (number <= 100) {

            number++;

            if (number % 2 != 0) {

                System.out.println(number);

            }

        }

    }

    public void sumAndAverageWhile() {

        int firstNumber = 111;

        int secondNumber = 8899;

        double sum = 0;

        int count = 0;



        while (firstNumber <= secondNumber) {

            sum += firstNumber;

            firstNumber++;

            count++;

        }

        System.out.println(sum);

        double average = sum / count;

        System.out.println("The average of the numbers is: " + average);

    }

    public float divideBySevenWhile(int firstNumber, int lastNumber) {

        float count = 0F;

        float sum = 0F;

        while (firstNumber <= lastNumber) {

            if (firstNumber % 7 == 0) {

                count ++;

                sum += firstNumber;

            }

            firstNumber++;

        }

        float average = sum / count;

        return average;

    }

    public void fibonacci() {

        int count = 20;

        int num1 = 0;

        int num2 = 1;



        int i=1;

        while(i<=count)

        {

            System.out.print(num1+" ");

            int sumOfPrevTwo = num1 + num2;

            num1 = num2;

            num2 = sumOfPrevTwo;

            i++;

        }

    }

    public void wozaCozaLoza() {

        int i = 1;

        while (i <= 110) {

            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {

                System.out.print("CozaLozaWoza ");

            } else if (i % 5 == 0 && i % 7 == 0) {

                System.out.print("WozaLoza ");

            } else if (i % 3 == 0 && i % 7 == 0) {

                System.out.print("CozaWoza ");

            } else if (i % 3 == 0 && i % 5 == 0) {

                System.out.print("CozaLoza ");

            } else if (i % 7 == 0) {

                System.out.print("Woza ");

            } else if (i % 5 == 0) {

                System.out.print("Loza ");

            } else if (i % 3 == 0) {

                System.out.print("Coza ");

            } else {

                System.out.print(i + " ");

            }

            if (i % 11 == 0) {

                System.out.println();

            }

            i++;

        }

    }



}
