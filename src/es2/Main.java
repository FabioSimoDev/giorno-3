package es2;

public class Main {
    public static void main(String[] args) {
        // creazione di una SIM con un numero di telefono
        SIM sim = new SIM("1234567890");

        // effettua alcune chiamate e ricarica il credito
        sim.effettuaChiamata(5, "987654321");
        sim.ricaricaCredito(10.0);
        sim.effettuaChiamata(8, "555555555");
        sim.effettuaChiamata(3, "777777777");
        sim.effettuaChiamata(10, "888888888");

        // stampa i dati della SIM
        sim.stampaDatiSIM();
    }
}
