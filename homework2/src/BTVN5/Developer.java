package BTVN5;

public class Developer extends Employee{
//    public float luong;
//
//    public float getLuong() {
//        return luong;
//    }
//
//    public void setLuong(float luong) {
//        this.luong = luong;
//    }

    @Override
    public void Salary() {
        if (getNgaynghi() != 0){
            setLuong((float) (getHeso() - (getHeso()/getNgaycong()*getNgaynghi())));
        } else {
            setLuong((float) getHeso());
        }
        System.out.println("Lương tháng: "+ getLuong());
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
