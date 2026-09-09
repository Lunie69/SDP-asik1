package cheremsha;

public class Main {
    public static void main(String[] args) {

        Cheremsha cheremsha = new CheremshaCooker()
                .setWeight(125)
                .setSause("KisloSladij")
                .setFreshness("Svezhij")
                .setSpicyLvl("Mild")
                .setPrice(3000)
                .build();

        System.out.println(cheremsha);
    }
}