public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double weight = 100;
        double height = 1.50;
        double bmi = service.calculate(weight, height);
        System.out.println("Ваш индекс массы тела: " + bmi);

    }
}