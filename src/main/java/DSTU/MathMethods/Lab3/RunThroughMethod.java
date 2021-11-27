package DSTU.MathMethods.Lab3;

import java.util.Arrays;

public class RunThroughMethod {
    public static void rtMethod(double[][] arr) {

        int n = arr.length - 1;

        double[] B = new double[arr.length];
        double[] A = new double[arr.length];
        double[] C = new double[arr.length];
        double[] F = new double[arr.length];
        double y;
        double[] alphas = new double[arr.length];
        double[] betas = new double[arr.length];
        double[] x = new double[arr.length];
        //set up mid
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            B[j] = arr[i][j];
            j += 1;
        }
        //set up low
        A[0] = 0;
        j = 1;
        for (int i = 1; i < arr.length; i++) {
            A[j] = arr[i][j - 1];
            j += 1;
        }
        //set up upper
        j = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            C[i] = arr[i][j];
            j += 1;
        }
        C[C.length - 1] = 0;
        //set ans diag
        for (int i = 0; i < arr.length; i++) {
            F[i] = arr[i][arr.length];
        }


        //Straight
        y = B[0];
        alphas[0] = -1 * ((C[0]) / (y));
        betas[0] = F[0] / y;

        for (int i = 1; i < n; i++) {
            y = B[i] + A[i] * alphas[i - 1];
            alphas[i] = -1 * ((C[i]) / (y));
            betas[i] = ((F[i] - A[i] * betas[i - 1]) / (y));
        }
        y = B[n] + A[n] * alphas[n - 1];
        betas[n] = ((F[n] - A[n] * betas[n - 1]) / y);
        x[n]=betas[n];
        for(int i=n-1;i>-1;i--){
            x[i]=alphas[i]*x[i+1]+betas[i];
        }
        for(int i=0;i< x.length;i++){
            x[i]=Math.round(x[i]);
        }
        System.out.println(Arrays.toString(x));
    }

}
/*
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
* */
