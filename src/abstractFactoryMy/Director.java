package abstractFactoryMy;

public class Director implements Superiors {

    @Override // повысить оценки за четверть
    public void giveInstructions() {
        System.out.println("The plan for schoolchildren: to increase grades for a quarter");
    }
}
