package practice.first;

public class DeleteFromArray {
    public int[] deleteBySignature(int[] arr, int targetNum) {
        int entry = 0;
        int pos = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == targetNum) {
                entry += 1;
            }
        }
        int[] res = new int[arr.length - entry];
        for (int j = 0; j < arr.length ; j++) {
            if (arr[j] != targetNum) {
                res[pos] = arr[j];
                pos += 1;
            }
        }
        return res;
    }
}
