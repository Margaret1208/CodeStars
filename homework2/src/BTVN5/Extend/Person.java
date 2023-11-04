package BTVN5.Extend;

public class Person {
    private int ID;
    private String name, address, vitri;
    private int ngaycong,heso;
    private float ngaynghi, luong ;
//    public void Info(){
//        ID = 0;
//        name = null;
//        address = null;
//        vitri = null;
//        ngaycong = 0;
//        ngaynghi = 0;
//        heso = 0;
//    }
//
//    public void Info(int ID, String name, String Address, String vitri, int ngaycong, int heso, int ngaynghi){
//        this.ID = ID;
//        this.name = name;
//        this.address = address;
//        this.heso = heso;
//        this.ngaynghi = ngaynghi;
//        this.ngaycong = ngaycong;
//        this.vitri = vitri;
//    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }

    public int getNgaycong() {
        return ngaycong;
    }

    public void setNgaycong(int ngaycong) {
        this.ngaycong = ngaycong;
    }

    public int getHeso() {
        return heso;
    }

    public void setHeso(int heso) {
        this.heso = heso;
    }

    public float getNgaynghi() {
        return ngaynghi;
    }

    public void setNgaynghi(float ngaynghi) {
        this.ngaynghi = ngaynghi;
    }
}
