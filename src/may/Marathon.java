package may;

import java.util.Scanner;

public class Marathon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int t = sc.nextInt();
            while(t-->0){
                int D = sc.nextInt();
                int d = sc.nextInt();
                int A = sc.nextInt();
                int B = sc.nextInt();
                int C = sc.nextInt();
                int distance = D*d;
                if(distance<10)
                    System.out.println(0);
                else if(distance>=10 && distance<21)
                    System.out.println(A);
                else if(distance>=21 && distance<42)
                    System.out.println(B);
                else
                    System.out.println(C);
            }
        }
    }
}
