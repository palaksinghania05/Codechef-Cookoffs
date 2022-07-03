package y2021.october;

import java.util.Scanner;

public class AverageFlex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int T = sc.nextInt();
            while(T>0){
                int N = sc.nextInt();
                int[] arr = new int[N];
                for (int i = 0; i < N; i++) {
                    arr[i] = sc.nextInt();
                }
                int count = 0;
                for (int i = 0; i < N; i++) {
                    int ele = arr[i];
                    int more = 0, less = 0;
                    for (int j = 0; j < N; j++) {
                        if(arr[j]>ele)
                            more++;
                        else if(arr[j]<=ele)
                            less++;
                    }
                    if(less>more)
                        count++;
                }
                System.out.println(count);
                T--;
            }
        }
    }
}
