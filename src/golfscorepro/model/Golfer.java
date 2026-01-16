package golfscorepro.model;

public class Golfer {

    private String golferId;
    private String name;
    private int handicap;

    public Golfer(String golferId, String name, int handicap) {
        this.golferId = golferId;
        this.name = name;
        this.handicap = handicap;
    }

    public String getGolferId() {
        return golferId;
    }

    public String getName() {
        return name;
    }

    public int getHandicap() {
        return handicap;
    }
}
