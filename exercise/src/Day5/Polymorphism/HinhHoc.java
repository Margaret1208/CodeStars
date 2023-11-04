package Day5.Polymorphism;

public abstract class HinhHoc {
    private String tenhinh;

    public String getTenhinh() {
        return tenhinh;
    }

    public void setTenhinh(String tenhinh) {
        this.tenhinh = tenhinh;
    }

    public abstract void dientich();
}
