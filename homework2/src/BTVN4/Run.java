package BTVN4;

import java.util.Scanner;

public class Run {
    public static void main (String[] args){
        Developer dev = new Developer();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã nhân viên: ");
        dev.setID(sc.nextInt());
        System.out.print("Nhập tên nhân viên: ");
        dev.setName(sc.next());
        System.out.print("Nhập địa chỉ: ");
        dev.setAddress(sc.next());
        System.out.print("Nhập hệ số lương: ");
        dev.setHeso(sc.nextInt());
        System.out.print("Nhập số ngày công: ");
        dev.setNgaycong(sc.nextInt());
        System.out.print("Nhập số ngày nghỉ: ");
        dev.setNgaynghi(sc.nextFloat());
        System.out.println("\t\t\t\t\t\tThông tin nhân viên");
        System.out.println("______________________________________________________________");
        dev.printInfo();
        dev.Salary();
    }
}
