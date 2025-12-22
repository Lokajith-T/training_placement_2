class Frequency {
    public static void main(String[] args) {
        int a[] = {1,2,2,3};
        int count = 0;
        for (int i : a)
            if (i == 2) count++;
        System.out.println(count);
    }
}
