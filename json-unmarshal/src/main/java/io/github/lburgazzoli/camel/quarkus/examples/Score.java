package io.github.lburgazzoli.camel.quarkus.examples;

public class Score {
    private int score;
    private String gameID;

    public String getGameID() {
        return gameID;
    }
    public void setGameID(String gameID) {
        this.gameID = gameID;
    }
    public Score() {
        this.score = 0;
    }
    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return this.score;
    }

    @Override
    public String toString() {
        return "Score{" +
            "score=" + score +
            ", gameID='" + gameID + '\'' +
            '}';
    }
}