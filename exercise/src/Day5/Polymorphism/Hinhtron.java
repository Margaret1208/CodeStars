package Day5.Polymorphism;

public class Hinhtron extends HinhHoc {
    private float bankinh;

    public float getBankinh() {
        return bankinh;
    }

    public void setBankinh(float bankinh) {
        this.bankinh = bankinh;
    }
    @Override
    public void dientich() {
        float S;
        S = (float) (3.14 * getBankinh() * getBankinh());
        System.out.println("Diện tich hình "+ getTenhinh() + " có diện tích: " + S);
    }
}
