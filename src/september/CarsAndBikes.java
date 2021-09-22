package september;

import java.util.Scanner;

public class CarsAndBikes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int T = sc.nextInt();
            while(T>0){
                int N = sc.nextInt();
                int cars = 0;
                int bikes = 0;
                if(N/4 == 0){
                    bikes = N/2;
                }
                else{
                    cars = N/4;
                    int remaining = N - 4*cars;
                    bikes = remaining/2;
                }
                if(bikes>0)
                    System.out.println("YES");
                else
                    System.out.println("NO");
                T--;
            }
        }
    }
}
