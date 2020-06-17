package com.company;

public class Array {

    //    2.  In clasa LogicalOp, creati o metoda care sa scrie pe un array de 100 de pozitii, valorile de la 1 la 100.

//    Sa se afiseze progresul in consola pe tot parcursul.



    public int[] getArrayToHundred() {

        int[] myArray = new int[100];



        for (int i = 1; i <= 100; i++) {

            myArray[i - 1] = i;

        }

        return myArray;

    }



//    3. Creati o metoda care primeasca un parametru de tip array de numere intregi gol,

//    si sa il returneze populat cu toate valorile pare de la 1 la 100.



    public int[] getEvenArrayToHundred(int[] evenArray) {

        int j = 0;



        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {

                evenArray[j] = i;

                j++;

            }

        }

        return evenArray;

    }



//    4. Creati o metoda care sa primeasca un parametru de tip array de numere, si sa fie populat cu valori.

//    Metoda sa calculeze si sa returneze media numerelor din array.



    public float getAverageArray(int[] myArray) {

        float sum = 0;

        for (int i = 0; i < myArray.length; i++) {

            sum += myArray[i];

        }

        return (sum / myArray.length);

    }



//    5. Creati o metoda care sa primeasca un parametru de tip array de string-uri, populat cu valori, si un parametru de tip String.

//    Metoda sa verifice daca valoarea string-ului primit se regaseste in array-ul primit, iar daca da sa returneze true iar daca nu, sa returneze false.



    public boolean checkInArray(String[] arrString, String input) {



        for (int i = 0; i < arrString.length; i++) {

            if (arrString[i].equals(input)) {

                return true;

            }

        }

        return false;

    }



//    6. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar.

//    Metoda sa verifice daca numarul primit se afla in array-ul primit, si daca da, atunci sa returneze pozitia pe care se afla numarul.



    public int getPositionInArray(int[] Numbers, int nr) {

        for (int i = 0; i < Numbers.length; i++) {

            if (Numbers[i] == nr) {

                return i;

            }

        }

        return 0;

    }



//    7. Creati o metoda care sa afiseze urmatoarea grila, folosind un array:



    public void drawLines() {

        char[] line = {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-',};



        for (int i = 0; i <= 10; i++) {

            System.out.println(line);

        }

    }



//    8. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar.

//    Metoda sa verifice daca numarul exista in array, si daca da, sa returneze array-ul primit, fara acel numar.



    public int[] removeNrFromArray(int[] myArray, int nr) {

        int[] secondArray = new int[myArray.length];

        int j = 0;

        for (int i = 0; i < myArray.length; i++) {

            if (myArray[i] == nr)

                continue;

            secondArray[j++] = myArray[i];

        }

        int[] finArray = new int[j];



        for (int i = 0; i < j; i++)

            finArray[i] = secondArray[i];

        return finArray;

    }



//    9. Creati o metoda care sa primeasca un array, si sa returneze al doilea cel mai mic numar din array.



    public int getSecondSmallestNrInArray(int[] myArray) {

        int arrLen = myArray.length;

        int iMin = myArray[0];

        int i;

        for (i = 0; i < arrLen; i++) {

            if (myArray[i] < iMin)

                iMin = myArray[i];

        }



        int iMin2 = 2147483647;



        for (i = 0; i < arrLen; i++) {

            if (myArray[i] < iMin2 && myArray[i] != iMin)

                iMin2 = myArray[i];

        }



        return iMin2;

    }



//    10. Creati o metoda care sa primeasca doi parametrii: un array populat cu valori, si un array gol.

//    Metoda sa copieze toate valorile din primul array, parcurgandu-l, in cel de-al doilea.



    public int[] copyArray(int[] firstArray, int[] emptyArray) {



        for (int i = 0, j = 0; i < firstArray.length; i++) {

            emptyArray[j] = firstArray[i];

            j++;

        }

        return emptyArray;

    }
}
