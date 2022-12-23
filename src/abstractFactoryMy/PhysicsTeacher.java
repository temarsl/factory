package abstractFactoryMy;

public class PhysicsTeacher implements Teacher {

    @Override
    public void giveKnowledge() {
        System.out.println("Newton's second law: The sum of all forces acting on a body is equal" +
                " to the product of the mass of the body by the acceleration reported by " +
                "this sum of forces");
    }
}
