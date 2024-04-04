import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] arg = new double[N];
        double max = 0;
        
        for(int i = 0; i < N; i++){
            int a = sc.nextInt();
            arg[i] = a;
            if(max < arg[i]){
                max = arg[i];
            }
        }
        double sum = 0;
        for(int i = 0; i < arg.length; i++){
            sum = sum + ((arg[i]/max)*100);
        }
        System.out.println(sum/N);
    }
}