public class Main {

    public static void main(String[] args) {
        Car car = new Car("Civic", "Honda", 2024, 25000.00, "Black", 5);
        System.out.println("Original Car Information:");
        System.out.println(car);
        car.sell();
        System.out.println("\nCar Details Using Getters:");
        System.out.println("Model: " + car.getModel());
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Year: " + car.getYear());
        System.out.println("Price: " + car.getPrice());
        System.out.println("Color: " + car.getColor());
        System.out.println("Quantity: " + car.getQuantity());
        car.setModel("Accord");
        car.setYear(2025);
        car.setPrice(30000.00);
        car.setColor("White");
        car.delivery();
        System.out.println("\nUpdated Car Information:");
        System.out.println(car);
    }

}