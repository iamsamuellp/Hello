public class TestEnum {
    public enum Student_Names { Arianne, Jayme, Samuel}
    public enum NETWORKS {CW, CBS, PBS, PBS_KIDS, NBS, UNIVISON, LAFF,}
    public static void main(String[] args) {
        Student_Names myclass;
        myclass = Student_Names.Arianne;
        myclass = Student_Names.Jayme;
        myclass = Student_Names.Samuel;
        NETWORKS stations = NETWORKS.CW;
        stations= NETWORKS.CBS;
        stations = NETWORKS.UNIVISON;
        System.out.println("stations = " + stations);
        System.out.println("myclass = " + myclass);
    }
}
