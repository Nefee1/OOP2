public abstract class CheakMotorr extends someKindOfTransportt {
    public CheakMotorr(String modelName, int wheelsCount) {
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