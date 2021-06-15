package controlTask.b;

public class TripleNumCheck {
    public static void checkForRepeatedNums(String[] mas) {
        for (int i = 0; i < mas.length; i++) {
            int k = 1;
            int tmpVar=1;
            String str = mas[i];
            String[] spltd = str.split("");
            if (spltd.length == 3 && !spltd[0].equals("0")) {
                for (int j = 0; j < spltd.length-1; j++) {
                    k=1;
                    while (k < spltd.length) {
                        //System.out.println("spltd k"+spltd[k]+" spldt j "+spltd[j]);
                        if (spltd[j].equals(spltd[k]) && k!=j) {
                            System.out.println("Number " + mas[i] + " contains the same nums");
                        }
                        k += 1;
                    }
                }
            }
        }
    }
}