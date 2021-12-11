package DSTU.MathMethods.Lab3;

import java.util.Arrays;

public class LUDecompose {
    public static void luDecompose(double[][] A) {

        int n = A.length;
        double[][] L = new double[n][n];
        double[][] U = new double[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                U[0][i] = A[0][i];
                L[i][0] = ((A[i][0]) / (U[0][0]));
                double sum = 0;
                for (int k = 0; k < i; k++) {
                    sum += L[i][k] * U[k][j];
                }
                U[i][j] = A[i][j] - sum;
                if (i > j) {
                    L[j][i] = 0;
                } else {
                    sum = 0;
                    for (int k = 0; k < i; k++) {
                        sum += L[j][k] * U[k][i];
                    }
                    L[j][i] = (A[j][i] - sum) / U[i][i];
                }
            }
        }
        System.out.println("L matrix");
        GaussMethod.output(L);
        System.out.println("\n");
        System.out.println("U matrix");
        GaussMethod.output(U);
    }

    public static double[][] getNewL(double[][] A) {
        int n = A.length;
        double[][] L = new double[n][n];
        double[][] U = new double[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                U[0][i] = A[0][i];
                L[i][0] = ((A[i][0]) / (U[0][0]));
                double sum = 0;
                for (int k = 0; k < i; k++) {
                    sum += L[i][k] * U[k][j];
                }
                U[i][j] = A[i][j] - sum;
                if (i > j) {
                    L[j][i] = 0;
                } else {
                    sum = 0;
                    for (int k = 0; k < i; k++) {
                        sum += L[j][k] * U[k][i];
                    }
                    L[j][i] = (A[j][i] - sum) / U[i][i];
                }
            }
        }
        double[][] newL = new double[L.length][L.length + 1];
        for (int i = 0; i < L.length; i++) {
            for (int j = 0; j < L.length; j++) {
                newL[i][j] = L[i][j];
            }
        }
        for (int i = 0; i < newL.length; i++) {
            newL[i][A[0].length - 1] = A[i][A[0].length - 1];
        }
        return newL;
    }

    public static double[][] getNewU(double[][] A) {
        int n = A.length;
        double[][] L = new double[n][n];
        double[][] U = new double[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                U[0][i] = A[0][i];
                L[i][0] = ((A[i][0]) / (U[0][0]));
                double sum = 0;
                for (int k = 0; k < i; k++) {
                    sum += L[i][k] * U[k][j];
                }
                U[i][j] = A[i][j] - sum;
                if (i > j) {
                    L[j][i] = 0;
                } else {
                    sum = 0;
                    for (int k = 0; k < i; k++) {
                        sum += L[j][k] * U[k][i];
                    }
                    L[j][i] = (A[j][i] - sum) / U[i][i];
                }
            }
        }
        double[][] newU = new double[U.length][U[0].length + 1];

        for (int i = 0; i < U.length; i++) {
            for (int j = 0; j < U[0].length; j++) {
                newU[i][j] = U[i][j];
            }
        }
        GaussMethod.output(newU);
        double[] ans = LyB(A);
        for (int i = 0; i < newU.length; i++) {
            newU[i][newU[0].length - 1] = ans[i];
        }
        GaussMethod.output(newU);
        return newU;
    }

    public static double[] LyB(double[][] A) {
        double[] res;
        double[][] L = getNewL(A);
        res = GaussMethod.gaussAnswer(L, 3, 4);

        return res;
    }

    public static void YuX(double[][] A) {
        double[] res;
        double[][] U = getNewU(A);
        res = GaussMethod.gaussAnswer(U, 4, 3);
        System.out.println(Arrays.toString(res));
    }
}
