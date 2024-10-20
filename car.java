class Car {
    String model;
    int year;

    // Constructor
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car("Toyota Corolla", 2020);

        // Displaying the details of the car
        myCar.displayDetails();
    }
}
