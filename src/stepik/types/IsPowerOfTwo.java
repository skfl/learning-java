package stepik.types;

public class IsPowerOfTwo {
    public static boolean isPowerOfTwo(int value) {
        boolean v = false;
        if(value<0){
            value=value*-1;
        }
        int a =Integer.bitCount(value);
        if(a==1){
            v = true;
        }
        return v;
    }
}
