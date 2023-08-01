package lessons.java.agenzia;

public class Immobile {
    // ATTRIBUTI: un codice alfanumerico, indirizzo, cap, città, una superficie espressa in mq attraverso un numero intero.,
    // interessati
    private String codiceImmobile;
    private String indirizzo;
    private String cap;
    private String citta;
    private int superficieInMq;
    private int interessati;

    // COSTRUTTORI

    public Immobile(String codiceImmobile, String indirizzo, String cap, String citta, int superficieInMq, int interessati) {
        this.codiceImmobile = codiceImmobile;
        this.indirizzo = indirizzo;
        this.cap = cap;
        this.citta = citta;
        this.superficieInMq = superficieInMq;
        this.interessati = interessati;
    }


    // GETTER E SETTER
    public String getCodiceImmobile() {
        return codiceImmobile;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public String getCap() {
        return cap;
    }

    public String getCitta() {
        return citta;
    }

    public int getSuperficieInMq() {
        return superficieInMq;
    }

    public int getInteressati() {
        return interessati;
    }

    // METODI
    // incrementare il numero degli interessati
   public int aggiungiInteressati(){
        return interessati++;
}
    // reimpostare la superficie prendendo in input la nuova superficie
    public void reimpostaSuperficie(int superficieInMq) {
        this.superficieInMq = superficieInMq;
    }

    @Override
    public String toString() {
        return "Immobile{" +
                "codice immobile:'" + codiceImmobile + '\'' +
                ", indirizzo: '" + indirizzo + '\'' +
                ", CAP: '" + cap + '\'' +
                ", città: '" + citta + '\'' +
                ", superficie in mq: " + superficieInMq +
                ", interessati: " + interessati +
                '}';
    }
}
