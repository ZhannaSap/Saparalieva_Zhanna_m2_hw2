public class Redmi extends SmartPhone implements Printable{
    private int price;

    public Redmi(String name, double memory, int price) {
        super(name, memory);
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println("NAME: " + this.getName() + "\nMEMORY: "
                + this.getMemory() + "\nPRICE: " + this.price);
    }
}
