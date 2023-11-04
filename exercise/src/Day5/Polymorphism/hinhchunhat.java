package Day5.Polymorphism;

public class hinhchunhat extends HinhHoc {
    private float dai, rong;

    public float getDai() {
        return dai;
    }

    public void setDai(float dai) {
        this.dai = dai;
    }

    public float getRong() {
        return rong;
    }

    public void setRong(float rong) {
        this.rong = rong;
    }


    @Override
    public void dientich() {
        float S;
        S = dai * rong;
        System.out.println("Diện tich hình "+ getTenhinh() + " có diện tích: " + S);
    }
}
