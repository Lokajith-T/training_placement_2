class Student {
    int id;
    String name;
    int mark;

    void set(int i, String n, int m) {
        id = i;
        name = n;
        mark = m;
    }

    void display() {
        System.out.println(id + " " + name + " " + mark);
    }

    public static void main(String[] args) {
        Student s[] = new Student[3];

        for (int i = 0; i < 3; i++)
            s[i] = new Student();

        s[0].set(1, "Ravi", 85);
        s[1].set(2, "Anu", 90);
        s[2].set(3, "Kiran", 78);

        for (int i = 0; i < 3; i++)
            s[i].display();
    }
}
