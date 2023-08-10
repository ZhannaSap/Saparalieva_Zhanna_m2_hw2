public class IPhone extends SmartPhone implements Printable{
    private String camera;
    public IPhone(String name, double memory, String camera) {
        super(name, memory);
        this.camera = camera;
    }

    @Override
    public void print() {
        System.out.println("NAME: " + this.getName() + "\nMEMORY: "
                + this.getMemory() + "\nCAMERA: " + this.camera);
    }
}
