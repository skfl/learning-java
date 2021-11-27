package practice.first;

public class IsPrimeCheck { //20 320
    public static void primeCheck() {
        int cnt = 0;
        for (int i = 2; i < 100; i++) {
            if (i == 2 || i == 3 || i == 5 || i == 7) {
                System.out.println("Number " + i + " is prime");
                cnt += 1;
            } else if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
            } else {
                System.out.println("Number " + i + " is prime");
                cnt += 1;
            }
        }
        System.out.print(cnt);
    }

    public static void triplePrimeCheck() {
        int n = 0;
        int cnt=0;
        int[] chck = new int[7];

        chck[0]=2;
        chck[1]=3;
        chck[2]=5;
        chck[3]=7;
        chck[4]=11;
        chck[5]=13;
        chck[6]=17;

        for (int i = 20; i < 320; i++) {
            for(int j=0;j<chck.length;j++){
                if(i%chck[j]==0){
                    n+=1;
                }
            }
            if(n==3){
                cnt+=1;
                System.out.println("Num "+i+" has triple prime dividers");
            }
            n=0;
        }
        System.out.println(cnt);
    }
}
