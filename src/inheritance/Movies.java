package inheritance;

public class Movies {
    private String title;
    private float budget;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getBudget() {
        return budget;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "title='" + title + '\'' +
                ", budget=" + budget +
                '}';
    }

    public Movies(String title, float budget) {
        this.title = title;
        this.budget = budget;

    }

    public static void main(String[] args) {

    }
}

class Horror extends Movies {
    private int Jumpscarecount;

    public int getJumpscarecount() {
        return Jumpscarecount;
    }

    public void setJumpscarecount(int jumpscarecount) {
        Jumpscarecount = jumpscarecount;
    }

    @Override
    public String toString() {
        return "Horror{" +
                "Jumpscarecount=" + Jumpscarecount +
                "} " + super.toString();
    }

    public Horror(String title, float budget, int jumpscarecount) {
        super(title, budget);
        Jumpscarecount = jumpscarecount;
    }
}

class SteamPunk extends Movies {
    private int steamPunkTech;

    public int getSteamPunkTech() {
        return steamPunkTech;
    }

    public void setSteamPunkTech(int steamPunkTech) {
        this.steamPunkTech = steamPunkTech;
    }

    @Override
    public String toString() {
        return "SteamPunk{" +
                "steamPunkTech=" + steamPunkTech +
                '}';
    }

    public SteamPunk(String title, float budget, int steamPunkTech) {
        super(title, budget);
        this.steamPunkTech = steamPunkTech;

    }

}

class ScienceFiction extends Movies {
    private int scienceThoeries;

    public int getScienceThoeries() {
        return scienceThoeries;
    }

    public void setScienceThoeries(int scienceThoeries) {
        this.scienceThoeries = scienceThoeries;
    }

    public ScienceFiction(String title, float budget, int scienceThoeries) {
        super(title, budget);
        this.scienceThoeries = scienceThoeries;
    }

    @Override
    public String toString() {
        return "ScienceFiction{" +
                "scienceThoeries=" + scienceThoeries +
                "} " + super.toString();
    }
}

class TimeTravel extends Movies {
    private int timeTravel;

    public int getTimeTravel() {
        return timeTravel;
    }

    public void setTimeTravel(int timeTravel) {
        this.timeTravel = timeTravel;
    }

    public TimeTravel(String title, float budget, int timeTravel) {
        super(title, budget);
        this.timeTravel = timeTravel;
    }

    @Override
    public String toString() {
        return "TimeTravel{" +
                "timeTravel=" + timeTravel +
                "} " + super.toString();
    }
}


