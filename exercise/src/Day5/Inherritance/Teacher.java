package Day5.Inherritance;

public class Teacher extends Person {
    private String lop;
    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void school(){
        System.out.println( getName() + " " + getAge() + " là giáo viên chủ nhiệm lớp " + getLop());
    }
    @Override
    public void play(){
        System.out.println(getName() + " đi chơi vào sau khi dạy xong ");
    }
}
