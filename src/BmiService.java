public class BmiService {
    public int calculate(double height, int weigt) {
        double index = height * height;
        int bmi = (int) (weigt / index);
        return bmi;
    }
}