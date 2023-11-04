package BTVN5.Extend;

import java.util.Scanner;

public class Thongtin {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] ee = new Employee[20];
        int a ;
        float max;
        boolean flag = true;
        do{
            System.out.println("Lựa chọn: ");
            System.out.println("1. Nhập nhân viên thông tin \n" +
                    "2. Xuất thông tin nhân viên \n" +
                    "3. Nhân viên có lương cao nhất \n" +
                    "4. Thoát");
            System.out.println("================================================");
            System.out.print("Bạn chọn: ");
            a = sc.nextInt();
            switch (a){
                case 1: {
//                    System.out.print("Nhập số lượng nhân viên: ");
//                    n = sc.nextInt();
                    for (int i = 1; i <= 2 ; i++){
                        ee[i] = new Employee();
                        System.out.print("Nhập nhân viên thứ : " + i + "\n");
                        ee[i].Input();
                    }
                    break;
                }
                case 2: {
                    System.out.printf("%10s %10s %10s %10s %10s %10s %10s %10s \n","Mã nhân viên",
                            "Tên nhân viên", "Vai trò", "Địa chỉ" ,"Số ngày công", "Lương cơ bản" ,"Số ngày nghỉ", "Lương tháng");
                    for (int i = 1; i <= 2 ; i++){
                        ee[i].Output();
                    }
                }
                break;
                case 3:{
                    max = ee[0].luong();
                    for (int i =1; i < 3 ; i++){
                        max = ee[i].luong();
                        for(int j = i+1; j < 2; i++) {
                            if (ee[i].luong() < ee[j].luong()) ;
                            max = ee[j].luong();
                        }
                    }
                    System.out.println("Mức lương cao nhất là: " + max);
                    break;
                }
                default:
                    System.out.println("End");
                    flag = false;
                    break;
            }
        } while(flag);
    }
}
