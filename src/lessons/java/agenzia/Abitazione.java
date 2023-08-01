package lessons.java.agenzia;

public class Abitazione extends Immobile{
    // ATTRIBUTI: numero di vani, numero bagni
    private int vani;
    private int bagni;

    // COSTRUTTORI

    public Abitazione(String codiceImmobile, String indirizzo, String cap, String citta, int superficieInMq, int interessati, int vani, int bagni) {
        super(codiceImmobile, indirizzo, cap, citta, superficieInMq, interessati);
        this.vani = vani;
        this.bagni = bagni;
    }

    // GETTER E SETTER

    public int getVani() {
        return vani;
    }

    public int getBagni() {
        return bagni;
    }

    // METODI
    @Override
    public String toString() {
        return "Abitazione{" +
                "codice immobile:'" + getCodiceImmobile() + '\'' +
                ", indirizzo: '" + getIndirizzo() + '\'' +
                ", CAP: '" + getCap() + '\'' +
                ", città: '" + getCitta() + '\'' +
                ", superficie in mq: " + getSuperficieInMq() +
                ", vani: " + vani +
                ", bagni: " + bagni +
                ", interessati: " + getInteressati() +
                '}';
    }
}
