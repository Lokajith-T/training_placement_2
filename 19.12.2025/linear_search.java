class LinearSearch {
    public static void main(String[] args) {
        int a[] = {10,20,30,40};
        int key = 30;
        boolean found = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");
    }
}
