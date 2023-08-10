public abstract class SmartPhone {
    private String name;
    private double memory;

    public SmartPhone(String name, double memory) {
        this.name = name;
        this.memory = memory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }
}
