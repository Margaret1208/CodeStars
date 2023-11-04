package BTVN5.Extend;

import java.util.Scanner;

public class Employee extends Person{
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã nhân viên: ");
        setID(sc.nextInt());
        System.out.println("Nhập tên nhân viên: ");
        setName(sc.next());
        System.out.println("Nhập vị trí: ");
        setVitri(sc.next());
        System.out.println("Nhập địa chỉ: ");
        setAddress(sc.next());
        System.out.println("Nhập ngày công: ");
        setNgaycong(sc.nextInt());
        System.out.println("Nhập lương cơ bản: ");
        setHeso(sc.nextInt());
        System.out.println("Nhập ngày nghỉ: ");
        setNgaynghi(sc.nextFloat());
    }

    public float luong(){
        if (getNgaynghi()!= 0){
            return getHeso() - (getHeso()/getNgaycong()*getNgaynghi());
        } else
            return getHeso();
    }
    public void Output(){
        System.out.printf("%10s %10s %10s %10s %10s %10s %10s %10s \n",getID(), getName(), getVitri(), getAddress(), getNgaycong(), getHeso(),getNgaynghi(), luong());
    }

}
