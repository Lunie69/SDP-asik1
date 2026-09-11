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
        validate();

        return new Cheremsha(weight, freshness, sause, spicyLvl, price);
    }

    private void validate() {
        if (weight <= 0) {
            throw new IllegalStateException("Ves dolzhen bit > 0");
        }

        if (price <= 0) {
            throw new IllegalStateException("Price dolzhna bit > 0");
        }

        if (sause == null || sause.isBlank()) {
            throw new IllegalStateException("Nuzhen sause");
        }

        if (freshness == null || freshness.isBlank()) {
            throw new IllegalStateException("Nuzhna svezhest");
        }
    }
}
