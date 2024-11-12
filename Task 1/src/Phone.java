public class Phone {
    String number;
    String model;
    int weight;

    static String manufacturerCountry;

    public Phone() {
    }


    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит абонент по имени " + name + (number == "" ? " ? " : " номер " + number));
    }
}
