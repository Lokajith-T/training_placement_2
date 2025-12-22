abstract class Vehicle {
    abstract void speed();
}

class Bike extends Vehicle {
    void speed() {
        System.out.println("Bike speed is 60 km/hr");
    }
}

class Car extends Vehicle {
    void speed() {
        System.out.println("Car speed is 120 km/hr");
    }
}

class TestVehicle {
    public static void main(String[] args) {
        Vehicle v;
        v = new Bike();
        v.speed();
        v = new Car();
        v.speed();
    }
}
