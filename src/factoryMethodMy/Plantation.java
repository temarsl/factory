package factoryMethodMy;

public abstract class Plantation {

    public void getFlower() {
        Flower flower = pickFlowers();
        pickFlowers().like();
    }

    public abstract Flower pickFlowers();
}
