package Day5.Polymorphism;

public class Run {
    public static void main (String[] args){
        Hinhtron c = new Hinhtron();
        c.setTenhinh("Hình tròn");
        c.setBankinh(4);
        c.dientich();
        System.out.println("_________________________________");
        hinhchunhat cn = new hinhchunhat();
        cn.setTenhinh("Hình chữ nhật");
        cn.setDai(3.5F);
        cn.setRong(3);
        cn.dientich();
    }
}
