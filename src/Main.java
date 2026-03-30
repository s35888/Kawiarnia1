public class Main {
    public static void main(String[] args) {

        ProduktMenu kawa1 = new ProduktMenu("K01", "Espresso", 10,  "Kawy");
        ProduktMenu kawa2 = new ProduktMenu("K02", "Latte", 14,  "Kawy");
        ProduktMenu sernik = new ProduktMenu("C01", "Sernik", 12,  "Desery");


        KlientKawiarni klient1 = new KlientKawiarni(1, "Piotr", "Milczarski", "piotr@milczar.pl");
        KlientKawiarni klient2 = new KlientKawiarni(2,"Jan", "Kowalski", "jan@kowalski");


        Zamowienie zamowienie = new Zamowienie(klient1);
        zamowienie.dodajProduktMenu(kawa1);
        zamowienie.dodajProduktMenu(kawa2);
        zamowienie.dodajProduktMenu(sernik);

        System.out.println(klient1.toString());
        System.out.println(zamowienie);
        System.out.println("Łączna wartość: " + zamowienie.policzWartosc());
        System.out.println("Liczba pozycji: " + zamowienie.policzLiczbeProduktow());
        System.out.println("Liczba produktów utworzonych w systemie: " + ProduktMenu.getLiczbaProduktów());

        ProduktMenu kopiaEspresso = new ProduktMenu("K-01", "Espresso duplikat", 9.0, "kawa");
        System.out.println("Czy produkty są równe? " + kawa1.equals(kopiaEspresso));

        zamowienie.oznaczJakoOplacone();
        System.out.println(zamowienie);
    }
}
