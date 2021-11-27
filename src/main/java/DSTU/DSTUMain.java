package DSTU;

import DSTU.MathMethods.Lab3.RunThroughMethod;

public class DSTUMain {
    public static void main(String[] args) {
        double[][] STATICGauss = new double[3][4];
        //
        STATICGauss[0][0] = 2;
        STATICGauss[0][1] = 3;
        STATICGauss[0][2] = -1;
        STATICGauss[0][3] = -6;

        //
        STATICGauss[1][0] = -1;
        STATICGauss[1][1] = 2;
        STATICGauss[1][2] = 1;
        STATICGauss[1][3] = 5;

        //
        STATICGauss[2][0] = 1;
        STATICGauss[2][1] = 6;
        STATICGauss[2][2] = 3;
        STATICGauss[2][3] = -1;

        double[][] STATICRT = new double[4][5];

//s1
        STATICRT[0][0] = 4;
        STATICRT[0][1] = -2;
        STATICRT[0][2] = 0;
        STATICRT[0][3] = 0;
        STATICRT[0][4] = 6;

        STATICRT[1][0] = -1;
        STATICRT[1][1] = 5;
        STATICRT[1][2] = -2;
        STATICRT[1][3] = 0;
        STATICRT[1][4] = -10;

        STATICRT[2][0] = 0;
        STATICRT[2][1] = -3;
        STATICRT[2][2] = 4;
        STATICRT[2][3] = -1;
        STATICRT[2][4] = 10;

        STATICRT[3][0] = 0;
        STATICRT[3][1] = 0;
        STATICRT[3][2] = -2;
        STATICRT[3][3] = 7;
        STATICRT[3][4] = 3;

        RunThroughMethod.rtMethod(STATICRT);
    }
}
