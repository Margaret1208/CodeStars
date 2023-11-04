package BTVN4;

public class Developer extends Employee {
    private float luong;
    @Override
    public void Salary() {
        if (getNgaynghi() != 0){
            luong = (float) (getHeso() - (getHeso()/getNgaycong()*getNgaynghi())) ;
        } else {
            luong = (float) getHeso();
        }
        System.out.println("Lương tháng: "+ luong);
    }
    public void printInfo(){
        System.out.println("Mã nhân viên: "+ getID() + "\n" +
                "Họ và Tên: " + getName() + "\n" +
                "Địa chỉ: " + getAddress() + "\n" +
                "Hệ số: " + getHeso() + "\n" +
                "Ngày công: " + getNgaycong() + "\n" +
                "Ngày nghỉ: " + getNgaynghi() + "\n" );
    }
}
