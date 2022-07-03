/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 03-07-2022
 */

package y2022.july;

import java.util.Scanner;

public class EnoughSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int N = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if((X+2*Y)<=N)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
