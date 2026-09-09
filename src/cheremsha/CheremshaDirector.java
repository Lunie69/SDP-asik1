package cheremsha;

public class CheremshaDirector {

    public Cheremsha buildSpicyCheremsha() {
        return new CheremshaCooker()
                .setWeight(3)
                .setSause("Hot & Spicy")
                .setFreshness("Normal")
                .setSpicyLvl("Maximum")
                .setPrice(4500)
                .build();
    }

    public Cheremsha buildFirmenayaCheremsha() {
        return new CheremshaCooker()
                .setWeight(10)
                .setSause("Sweet & Spicy")
                .setFreshness("Tolko s gryadki")
                .setSpicyLvl("Minimum")
                .setPrice(15000)
                .build();
    }

    public Cheremsha buildCheapCheremsha() {
        return new CheremshaCooker()
                .setWeight(1)
                .setSause("Soevyj")
                .setFreshness("Ne ochen")
                .setSpicyLvl("None")
                .setPrice(1000)
                .build();
    }
}