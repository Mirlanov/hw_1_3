public class Main {
    public static void main(String[] args) {
        double[] numbers = {1.5, 4.7, 9.7, -8.2, 3.8, 4.8, -6.7, 2.4, -1.8, 6.4, 4.7, 6.7, 3.9, -2.7, -5.0};
        boolean fall = true;
        double summaChisel = 0;
        int kolichestvoChisel = 0;
        for (double num : numbers) {
            if (num < 0) {
                fall = true;
            } else if (num > 0 && fall) {
                summaChisel = summaChisel + num;
                kolichestvoChisel++;
            }
        }
        double result = summaChisel / kolichestvoChisel;
        System.out.println(result);
    }
}