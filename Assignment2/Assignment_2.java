import java.util.Scanner;
class Vehicle {

    // Instance variables (data members)
    private String brand;
    private String model;
    private int year;
    private double mileage;
    private double engineCapacity;

    // Constructor with DIFFERENT argument names
    Vehicle(String brandName, String modelName, int manufactureYear,
            double currentMileage, double engineCC) {

        brand = brandName;
        model = modelName;
        year = manufactureYear;
        mileage = currentMileage;
        engineCapacity = engineCC;
    }

    // Getter methods
    String getBrand() {
        return brand;
    }

    String getModel() {
        return model;
    }

    int getYear() {
        return year;
    }

    double getMileage() {
        return mileage;
    }

    double getEngineCapacity(){ return engineCapacity;}

    // Setter-like method to update mileage after trip
    void addTripDistance(double distance) {
        mileage = mileage + distance;
    }

    // Method to display vehicle details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage + " km");
        System.out.println("Engine Capacity: " + engineCapacity + " cc");
    }
}



class VehicleApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Vehicle[] vehicles = new Vehicle[5];   // array of Vehicle objects
        int count = 0;
        int choice;

        do {
            System.out.println("\nMENU");
            System.out.println("1. Add Vehicle");
            System.out.println("2. Display All Vehicles");
            System.out.println("3. Update Mileage After Trip");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter brand: ");
                    String brand = sc.next();

                    System.out.print("Enter model: ");
                    String model = sc.next();

                    System.out.print("Enter year: ");
                    int year = sc.nextInt();

                    System.out.print("Enter mileage: ");
                    double mileage = sc.nextDouble();

                    System.out.print("Enter engine capacity: ");
                    double engineCapacity = sc.nextDouble();

                    vehicles[count] =
                        new Vehicle(brand, model, year, mileage, engineCapacity);
                    count++;

                    System.out.println("Vehicle added successfully.");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No vehicles available.");
                    } else {

                        System.out.println("\n---------------------------------------------------------------------------------");
                        System.out.printf("%-5s %-15s %-15s %-8s %-12s %-15s\n",
                                "No", "Brand", "Model", "Year", "Mileage", "Engine CC");
                        System.out.println("---------------------------------------------------------------------------------");

                        for (int i = 0; i < count; i++) {
                            System.out.printf("%-5d %-15s %-15s %-8d %-12.2f %-15.2f\n",
                                    (i + 1),
                                    vehicles[i].getBrand(),
                                    vehicles[i].getModel(),
                                    vehicles[i].getYear(),
                                    vehicles[i].getMileage(),
                                    vehicles[i].getEngineCapacity());
                        }

                        System.out.println("---------------------------------------------------------------------------------");
                    }
                    break;
                case 3:
                    System.out.print("Enter vehicle number: ");
                    int num = sc.nextInt();

                    System.out.print("Enter trip distance (km): ");
                    double trip = sc.nextDouble();

                    vehicles[num - 1].addTripDistance(trip);
                    System.out.println("Mileage updated.");
                    break;

                case 4:
                    System.out.println("Program exited.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}