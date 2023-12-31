package javadz1N2;
public abstract class Vehicle {
    protected static int id;
    protected String brand;
    protected String model;
    protected int year;
    static {
        Vehicle.id = 0;
    }
    protected int currentSpeed = 0;
    public Vehicle(String brand, String model, int year) {
        this.id++;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    protected void startEngine() { // Статус двигателя
        System.out.println("Двигатель запущен");
    }
    protected void stopEngine() { // Статус двигателя
        System.out.println("Двигатель остановлен");
    }

    public void accelerate(int speed) { // Ускорение
        currentSpeed += speed;
    }
    public void stop() { // Остановка
        currentSpeed = 0;
        System.out.println("Движение прекращено");
    }
    public void refuel(int liters) { // Перезаправка
        System.out.println("Топливо заправлено");
    }
    abstract void displayInfo(); // Отображение информации
    public int getId() { // Возвращает ID тачки
        return id;
    }
    public String getBrand() { // Возвращает бренд
        return brand;
    }
    public String getModel() { // Возвращает модель
        return model;
    }
    public int getYear() { // Возвращает год
        return year;
    }
    protected String getInfo() { // Возвращает формат информации
        return String.format("id: %d, Бренд: %s, Модель: %s, Год: %d, Скорость: %d,",
                getId(), getBrand(), getModel(), getYear(), currentSpeed);
    }
    public abstract void power(); // Переключение статуса двигателя
}
