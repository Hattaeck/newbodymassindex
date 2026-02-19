public class BodyMassIndex {

    public double calculate(double mass, double height) {
        double heightInMeters = height / 100;
        double bmi;
        bmi = mass / (heightInMeters * heightInMeters);

        return bmi;


    }
}
