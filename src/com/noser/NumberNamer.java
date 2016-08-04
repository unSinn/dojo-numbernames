package com.noser;

import java.util.ArrayList;

/**
 * Created by fabian on 8/4/16.
 */
public class NumberNamer {

    ArrayList<String> words;

    String printNumberName(int z) {
        words = new ArrayList<>();
        if (z == 0) {
            words.add("zero");
        } else {
            if (z <= 20) {
                words.add(getBelowTwenty(z));
            } else {
                getHunderter(z);
                words.add(getZehner(z));
                words.add(getEiner(z));
            }
        }

        words.removeIf(s -> s.equals(""));
        return String.join(" ", words);
    }

    private String getBelowTwenty(int z) {
        switch (z) {
            case 0:
                return "";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
            case 20:
                return "twenty";
        }
        return "ERROR BELOWTWENTY";
    }

    public String getEiner(int z) {
        int einer = z % 10;
        return getBelowTwenty(einer);
    }

    public String getHunderter(int z) {
        int hundred = (z / 100) % 10;
        words.add(getBelowTwenty(hundred));
        if (hundred != 0) {
            words.add("hundred");
        }
        return "";
    }

    public String getZehner(int z) {
        int zehner = (z / 10) % 10;
        switch (zehner) {
            case 0:
                return "";
            case 2:
                return "twenty";
            case 3:
                return "thirty";
            case 4:
                return "fourty";
            case 5:
                return "fifty";
            case 6:
                return "sixty";
            case 7:
                return "seventy";
            case 8:
                return "eighty";
            case 9:
                return "ninety";
        }
        return "ERROR ZEHNER";
    }
}
