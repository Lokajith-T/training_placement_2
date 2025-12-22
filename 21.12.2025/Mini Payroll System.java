class Payroll {
    int basic = 10000;
    int hra = 2000;
    int da = 1500;

    void salary() {
        System.out.println("Total = " + (basic + hra + da));
    }

    public static void main(String[] args) {
        new Payroll().salary();
    }
}
