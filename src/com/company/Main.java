package com.company;

public class Main {

    public static void main(String[] args) {
        printMyName();

        System.out.println("Rezultatul adunarii este: " + adunare(7, 8));

        System.out.println("Rezultatul impartirii a doua numere, daca un numar nu este intreg: " + virgula(10, 3));

        System.out.println("Rezolvarea de la punctul a este: " + ex1(-5, 8, 6));

        System.out.println("Rezolvarea de la punctul b este: " + ex2(55, 9, 9));

        System.out.println("Rezolvarea de la punctul c este: " + ex3(20, -3, 5, 8));

        System.out.println("Rezolvarea de la punctul d este: " + ex4(5, 15, 3, 2, 8, 3));

        System.out.println("Rezultatul scaderii este: " + scadere(10, 8));

        System.out.println("Rezultatul inmultirii este: " + inmultire(2, 2));

        System.out.println("Rezultatul impartirii este: " + impartire(14, 2));

        java();

        System.out.println("Rezultatul mediei a trei numere este: " + medie(7, 2, 3));

        face();

        System.out.println("Rezultatul restului impartirii a doua numere este: " + rest(22,6));

        System.out.println("Rezultatul transformarii din F in C este: " + grade(55));

        System.out.println("Rezultatul transformarii din inch in m este: " + inch(100));






    }


    public static void printMyName(){
        System.out.println("Hello \n Beni");
    }



    public static int adunare(int z, int y){
        int rezultat = z + y;
        return rezultat;
    }

    public static float virgula (float a, float b){
      float rezultat2 = a / b;
      return rezultat2;
    }

    public static int ex1(int z, int y, int w){
        int a = z + y * w;
        return a;
    }

    public static int ex2(int z, int y, int w){
        int b = (z+y) % w;
        return b;
    }

    public static float ex3(int z, int y, int w, float q){
        float c = z + y*w / q;
        return c;
    }

    public static int ex4(int z, int y, int w, int q, int r, int t){
        int d = z + y / w * q - r % t;
        return d;
    }

    public static int scadere(int z, int y){
        int rezultat = z - y;
        return rezultat;
    }

    public static int inmultire(int z, int y){
        int rezultat = z * y;
        return rezultat;
    }
    public static int impartire(int z, int y){
        int rezultat = z / y;
        return rezultat;
    }

    public static void java(){
        System.out.println("   J     a    V      V    a");
        System.out.println("   J    a a    V    V    a a");
        System.out.println("J  J   aaaaa    V V     aaaaa");
        System.out.println(" JJ   a     a    V     a     a");
    }
    public static int medie(int z, int y, int w){
        int rezultat = (z+y+w) / 3;
        return rezultat;
    }

    public static void face(){
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");
    }

    public static int rest(int z, int y){
        int rezultat = z % y;
        return rezultat;
    }

    public static float grade(float F){
        float rezultat = (F - 32) * 5/9;
        return rezultat;
    }
    public static double inch(double I){
        double rezultat =  I / 39.370;
        return rezultat;
    }

   

}
