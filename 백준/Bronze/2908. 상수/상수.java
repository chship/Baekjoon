import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String atmp = "";
        String btmp = "";
        for(int i = 0; i < 3; i++){
            atmp = atmp + a.charAt(2 - i);
            btmp = btmp + b.charAt(2 - i);
        }
        int arev = Integer.parseInt(atmp);
        int brev = Integer.parseInt(btmp);
        if(arev > brev){
            System.out.println(arev);
        }else{
            System.out.println(brev);
        }
    }
}