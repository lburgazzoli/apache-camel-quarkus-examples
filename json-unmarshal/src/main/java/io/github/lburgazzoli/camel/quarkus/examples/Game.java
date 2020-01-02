package io.github.lburgazzoli.camel.quarkus.examples;

public class Game {
    private Score score;
    private String mode;
    private String gameMode;

    public Score getScore() {
        return score;
    }
    public void setScore(Score score) {
        this.score = score;
    }
    public String getMode() {
        return mode;
    }
    public void setMode(String mode) {
        this.mode = mode;
    }
    public String getGameMode() {
        return gameMode;
    }
    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }

    @Override
    public String toString() {
        return "Game{" +
            "score=" + score +
            ", mode='" + mode + '\'' +
            ", gameMode='" + gameMode + '\'' +
            '}';
    }
}