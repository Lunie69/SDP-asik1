package cheremsha;

public class Cheremsha {
    private int weight;
    private String freshness;
    private String sause;
    private String spicyLvl;
    private double price;

    public Cheremsha(int weight, String freshness, String sause, String spicyLvl, double price) {
        this.weight = weight;
        this.freshness = freshness;
        this.sause = sause;
        this.spicyLvl = spicyLvl;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cheremsha{" + "weight=" + weight +
                " kg, sause='" + sause + '\'' +
                ", price=" + price + " KZT, freshness='" +
                freshness + '\'' + ", spicyLvl='" + spicyLvl + '\'' + '}';
    }
}
