package DSTU.MathMethods.Lab4;

public class JacobiMethod {
    public static void jacobiMethod(int N,double[][] A,double[] F,double[] X) {
        double EPS = 0.0001;
        double[] TempX = new double[N];
        double norm=0;
        do{
            for(int i=0;i<N;i++){
                TempX[i]=F[i];
                for (int g=0;g<N;g++){
                    if(i!=g){
                        TempX[i]-=A[i][g]*X[g];
                    }
                    TempX[i]/=A[i][i];
                }
                norm=Math.abs(X[0]-TempX[0]);
                for(int h=0;h<N;h++){
                    if(Math.abs(X[h]-TempX[h])>norm){
                        norm=Math.abs(X[h]-TempX[h]);
                    }
                    X[h]=TempX[h];
                }
            }
        }while (norm>EPS);
    }
}
