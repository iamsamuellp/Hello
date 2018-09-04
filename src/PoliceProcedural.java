public class PoliceProcedural {
    //public enum PP-style {GRITTTY, BUDDY, COMEDY, INNER_CITY, DRAMA
    private   boolean     ensemble;           // true - ensemble, false buddy
    private   String      style;              //  "Gritty", "Comedy", "Drama", "Inner City"
    private   String      location;           // New York, Chicago, LA
    private   boolean     forensicBased;      //  true = CSI, NCIS, false - Dragnet, Monk, Dick Tracy

    public PoliceProcedural(boolean ensemble, String style, String location, boolean forensicBased) {
        this.ensemble = ensemble;
        this.style = style;
        this.location = location;
        this.forensicBased = forensicBased;
    }

    public PoliceProcedural ( String Location){
        this.location = location;
        ensemble = true;
        style = "Drama";
        forensicBased = true;
    }

    public PoliceProcedural(String style, String location){
        this.style = style;
        this.location = location;
    }

    @Override
    public String toString() {
        return "PoliceProcedural{" +
                "ensemble=" + ensemble +
                ", style='" + style + '\'' +
                ", location='" + location + '\'' +
                ", forensicBased=" + forensicBased +
                '}';
    }

    public static void main(String[] args) {
        PoliceProcedural bones = new PoliceProcedural(true, "Forensic based", "Washington D.C",true);
        PoliceProcedural ncis = new PoliceProcedural("Washington D.C.");
        PoliceProcedural monk = new PoliceProcedural( "Savant", "San Francisco");
        System.out.println("monk:" + monk);
        System.out.println("bones:" + bones);
        System.out.println("ncis:" + ncis);

        System.out.println( "monk is filmed in"+ monk);

    }

}

