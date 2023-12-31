package javadz1N2;
public class Boat extends Vehicle implements Swimmable {

    int maxSpeed;
    boolean isSailing;
    enum State {
        On, Off;
    }
    private Boat.State state;
    public Boat(String brand, String model, int year, int maxSpeed) { // Конструктор
        super(brand, model, year);
        this.maxSpeed = maxSpeed;
        this.isSailing = false;
        this.state = Boat.State.Off;
    }
    @Override
    public void power() { // Статус двигателя
        if(state == Boat.State.Off) {
            this.startEngine();
            this.state = Boat.State.On;
        }
        else {
            this.stopEngine();
            this.state = Boat.State.Off;
        }
    }
    @Override
    public void startSwimming() { // Вызывается при изменении статуса движения
        this.isSailing = true;
        System.out.println("Начало движения");
    }
    @Override
    public void stopSwimming() { // Вызывается при изменении статуса движения
        this.isSailing = false;
        System.out.println("Остановка движения");
    }
    @Override
    protected void startEngine() { // Статус двигателя
        System.out.println("Двигатель запущен");
    }
    @Override
    protected void stopEngine() {// Статус двигателя
        System.out.println("Двигатель остановлен");
    }
    public int getMaxSpeed() { // Возвращает максимальную скорость
        return maxSpeed;
    }

    public String getSailing() { 
        if(isSailing) {
            return "Осуществляется движение";
        } else {
            return "Движение не осуществлятся";
        }
        
    }
        @Override
    void displayInfo() {
        System.out.println(String.format(super.getInfo() + " Максимальная скорость: %d, Статус движения: %s ", // Вывод информации
                getMaxSpeed(), getSailing()));
    }

}
