package golfscorepro.model;

public class Round {
    private String roundId;
    private String golferId;
    private String courseName;
    private String date;      // keep as String for simplicity (e.g., 2026-01-11)
    private int totalScore;

    public Round(String roundId, String golferId, String courseName, String date, int totalScore) {
        this.roundId = roundId;
        this.golferId = golferId;
        this.courseName = courseName;
        this.date = date;
        this.totalScore = totalScore;
    }

    public String getRoundId() { return roundId; }
    public String getGolferId() { return golferId; }
    public String getCourseName() { return courseName; }
    public String getDate() { return date; }
    public int getTotalScore() { return totalScore; }
}
