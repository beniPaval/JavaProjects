package com.company;

public class LogicalOp {

    public int checkBiggerNumber(int first, int second) {
        if (first < second) {
            return second;
        } else {
            return first;
        }
    }

    public String checkTextFast(String text) {
        if (text.equals("FastTrackIT")) {
            return ("Learning text comparison");
        } else {
            return ("Got to try some more");

        }
    }

    public String checkText(String text, int x) {
        if (text.equals("FastTrackIT") && x <= 3) {
            var s = text + x;
            return s;
        } else if (!text.equals("FastTrackIT") && x >= 4) {
            var a = x + text;
            return a;
        }
        return "Got to try some more";
    }

    public String checkNumb(int x) {
        if (x > 8 || x == 6) {
            return ("The amount of snow this winter was(cm): " + x);
        } else {
            return ("The forecast snow is(cm): " + x);
        }

    }

    public String checkNumb4(int x) {
        if (x > 3 && x != 4) {
            return ("The number is greater than 3 and not equal to 4");
        } else if (x == 4) {
            return ("The number is equal to 4");
        } else if (x < 3) {
            return ("The number is lower than 3");
        } else {
            return "Got to try some more";
        }
    }


    public String caseN(int x) {
        switch (x) {
            case 1:
                return "The number is: 1!";
            case 2:
                return "The number is: 2!";
            case 3:
                return "The number is: 3!";
            default:
                return "Neither of the cases.";
        }
    }


    public boolean isNumberEven (int x){
        if ((x % 2) == 0) {
            return true;
        }else {
            return false;
        }
    }

    public boolean isEligibleToVote (int x){
        if (x > 18){
            return true;
        } else
            return false;
    }

    public int biggest (int x, int y, int w){
        if (x > y){
            return x;
        } else if (y > w){
            return y;
        } else {
            return w;
        }
    }
}
