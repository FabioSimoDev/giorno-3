package es2;

class SIM {
    private String numeroTelefono;
    private double creditoDisponibile;
    private Chiamata[] ultimeChiamate;
    private int numeroChiamate;

    public SIM(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.creditoDisponibile = 0;
        this.ultimeChiamate = new Chiamata[5];
        this.numeroChiamate = 0;
    }

    public void effettuaChiamata(int durata, String numeroChiamato) {
        if (creditoDisponibile >= durata) {
            Chiamata chiamata = new Chiamata(durata, numeroChiamato);

            // sposta le chiamate precedenti in avanti nell'array
            for (int i = ultimeChiamate.length - 1; i > 0; i--) {
                ultimeChiamate[i] = ultimeChiamate[i - 1];
            }

            ultimeChiamate[0] = chiamata; // aggiungi la nuova chiamata
            numeroChiamate++;

            creditoDisponibile -= durata;
        } else {
            System.out.println("Credito insufficiente per effettuare la chiamata.");
        }
    }

    public void ricaricaCredito(double importo) {
        creditoDisponibile += importo;
    }

    public void stampaDatiSIM() {
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Credito disponibile: " + creditoDisponibile + " euro");
        System.out.println("Ultime " + numeroChiamate + " chiamate effettuate:");
        for (int i = 0; i < numeroChiamate; i++) {
            System.out.println((i + 1) + ": " + ultimeChiamate[i]);
        }
    }
}
