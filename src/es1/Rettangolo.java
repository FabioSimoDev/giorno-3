package es1;

public class Rettangolo {
    double larghezza, altezza;

    public Rettangolo(double altezza, double larghezza){
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    //calcolo dell'area
    public double calculateArea(){
        return larghezza * altezza;
    }

    //calcolo del perimetro
    public double calculatePerimeter(){
        return (2 * larghezza) + (2 * altezza);
    }

    //stampo il rettangolo
    public void stampaRettangolo() {
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimetro: " + calculatePerimeter());
    }
}
