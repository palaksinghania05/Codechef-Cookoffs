package y2021.october;

import java.util.Scanner;

public class ChefAndSlippers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int T = sc.nextInt();
            while(T>0){
                int N = sc.nextInt();
                int L = sc.nextInt();
                int X = sc.nextInt();
                int R = N-L;
                int pairs = Math.min(L,R);
                System.out.println(pairs*X);
                T--;
            }
        }
    }
}
