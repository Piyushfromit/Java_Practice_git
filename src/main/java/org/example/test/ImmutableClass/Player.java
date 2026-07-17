package org.example.test.ImmutableClass;



public final class Player {


    private final String name;
    private final int age;
    private final String team;
    private final Ranking ranking;


    public Player(String name, int age, String team, Ranking ranking) {
        this.name = name;
        this.age = age;
        this.team = team;
        Ranking r1 = new Ranking(ranking.getBattingRank(), ranking.getBowLingRank());
        this.ranking = r1;
    }


    public Ranking getRanking() {
        Ranking rank = new Ranking(ranking.getBattingRank(),ranking.getBowLingRank() );
        return rank;
    }

    public String getTeam() {
        return team;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }



    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", team='" + team + '\'' +
                ", ranking=" + ranking +
                '}';
    }
}
