package com.company;

public class CoinMain {
    public static void main(String[] args) {
        Coin2 coin1 = new Coin2();
        coin1.setDiameter(-0.11);
        coin1.setDiameter(0.12);
        coin1.setWeight(150);
        Coin2 coin2 = new Coin2();
        coin2.setDiameter(0.21);
        coin2.setWeight(170);
        CompareCoin compare = new CompareCoin();
        compare.compareDiameter(coin1, coin2);

    }
}
