package Day5.Inherritance;

public class Student extends Person {
    private String truonng;

    public String getTruonng() {
        return truonng;
    }

    public void setTruonng(String truonng) {
        this.truonng = truonng;
    }

    public void Academy (){
        System.out.println(getName() + " " + getAge() + " sinh viên trường " + getTruonng());
    }
    @Override
    public void play(){
        System.out.println(getName() + " đi chơi vào cuối tuần");
    }
}
