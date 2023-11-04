package Day5.Inherritance;

public class Run {
    public static void main (String[] args){
        Student st = new Student();
        st.setName("VTTH");
        st.setAge(22);
        st.setTruonng("AJC");
        st.Academy();
        st.play();
        System.out.println("_________________________________");
        Teacher tc = new Teacher();
        tc.setName("NHK");
        tc.setAge(34);
        tc.setLop("11D1.1");
        tc.school();
        tc.play();
    }
}
