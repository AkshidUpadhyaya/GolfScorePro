package golfscorepro.model;

import java.util.LinkedList;
import java.util.Queue;

public class RecentRoundQueue {
    private static Queue<Round> recentRounds = new LinkedList<>();
    private static final int MAX_SIZE = 5;

    public static void addRound(Round round) {
        if (recentRounds.size() == MAX_SIZE) {
            recentRounds.poll();
        }
        recentRounds.add(round);
    }

    public static Queue<Round> getRecentRounds() {
        return recentRounds;
    }
}
