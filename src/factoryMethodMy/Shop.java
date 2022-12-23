package factoryMethodMy;

public class Shop {
    private static Plantation plantation;

    public static void main(String[] args) {
        check("roses");
        shops();

        System.out.println();

        check("poppy");
        shops();
    }

    static void check(String wish) {
        if (wish.equals("roses")) {
            plantation = new RosesPlantation();
        } else if (wish.equals("poppy")) {
            plantation = new PoppyPlantation();
        } else {
            System.out.println("sorry... we don't grow other flowers");
        }
    }

    static void shops() {
        plantation.getFlower();
    }
}
