package abstractFactoryMy;

public class Distribution {

    private Teacher teacher;
    private Superiors superiors;

    public Distribution(Headquarters headquarters) {
        teacher = headquarters.giveTeacher();
        superiors = headquarters.giveSuperiors();
    }

    public void display() {
        teacher.giveKnowledge();
        superiors.giveInstructions();
    }
}
