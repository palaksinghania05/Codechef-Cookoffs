/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 03-07-2022
 */

package y2022.july;

import java.util.Scanner;

public class ChefDrinksTea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            int money = 0;
            if(X<=Y)
                money=Z;
            else{
                money=Z;
                while(X>Y){
                    money = money+Z;
                    X = X-Y;
                }
            }
            System.out.println(money);
            T--;
        }
    }
}
