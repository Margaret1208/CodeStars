package Day2;

import java.util.Scanner;

public class Main {
    public static void printLargeNumber(double number1, double number2){
        if(number1 > number2){
            System.out.println("Số lớn hơn là: " + number1);
        }
        else {
            System.out.println("Số lớn hơn là: " + number2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b;
        System.out.println("Nhập số thứ nhất: \n" );
        a = sc.nextDouble();
        System.out.println("Nhập số thức hai: \n" );
        b = sc.nextDouble();
        printLargeNumber(a,b);
//        thuc hien phep tinh
        int c,d,e;
        float sum;
        System.out.println("Nhập số thứ nhất: \n" );
        c = sc.nextInt();
        System.out.println("Nhập số thức hai: \n" );
        d = sc.nextInt();
        System.out.println("Nhập số thứ ba: \n");
        e = sc.nextInt();
        sum = (float) (c + d) /e;
        System.out.println("Kết quả của phép tính: " +sum);
        System.out.println("Hello world!");
    }
}