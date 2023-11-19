public abstract class CheakMotor extends someKindOfTransport{
    public CheakMotor(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    public void service(){
        super.service();
        checkEngine();
    }

}