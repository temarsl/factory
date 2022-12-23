package abstractFactoryMy;

public class School implements Headquarters{
    @Override
    public Teacher giveTeacher() {
        return new PhysicsTeacher();
    }

    @Override
    public Superiors giveSuperiors() {
        return new Director();
    }
}
