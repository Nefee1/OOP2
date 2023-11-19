public abstract class someKindOfTransportt implements Maintainable {
    private final String modelName;
    private final int wheelsCount;

    public someKindOfTransportt(String modelName, int wheelsCount) {
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

    public void service(){
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }
}