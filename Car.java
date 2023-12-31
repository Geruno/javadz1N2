package javadz1N2;
public class Car extends Vehicle{
    private int fuelCapacity;
    private int currentFuelLevel;
    enum State {
        On, Off;
    }
    private State state;
    public Car(String brand, String model, int year, int fuelCapacity) { // Конструктор
        super(brand, model, year);
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = 10;
        this.state = State.Off;
    }
    public void power() { // Переключение статуса двигателя
        if(state == State.Off) {
            this.startEngine();
            this.state = State.On;
        }
        else {
            this.stopEngine();
            this.state = State.Off;
        }
    }
    @Override
    protected void startEngine() { // Статус двигателя
        System.out.println("Двигатель автомобиля запущен");
    }
    @Override
    protected void stopEngine() { // Статус двигателя
        System.out.println("Двигатель автомобиля остановлен");
    }
    @Override
    public void stop() { // Остановка движения
        currentSpeed = 0;
        System.out.println("Движение автомобиля прекращено");
    }
    public int getFuelCapacity() { // Возвращает максимальное колличество бензина
        return fuelCapacity;
    }
    public int getCurrentFuelLevel() { // Возвращает нынешнее колличество бензина
        return currentFuelLevel;
    }
    @Override
    public void refuel(int liters) { // Заправка
        if (getCurrentFuelLevel() + liters <= getFuelCapacity()) {
            this.currentFuelLevel = getCurrentFuelLevel() + liters;
            System.out.println("Уровень топлива увеличен до: " + getCurrentFuelLevel());
        } else {
            System.out.println("Бак полон. Уровень топлива увеличен на: " + (getFuelCapacity() - getCurrentFuelLevel()));
        }
    }
    @Override
    void displayInfo() { // Отображение информации
        System.out.println(String.format(super.getInfo() + " Размер бака: %d,  Топлива сейчас: %d ", getFuelCapacity(),
                getCurrentFuelLevel()));
    }
}
