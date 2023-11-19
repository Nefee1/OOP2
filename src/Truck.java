public class Truck extends CheakMotorr {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    public void service() {
        super.service();
        checkTrailer();
    }
}