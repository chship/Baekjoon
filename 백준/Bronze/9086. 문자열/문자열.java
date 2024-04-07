import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            String src = sc.next();
            String fir = String.valueOf(src.charAt(0));
            String sec = String.valueOf(src.charAt(src.length()-1));
            System.out.println(fir.concat(sec));
        }
        
    }
} 