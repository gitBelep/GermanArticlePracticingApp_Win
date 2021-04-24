package nemetNeveloGyakorlo;

public class BestPlayer {
    private String name;
    private int sumGold;
    private int sumRounds;

    public BestPlayer(String name, int sumGold, int sumRounds) {
        this.name = name;
        this.sumGold = sumGold;
        this.sumRounds = sumRounds;
    }

    public String getName() {
        return name;
    }

    public int getSumGold() {
        return sumGold;
    }

    public int getSumRounds() {
        return sumRounds;
    }

}
