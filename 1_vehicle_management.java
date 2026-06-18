import java.util.Scanner;

class Vehicle
{
    String brand, model;
    int year;

    Vehicle(String brand1, String model1, int year1)
    {
        this.brand = brand1;
        this.model = model1;
        this.year = year1;
    }

    public void displayDetails()
    {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Year  : " + year);
    }
}

class Car extends Vehicle
{
    String fuelType;

    Car(String brand, String model, int year, String fuelType)
    {
        super(brand, model, year);
        this.fuelType = fuelType;
    }

    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Fuel Type : " + fuelType);
    }
}

class LuxuryCar extends Car
{
    String feature;

    public LuxuryCar(String brand, String model, int year,
                     String fuelType, String feature)
    {
        super(brand, model, year, fuelType);
        this.feature = feature;
    }

    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Feature : " + feature);
    }
}

class carmanagement
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Brand:");
        String brand = sc.nextLine();

        System.out.println("Enter Model:");
        String model = sc.nextLine();

        System.out.println("Enter Year:");
        int year = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Fuel Type:");
        String fuelType = sc.nextLine();

        System.out.println("Enter Feature:");
        String feature = sc.nextLine();

        LuxuryCar obj = new LuxuryCar(
                brand,
                model,
                year,
                fuelType,
                feature
        );

        System.out.println("\nVehicle Details");
        obj.displayDetails();
    }
}