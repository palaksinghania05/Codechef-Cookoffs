/*
You have three shoes of the same size lying around. Each shoe is either a left shoe (represented using 0)
or a right shoe (represented using 1). Given A, B, C, representing the information for each shoe,
find out whether you can go out now, wearing one left shoe and one right shoe.
 */

package july;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoeFit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int T = sc.nextInt();
            while(T>0){
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = 0; i < 3; i++) {
                    list.add(sc.nextInt());
                }
                if(list.contains(0) && list.contains(1))
                    System.out.println(1);
                else
                    System.out.println(0);
                T--;
            }
        }
    }
}
