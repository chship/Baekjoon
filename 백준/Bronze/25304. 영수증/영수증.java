import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();//총금액
        int Y = sc.nextInt();
        int sum = 0;
        for(int i=0; i<Y; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum = sum + (a*b);
        }
        if(sum==X){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}