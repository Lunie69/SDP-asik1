package cheremsha;

public class CheremshaCooker {
    private int weight;
    private String freshness;
    private String sause;
    private String spicyLvl;
    private double price;

    public CheremshaCooker setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public CheremshaCooker setFreshness(String freshness) {
        this.freshness = freshness;
        return this;
    }

    public CheremshaCooker setSause(String sause) {
        this.sause = sause;
        return this;
    }

    public CheremshaCooker setSpicyLvl(String spicyLvl) {
        this.spicyLvl = spicyLvl;
        return this;
    }

    public CheremshaCooker setPrice(double price) {
        this.price = price;
        return this;
    }

    public Cheremsha build() {
        return new Cheremsha(weight, freshness, sause, spicyLvl, price);
    }
}
