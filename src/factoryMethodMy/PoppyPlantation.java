package factoryMethodMy;

public class PoppyPlantation extends Plantation {
    @Override
    public Flower pickFlowers() {
        return new Poppy();
    }
}
