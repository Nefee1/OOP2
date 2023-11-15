public class ServiceStation extends someKindOfTransport {
    public ServiceStation(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void check(someKindOfTransport someKindOfTransport) {
        super.serviceMotor();
        someKindOfTransport.service();
    }
}
