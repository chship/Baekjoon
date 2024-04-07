import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int a = sc.nextInt();
        System.out.println(word.charAt(a-1));
    }
}