package com.company;

public class Main {

    public static void main(String[] args) {
        printMyName();

        System.out.println("Rezultatul impartirii a doua numere, daca un numar nu este intreg: " + virgula(10, 3));

        System.out.println("Rezolvarea de la punctul a este: " + ex1(-5, 8, 6));

        System.out.println("Rezolvarea de la punctul b este: " + ex2(55, 9, 9));

        System.out.println("Rezolvarea de la punctul c este: " + ex3(20, -3, 5, 8));

        System.out.println("Rezolvarea de la punctul d este: " + ex4(5, 15, 3, 2, 8, 3));

        java();

        System.out.println("Rezultatul mediei a trei numere este: " + medie(7, 2, 3));

        face();

        System.out.println("Rezultatul restului impartirii a doua numere este: " + rest(22,6));

        System.out.println("Rezultatul transformarii din F in C este: " + grade(55));

        System.out.println("Rezultatul transformarii din inch in m este: " + inch(100));


    Calculator myObject = new Calculator();
        System.out.println("Rezultatul adunarii este: "+ myObject.adunare(7,8));

        System.out.println("Rezultatul scaderii este: "+ myObject.scadere(10,8));

        System.out.println("Rezultatul inmultirii este: "+ myObject.inmultire(2,2));

        System.out.println("Rezultatul impartirii este: "+ myObject.impartire(14,2));

        LogicalOp op = new LogicalOp();
        int higher = op.checkBiggerNumber(7,8);
        System.out.println("Numarul cel mai mare este: " + higher);
        String text = "FastTrackIT";
        System.out.println(op.checkTextFast(text));
        String textt = "FastTrackITs";
        System.out.println(op.checkText(textt,7));
        System.out.println(op.checkNumb(5));
        System.out.println(op.checkNumb4(0));
        System.out.println(op.caseN(1));
        System.out.println(op.isNumberEven(266));
        System.out.println(op.isEligibleToVote(19));
        System.out.println(op.biggest(10,20,5));


    }


    public static void printMyName(){
        System.out.println("Hello \n Beni");
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
