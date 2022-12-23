package abstractFactoryMy;

public class ProfessorPhysics implements Teacher {

    @Override
    public void giveKnowledge() {
        System.out.println("bio Savard Laplace's law: The magnetic field at a point in space" +
                " created by a small segment of a conductor through which an electric current flows" +
                " is proportional to the current strength, inversely proportional to the square of the" +
                " distance from this point to the conductor and directed" +
                " perpendicular to both the current and the direction to the conductor.");
    }
}
