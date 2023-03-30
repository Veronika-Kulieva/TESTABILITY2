public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weigt = 98;
        double height = 1.87;
        int bmi = service.calculate(height, weigt);
        System.out.println("Ваш индекс массы тела:" + bmi);
    }
}