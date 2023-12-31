package javadz1N2;
public class Main {
    public static void main(String[] args) {
    System.out.println("Автомобиль: ");
        Vehicle car = new Car("Nissan", "skyline r34", 1999, 80);
        car.displayInfo();
        car.power();
        car.accelerate(40);
        car.displayInfo();
        car.stop();
        car.displayInfo();
        car.refuel(40);
        car.refuel(60);
        car.accelerate(60);
        car.displayInfo();
        car.stop();
        car.power();
    System.out.println("______________________");
    System.out.println("Самолет: ");
        Vehicle aircraft = new Aircraft("Boeing", "747", 2023, 5000);
        aircraft.displayInfo();
        aircraft.power();
        ((Aircraft) aircraft).takeOff();
        aircraft.displayInfo();
        ((Aircraft) aircraft).land();
        aircraft.power();
    System.out.println("______________________");
    System.out.println("Лодка: ");
        Vehicle boat = new Boat("Titanic", "Olimpic", 2000, 60);
        boat.displayInfo();
        boat.accelerate(30);
        boat.power();
        ((Boat) boat).startSwimming();
        ((Boat) boat).stopSwimming();
        boat.power();


    }
}