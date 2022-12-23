package abstractFactoryMy;

public class University implements Headquarters {
    @Override
    public Teacher giveTeacher() {
        return new ProfessorPhysics();
    }

    @Override
    public Superiors giveSuperiors() {
        return new Rector();
    }
}
