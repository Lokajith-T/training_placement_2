class SumAverage {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40};
        int sum = 0;

        for (int i : a)
            sum += i;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + (sum / a.length));
    }
}
