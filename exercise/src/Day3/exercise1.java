package Day3;

import java.util.Scanner;

public class exercise1 {
    public static void main (String[] args){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        a = sc.nextInt();
        System.out.println("Nhập số b: ");
        b = sc.nextInt();
        if ( a > b){
            System.out.println("Max :" +a);
        } else {
            System.out.println("Max :" +b);
        }
//        System.out.println("_________________________________________________________");
//        if (a%2==0) {
//            System.out.println(a + " là số chẵn");
//        } else {
//            System.out.println(a + " là số lẻ");
//        }
        System.out.println("\n_________________________________________________________");
        System.out.println("Số " + a + " là số " + ((a%2==0)?"chẵn":"lẻ"));
        System.out.println("\n_________________________________________________________");
        int n;
        System.out.println("Nhập số n: ");
        n = sc.nextInt();
        System.out.println("Số chia hết cho 5: ");
        for(int i =100 ; i > n; i-=5){
                System.out.print(i + "\t");
        }
    }
}
