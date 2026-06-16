//абстрактный суперкласс
abstract class Vehicle {
    //поля brand и year
    String brand;
    int year;

    public Vehicle (String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    //метод для вывода
    public void start() {
        System.out.println("Транспортное средство заведено");
    }   
}

//подкласс car, наследующий vehicle
class Car extends Vehicle {
    private int numberOfDoors;

    public Car (String brand, int year, int numberOfDoors) {
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
            return numberOfDoors;
    } 

    //переопределение метода start
    @Override
    public void start() {
        System.out.println("Автомобиль марки " + brand + " заведен\nКоличество дверей: " + getNumberOfDoors() );
    }
}
//подкласс motorcycle, наследующий vehicle
class Motorcycle extends Vehicle {

    public Motorcycle (String brand, int year) {
        super(brand, year);
    }

    @Override
    public void start() {
        System.out.println("Мотоцикл марки " + brand + " заведен");
    }
}

public class lab7 {
    public static void main(String[] args) {
        Car car = new Car("Volkswagen", 2024, 4);
        car.start();

        Motorcycle motorcycle = new Motorcycle("Kawasaki", 2006);
        motorcycle.start();
    }
}

