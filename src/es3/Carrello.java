package es3;

class Carrello {
    private Cliente clienteAssociato;
    private Articolo[] elencoArticoli;
    private double totaleCostoArticoli;

    public Carrello(Cliente clienteAssociato) {
        this.clienteAssociato = clienteAssociato;
        this.elencoArticoli = new Articolo[10]; // esempio, solo 10 articoli nel carrello
        this.totaleCostoArticoli = 0.0;
    }

    public void aggiungiArticolo(Articolo articolo) {
        if (articolo.getNumeroPezziDisponibili() > 0) {
            for (int i = 0; i < elencoArticoli.length; i++) {
                if (elencoArticoli[i] == null) {
                    elencoArticoli[i] = articolo;
                    articolo.setNumeroPezziDisponibili(articolo.getNumeroPezziDisponibili() - 1);
                    totaleCostoArticoli += articolo.getPrezzo();
                    System.out.println("Articolo aggiunto al carrello.");
                    return;
                }
            }
            System.out.println("Il carrello è pieno. Rimuovi un articolo prima di aggiungerne un altro.");
        } else {
            System.out.println("Articolo non disponibile.");
        }
    }

    public void rimuoviArticolo(int codiceArticolo) {
        for (int i = 0; i < elencoArticoli.length; i++) {
            if (elencoArticoli[i] != null && elencoArticoli[i].getCodiceArticolo() == codiceArticolo) {
                totaleCostoArticoli -= elencoArticoli[i].getPrezzo();
                elencoArticoli[i].setNumeroPezziDisponibili(elencoArticoli[i].getNumeroPezziDisponibili() + 1);
                elencoArticoli[i] = null;
                System.out.println("Articolo rimosso dal carrello.");
                return;
            }
        }
        System.out.println("Articolo non trovato nel carrello.");
    }

    public void visualizzaCarrello() {
        System.out.println("Carrello di " + clienteAssociato.getNomeCognome());
        for (Articolo articolo : elencoArticoli) {
            if (articolo != null) {
                System.out.println("Codice articolo: " + articolo.getCodiceArticolo());
                System.out.println("Descrizione articolo: " + articolo.getDescrizioneArticolo());
                System.out.println("Prezzo: " + articolo.getPrezzo());
                System.out.println("------------------------------");
            }
        }
        System.out.println("Totale costo articoli: " + totaleCostoArticoli);
    }
}
