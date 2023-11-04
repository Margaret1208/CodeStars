package Day4;

import java.awt.*;

public class exercise1 {
    public static String HangSX;
    public static String Color;
    public static String BKS;
    public static String NDK;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private String Address;

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public static void printInfo(){
        System.out.println("Hãng sản xuất: "+ HangSX + "\n" +
                           "Màu: " + Color + "\n" +
                           "Biển số xe: "+ BKS + "\n" +
                           "Ngày đăng kí: "+ NDK);
    }
    public static void main (String[] args){
        exercise1 po = new exercise1();
        po.HangSX = "SH";
        po.Color = "Red";
        po.BKS = "29-K1 12346";
        po.NDK = "29/10/2010";
        printInfo();

        System.out.println("_______________exercise2__________");
        po.setName("VTTH");
        System.out.print(po.getName() + " ");
        po.setAddress("HN");
        System.out.println(po.getAddress());

    }
}
