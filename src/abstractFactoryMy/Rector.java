package abstractFactoryMy;

public class Rector implements Superiors {

    @Override
    public void giveInstructions() { // уменьшить количество отчисляемых
        System.out.println("Plan for students: reduce the number of expulsions");
    }
}
