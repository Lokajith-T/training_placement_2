class Parent {
    void display(){System.out.println("Parent");}
}
class Child extends Parent {
    void display(){
        super.display();
        System.out.println("Child");
    }
    public static void main(String[] args) {
        new Child().display();
    }
}
