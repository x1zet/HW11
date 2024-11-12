public class Main {
    public static void main(String[] args) {
        Phone.manufacturerCountry = "Тайланд";

        Phone petya = new Phone("+79042008274","Honor 70", 300);
        petya.receiveCall("Петя","+79042008274");

        Phone vasya = new Phone("","Iphone 15 Pro Max", 300);
        vasya.receiveCall("Вася","");

    }
}
