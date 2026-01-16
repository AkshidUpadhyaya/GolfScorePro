package golfscorepro.model;

import java.util.ArrayList;

public class GolfClub {

    private static ArrayList<Golfer> golfers = new ArrayList<>();
    private static ArrayList<Round> rounds = new ArrayList<>();


    public static ArrayList<Golfer> getGolfers() {
        return golfers;
    }

    public static void addGolfer(Golfer golfer) {
        golfers.add(golfer);
    }
    
    public static ArrayList<Round> getRounds() {
        return rounds;
    }

    public static void addRound(Round round) {
        rounds.add(round);
    }

    public static Round removeRound(int index) {
        return rounds.remove(index);
    }

}
