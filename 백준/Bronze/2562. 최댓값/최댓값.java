import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int max = 0;
        int cnt = 0;
        int index = 0;
        for(int i = 0; i < 9; i++){
            int a = sc.nextInt();
            cnt = cnt + 1;
            if(max < a){
                max = a;
                index = cnt;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}