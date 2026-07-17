package org.example.test.ImmutableClass;





public class Ranking {

    int battingRank;
    int bowLingRank;


    public Ranking(int battingRank, int bowLingRank) {
        this.battingRank = battingRank;
        this.bowLingRank = bowLingRank;
    }


    public int getBattingRank() {
        return battingRank;
    }

    public void setBattingRank(int battingRank) {
        this.battingRank = battingRank;
    }

    public int getBowLingRank() {
        return bowLingRank;
    }

    public void setBowLingRank(int bowLingRank) {
        this.bowLingRank = bowLingRank;
    }

}
