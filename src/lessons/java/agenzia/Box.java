package lessons.java.agenzia;

public class Box extends Immobile{
    // ATTRIBUTI: numero di posti auto
    private int numPostiAuto;

    // COSTRUTTORI
    public Box(String codiceImmobile, String indirizzo, String cap, String citta, int superficieInMq, int interessati, int numPostiAuto) {
        super(codiceImmobile, indirizzo, cap, citta, superficieInMq, interessati);
        this.numPostiAuto = numPostiAuto;
    }

    // GETTER E SETTER

    // METODI

    @Override
    public String toString() {
        return "Box{" +
                "codice immobile:'" + getCodiceImmobile() + '\'' +
                ", indirizzo: '" + getIndirizzo() + '\'' +
                ", CAP: '" + getCap() + '\'' +
                ", città: '" + getCitta() + '\'' +
                ", superficie in mq: " + getSuperficieInMq() +
                ", posti auto: " + numPostiAuto +
                ", interessati: " + getInteressati() +
                '}';
    }
}
