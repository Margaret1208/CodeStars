package BTVN4;

public abstract class Employee {
    private int ID;
    private String name, address;
    private int ngaycong,heso;
    private float ngaynghi;

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

    public int getNgaycong() {
        return ngaycong;
    }

    public void setNgaycong(int ngaycong) {
        this.ngaycong = ngaycong;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public abstract void Salary();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

}
