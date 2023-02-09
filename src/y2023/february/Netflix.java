package y2023.february;

import java.util.Scanner;

public class Netflix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int X = sc.nextInt();
            if(A+B>=X || B+C>=X || A+C>=X)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
