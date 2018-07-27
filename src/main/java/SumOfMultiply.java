public class SumOfMultiply {

    //assumption:  zero is not a natural number
    public int sumOfMultiply(int maxNumber) {
        int sum = 0;
        if (maxNumber < 1000) {
            for (int i = 1; i < maxNumber; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    sum += i;
                }
            }
            return sum;
        } else return 0;
    }
}