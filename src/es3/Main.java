package es3;

public class Main {
    public static void main(String[] args) {
        // creazione di alcuni articoli
        Articolo articolo1 = new Articolo(1, "Prodotto 1", 19.99, 10);
        Articolo articolo2 = new Articolo(2, "Prodotto 2", 29.99, 5);
        Articolo articolo3 = new Articolo(3, "Prodotto 3", 39.99, 3);

        // creazione di un cliente
        Cliente cliente1 = new Cliente(1, "Mario Rossi", "mario@email.com", "01/01/2023");

        // creazione del carrello per il cliente
        Carrello carrelloCliente1 = new Carrello(cliente1);

        // aggiunta di articoli al carrello
        carrelloCliente1.aggiungiArticolo(articolo1);
        carrelloCliente1.aggiungiArticolo(articolo2);
        carrelloCliente1.aggiungiArticolo(articolo3);

        // rimozione di un articolo dal carrello
        carrelloCliente1.rimuoviArticolo(2);

        // visualizzazione del carrello
        carrelloCliente1.visualizzaCarrello();
    }
}
