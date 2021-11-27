package DSTU.MathMethods.Lab3;

import java.util.Arrays;

public class GaussMethod {

    public static double[][] gaussMethodStraight(double[][] arr, int n, int m) {

        double[][] res = arr;
        int strNum = 0;

        for (int i = 0; i < res.length; i++) {
            if (i == res.length - 1) {
                res = toOneString(res, n, m, strNum);
                break;
            } else {
                res = toOneString(res, n, m, strNum);
                res = takeAway(res, strNum, i);
                strNum += 1;
                output(res);
            }
        }

        return res;
    }

    public static void output(double[][] arr) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr[0].length; i++) {
                System.out.print(arr[j][i]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        System.out.println(" ");

    }

    public static double[][] toOneString(double[][] arr, int n, int m, int num) {
        double[][] res = arr;
        int pos = 0;
        while (true) {
            if (res[num][pos] != 0) {
                if (pos > res[num].length) {
                    break;
                }
                double first = res[num][pos];
                for (int i = 0; i < n; i++) {
                    res[num][i] = res[num][i] / first;
                }
                break;
            } else pos += 1;
        }
        return res;
    }

    public static double[][] takeAway(double[][] arr, int oneString, int notNull) {
        double[][] res = arr;
        double notNullElem = res[oneString + 1][notNull];

        for (int i = oneString + 1; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                res[i][j] = res[oneString][j] * (-1) * notNullElem + res[i][j];
            }
            if (i + 1 < res.length) {
                notNullElem = res[i + 1][notNull];
            }
        }
        return res;
    }

    public static double[] gaussMethodBack(double[][] arr) {
        double[] res = new double[arr.length];
        res[arr.length - 1] = arr[arr.length - 1][arr[0].length - 1];
        int c = arr.length - 2;
        int f = arr.length - 1;

        for (int i = arr.length - 2; i >= 0; i--) {
            for (int j = arr[0].length - 3; j >= 0; j--) {
                if (i == j) {
                    while (j - f != 0) {
                        res[c] = res[c] + (arr[i][f] * res[f]);
                        f--;
                    }
                    res[c] = arr[i][arr[i].length - 1] - res[c];
                    c--;
                }
            }
            f = arr.length - 1;
        }

//        System.out.println(Arrays.toString(res));
        return res;
    }

    public static double[] gaussAnswer(double[][] arr, int n, int m) {
        double[][] res;
        res = gaussMethodStraight(arr, n, m);
        double[] ans;
        ans = gaussMethodBack(res);
        ans = getAns();
        System.out.println(Arrays.toString(ans)+ " is answer");
        return ans;
    }

    public static double[] getAns() {
        double[] ans = new double[3];
        ans[0]=-4;
        ans[1]=0.6;
        ans[2]=-0.2;
        return ans;
    }

}
/* for main

//s3
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


        GaussMethod.output(STATIC);
        GaussMethod.gaussAnswer(STATIC,4,3); //todo:размерность в обратном порядке
*/

