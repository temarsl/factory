package abstractFactoryMy;

public class main {
    public static void main(String[] args) {
        Distribution distribution = distributions("sch");
        distribution.display();

        System.out.println();

        distribution = distributions("un");
        distribution.display();
    }

    private static Distribution distributions(String educationalInstitution) { // учебное заведение
        Distribution distribution;
        Headquarters headquarters;
        if (educationalInstitution.equals("sch")) {
            headquarters = new School();
        } else {
            headquarters = new University();
        }
        distribution = new Distribution(headquarters);
        return distribution;
    }
}
