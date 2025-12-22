class ArraySort {
    public static void main(String[] args) {
        int a[] = {4, 3, 1, 2};

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }

        for (int i : a)
            System.out.print(i + " ");
    }
}
