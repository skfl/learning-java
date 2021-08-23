package stepik.mergeSort;

import java.util.Arrays;

public class MergeSort {
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] res = new int[a1.length + a2.length];
        int[] tmp = new int[1];
        int minArr = 0;
        int maxArr = 0;
        int pos = 0;

        if(a1[0]<a2[0]){
            res[pos]=a1[0];
            pos+=1;
            tmp[0]=a2[0];
        }else if(a1[0]>a2[0]){
            res[pos]=a2[0];
            pos+=1;
            tmp[0]=a2[0];
        }else {
            res[pos]=a1[0];
            pos+=1;
            tmp[0]=a2[0];
        }

        for (int i = 1; i < res.length; i++) {

            if(a1[i]<a2[i] || a1[i]==a2[i]){
                minArr = a1[i];
                maxArr = a2[i];
            }else if(a1[i]>a2[i] && a1[i]!=a2[i]){
                minArr = a2[i];
                maxArr = a1[i];
            }

            if(minArr<tmp[0]){
                res[pos]=minArr;
                pos+=1;
                if(maxArr<tmp[0] || maxArr==tmp[0]){
                    res[pos]=maxArr;
                    pos+=1;
                }else {
                    res[pos]=tmp[0];
                    pos+=1;
                    tmp[0]=maxArr;
                }
            }

            if(tmp[0]<minArr){
                res[pos]=tmp[0];
                pos+=1;
                res[pos]=minArr;
                tmp[0]=maxArr;
            }

            if(tmp[0] == minArr){
                res[pos]=tmp[0];
                pos+=1;
                res[pos]=minArr;
                tmp[0]=maxArr;
            }

            System.out.println(Arrays.toString(res));
        }
        return res;
    }
}


/*
   int[] a1 = new int[] {21, 23, 24, 40, 75, 76, 78, 77, 900, 2100, 2200, 2300, 2400, 2500};
   int[] a2 = new int[] {10, 11, 41, 50, 65, 86, 98, 101, 190, 1100, 1200, 3000, 5000};
 */