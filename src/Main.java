public class Main {

    public static void main(String[] args) {
        double[] numbers = {1.2, -3.3, -2.0, 7.0, 3.3, 2.2, -5.7, 3.7, 1.1, 2.2, 4.4, 5.5, 8.8, 12.6, 101.1};
        boolean isNegative = false;
        double summa = 0;
        int numberOfPositiveNums = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                isNegative = true;
            }
            else {
                if (isNegative) {
                    numberOfPositiveNums++;
                    summa += numbers[i];
                }

            }

        }
        System.out.println(numberOfPositiveNums);
        System.out.println(summa);
        System.out.println(summa / numberOfPositiveNums);
        {

        }
    }


}
