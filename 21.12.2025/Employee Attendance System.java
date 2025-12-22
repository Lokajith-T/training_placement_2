class Attendance {
    String name;
    int daysPresent;

    void calculateSalary(int perDay) {
        System.out.println("Salary = " + (daysPresent * perDay));
    }

    public static void main(String[] args) {
        Attendance a = new Attendance();
        a.name = "Ravi";
        a.daysPresent = 22;
        a.calculateSalary(500);
    }
}
