package stepik.unicodeTable;

public class SymbolByRange {
    public static char symbolByRange(int a) {
        char b = '\u0059';
        int z = b+3;
        char x =(char)z;
        char y = (char)(x+a);
        System.out.println(y);
        return y;
    }
}
