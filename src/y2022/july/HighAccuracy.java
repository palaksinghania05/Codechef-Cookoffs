/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 03-07-2022
 */

package y2022.july;

import java.util.Scanner;

public class HighAccuracy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int N = sc.nextInt();
            if(N%3==0)
                System.out.println(0);
            else if(N%3==1)
                System.out.println(2);
            else
                System.out.println(1);
            T--;
        }
    }
}
