package BTVN5;

import java.util.Scanner;

public class Infomation {
    public static void main (String[] args){
        System.out.println("_____________________DEVELOPER_____________________________");
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

        System.out.println("_____________________BusinessAnalyst_____________________________");
        BusinessAnalyts ba = new BusinessAnalyts();
        System.out.print("Nhập mã nhân viên: ");
        ba.setID(sc.nextInt());
        System.out.print("Nhập tên nhân viên: ");
        ba.setName(sc.next());
        System.out.print("Nhập địa chỉ: ");
        ba.setAddress(sc.next());
        System.out.print("Nhập hệ số lương: ");
        ba.setHeso(sc.nextInt());
        System.out.print("Nhập số ngày công: ");
        ba.setNgaycong(sc.nextInt());
        System.out.print("Nhập số ngày nghỉ: ");
        ba.setNgaynghi(sc.nextFloat());
        System.out.println("\t\t\t\t\t\tThông tin nhân viên");
        System.out.println("______________________________________________________________");
        ba.printInfo();
        ba.Salary();

        if (dev.getLuong() > ba.getLuong()){
            System.out.println("Lương cao nhất là: " +dev.getLuong());
        }else{
            System.out.println("Lương cao nhất là: " +ba.getLuong());
        }
    }
}
