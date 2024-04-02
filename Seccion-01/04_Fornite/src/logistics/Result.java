package logistics;

import java.util.ArrayList;

public class Result {
    private Player winner;
    private ArrayList<Player> ranking;
    private int[] score;

    public Result(Player winner, ArrayList<Player> ranking, int[] score) {
        this.winner = winner;
        this.ranking = ranking;
        this.score = score;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public ArrayList<Player> getRanking() {
        return ranking;
    }

    public void setRanking(ArrayList<Player> ranking) {
        this.ranking = ranking;
    }

    public int[] getScore() {
        return score;
    }

    public void setScore(int[] score) {
        this.score = score;
    }
}
