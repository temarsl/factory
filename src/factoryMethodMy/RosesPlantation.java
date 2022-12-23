package factoryMethodMy;

public class RosesPlantation extends Plantation {
    @Override
    public Flower pickFlowers() {
        return new Roses();
    }
}
