package golfscorepro.model;

import java.util.LinkedList;
import java.util.Queue;

public class RecentGolferQueue {

    private static Queue<Golfer> recentGolfers = new LinkedList<>();
    private static final int MAX_SIZE = 5;

    public static void addGolfer(Golfer golfer) {
        if (recentGolfers.size() == MAX_SIZE) {
            recentGolfers.poll(); // remove oldest
        }
        recentGolfers.add(golfer);
    }

    public static Queue<Golfer> getRecentGolfers() {
        return recentGolfers;
    }
}
