package javadz1N2;

public class Aircraft extends Vehicle implements Flyable {
    int maxAltitude;
    boolean isFlying;
    enum State {
        On, Off;
    }
    private State state;
    public Aircraft(String brand, String model, int year, int maxAltitude) { // Конструктор
        super(brand, model, year);
        this.maxAltitude = maxAltitude;
        this.isFlying = false;
        this.state = State.Off;
    }
    @Override
    public void power() { // включает или выключает двигатель
        if(state == Aircraft.State.Off) {
            this.startEngine();
            this.state = Aircraft.State.On;
        }
        else {
            this.stopEngine();
            this.state = Aircraft.State.Off;
        }
    }
    @Override
    public void takeOff() { // Взлет
        isFlying = true;
        System.out.println("Взлет самолета");
    }
    @Override
    public void land() { // Посадка
        this.isFlying = false;
        System.out.println("Была совершена посадка");
    }
    protected void startEngine() { // Статус двигателя
        System.out.println("Двигатель запущен");
    }
    protected void stopEngine() { // Статус двигателя
        System.out.println("Двигатель остановлен");
    }
    public int getMaxAltitude() { // Возвращает максимальную высоту полета
        return maxAltitude;
    }
    public String getFlying() { // Возвращает статус полета
        if(isFlying) {
            return "Осуществляется полет";
        } else {
            return "Взлет не осуществлен";
        }
    }
        @Override
    void displayInfo() { // Отображает информацию
        System.out.println(String.format(super.getInfo() + " Максимальная высота: %d, Статус полета: %s ",
                getMaxAltitude(), getFlying()));
    }
}
