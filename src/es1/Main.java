package es1;

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo1 = new Rettangolo(5.0, 10.0);
        Rettangolo rettangolo2 = new Rettangolo(3.0, 7.0);

        System.out.println("Rettangolo 1:");
        rettangolo1.stampaRettangolo();

        System.out.println("\nRettangolo 2:");
        rettangolo2.stampaRettangolo();

        System.out.println("\nSomma delle aree: " + (rettangolo1.calculateArea() + rettangolo2.calculateArea()));
        System.out.println("Somma dei perimetri: " + (rettangolo1.calculatePerimeter() + rettangolo2.calculatePerimeter()));
    }
}
