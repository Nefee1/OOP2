public class Truck extends someKindOfTransport {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    public void serviceMotor() {
        super.serviceMotor();
        checkTrailer();
    }
}