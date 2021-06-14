package com.company;

public class CompareCoin {
    public void compareDiameter(Coin2 first, Coin2 second) {
        double delta = first.getDiameter() - second.getDiameter();
        if (delta > 0) {
            System.out.println("The first coin is more than the second for " + delta);

        } else if (delta == 0) {
            System.out.println("Coins have the same diameter");
        } else {
            System.out.println("The second coin is more than first on " + delta);
        }
    }

    public int compareCoin2(Coin2 first, Coin2 second) {
        int result = 0;
        double delta = first.getDiameter() - second.getDiameter();
        if (delta > 0) {
            result = 1;
        } else if (delta == 0) {
            result = 0;
        } else {
            result = -1;
        }
        return result;
    }
}
