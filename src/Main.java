import java.util.Random;

public class Main {
    public static void main(String[] args) {


        Printable iPhone = createObject("2nd");
        Printable redmi = createObject("3rd");
        Printable samsung = createObject("4th");

        Printable[] smartPhones = {iPhone, redmi,samsung};

        for (Printable phone: smartPhones) {
            phone.print();
            System.out.println("--------------------");
        }
    }

    public static Printable createObject(String className){
        switch (className){
            case "2nd":
                IPhone iPhone = new IPhone("IPhone 14Pro",128, "12 Мп");
                return iPhone;
            case "3rd":
                Redmi redmi = new Redmi("Redmi note 9", 128, 16000);
                return redmi;
            case "4th":
                Samsung samsung = new Samsung("Samsung Galaxy s23", 256, "Excellent");
                return samsung;
            default:
                System.out.println("Неизвестный тип объекта");
                return null;
        }
    }
}