public class Main {
    public static void main(String[] args) {
        BodyMassIndex service = new BodyMassIndex();

        double height = 180;
        double mass = 70;
        double bmi = service.calculate(mass, height);

        System.out.println(bmi);

    }
}
