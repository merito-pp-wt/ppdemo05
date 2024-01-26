public class Main {
    public static void main(String[] args) {

        // Tworzymy nowy obiekt klasy pies i nazywamy go Burek
        Dog d = new Dog("Burek");

        // Wyświetlamy imię psa
        System.out.println("To jest pies " + d.getName() );

        // Wyświetlamy obiekt pies. Java po cichu wywołuje funkcję toString()
        System.out.println(d);

        // Zmieniamy imię psa
        d.setName("Reksio");

        // Wyświetlamy ponownie ten sam obiekt. Porównaj wynik na ekranie.
        System.out.println(d);
    }
}