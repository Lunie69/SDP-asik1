package cheremsha;

public class Main {

    public static void main(String[] args) {

        CheremshaDirector director = new CheremshaDirector();

        Cheremsha spicyCheremsha = director.buildSpicyCheremsha();
        Cheremsha firmCheremsha = director.buildFirmenayaCheremsha();
        Cheremsha cheapCheremsha = director.buildCheapCheremsha();

        System.out.println("Spicy Cheremsha:");
        System.out.println(spicyCheremsha);

        System.out.println();

        System.out.println("Firmenaya Cheremsha:");
        System.out.println(firmCheremsha);

        System.out.println();

        System.out.println("Deshevaya Cheremsha:");
        System.out.println(cheapCheremsha);
    }
}