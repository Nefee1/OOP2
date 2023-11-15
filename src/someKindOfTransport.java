public abstract class someKindOfTransport {
    private final String modelName;
    private final int wheelsCount;

    public someKindOfTransport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void service(){
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }

    public void serviceMotor(){
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
            checkEngine();
        }
    }
}