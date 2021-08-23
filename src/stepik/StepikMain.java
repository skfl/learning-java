package stepik;

import com.sun.source.tree.NewArrayTree;
import stepik.mergeSort.MergeSort;
import stepik.mergeSort.MergeSort2;

import java.util.Arrays;
import java.util.Random;

public class StepikMain {
    public static void main(String[] args) {


        Random rndm = new Random();
        int[] rnd1 = new int[5];
        for(int i=0;i<rnd1.length;i++){
            rnd1[i] = rndm.nextInt(10);
        }
        int[] rnd2 = new int[5];
        for(int i=0;i<rnd2.length;i++){
            rnd2[i] = rndm.nextInt(10);
        }
/*        int[] rnd1 = new int[]{1, 1, 7, 7, 8};
        int[] rnd2 = new int[]{1, 2, 3, 5, 7};*/


        Arrays.sort(rnd1);
        Arrays.sort(rnd2);
        System.out.println(Arrays.toString(rnd1));
        System.out.println(Arrays.toString(rnd2));
        int res[];
        res = MergeSort2.mergeSort(rnd1, rnd2);
        System.out.println(Arrays.toString(res));
    }
}
