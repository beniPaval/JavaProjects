package com.company;

import java.util.List;

public class Lists {

    //1.Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din lista,

    // fiecare pe rand nou.



    public void printList(List<Integer> myList){

        for (int i = 0; i<myList.size(); i++){

            System.out.println(myList.get(i));

        }

    }

    //2.Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru sa fie o lista de numere,

    // si celalalt un numar (real sau intreg).

    // Metoda sa adauge numarul primit ca si parametru la final de lista.



    public void addNumberToList(List<Integer> myList, int number){

        myList.add(number);

    }

    //3.Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru de tip Lista, iar celalalt un

    // numar intreg.

    // Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou,

    // pornind de la numarul intreg primit ca si parametru.



    public void printListByIndex(List<Integer> myList, int position){

        for (int i = position;i < myList.size(); i++){

            System.out.println(myList.get(i));

        }

    }

    //4.Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din lista,

    // dar invers(de la capat la inceput).

    public void printListReversed(List<Integer> myList){

        for (int i= myList.size()-1; i >= 0;i--){

            System.out.println(myList.get(i));

        }

    }

    //5.Scrieti o metoda Java, care sa primeasca trei parametrii: unul de tip Lista de String-uri, unul de tip intreg,

    // si unul de tip String. Metoda sa adauge parametrul de tip String in lista primita, iar parametrul de tip intreg

    // reprezinta pozitia la care sa fie pus acel String.

    public void addStringToMyList(List<String> myList, int index, String text){

        myList.add(index,text);

    }

    //6.Scrieti o metoda Java, care sa primeasca doi parametrii. Primul dintre ei va fi o Lista, iar metoda

    // sa ia al doilea parametru si sa il adauge pe prima pozitie din lista.

    public void addNumbertoFirstIndex(List<Integer> myList, int number){

        myList.add(0,number);

    }

    //7.Scrieti o metoda Java care sa primeasca parametru o Lista, si sa afiseze ce valori are lista,

    // si ce pe ce pozitie. (Ex: “Pe pozitia 1 valoare este 4”).

    public void printListIndexAndElements(List<Integer> myList){

        for (int i = 0; i<myList.size(); i++)

            System.out.println("Index "+i+" are elementul "+myList.get(i));

    }

    ////8.Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.

    public int getBiggestValueFromList (List<Integer> myList){

        int biggest = myList.get(0);

        for (int i=0 ; i<myList.size(); i++){

            if (myList.get(i)>biggest){

                biggest = myList.get(i);

            }

        }

        return biggest;

    }


}
