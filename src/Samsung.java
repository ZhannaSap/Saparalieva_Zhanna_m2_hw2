public class Samsung extends SmartPhone implements Printable{
    private String quality;

    public Samsung(String name, double memory, String quality) {
        super(name, memory);
        this.quality = quality;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    @Override
    public void print() {
        System.out.println("NAME: " + this.getName() + "\nMEMORY: "
                + this.getMemory() + "\nQUALITY: " + this.quality);
    }
}
