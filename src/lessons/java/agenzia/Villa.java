package lessons.java.agenzia;

public class Villa extends Abitazione{
    // ATTRIBUTI: superficie del giardino
    private int superficieGiardino;

    // COSTRUTTORI

    public Villa(String codiceImmobile, String indirizzo, String cap, String citta, int superficieInMq, int interessati, int vani, int bagni, int superficieGiardino) {
        super(codiceImmobile, indirizzo, cap, citta, superficieInMq, interessati, vani, bagni);
        this.superficieGiardino = superficieGiardino;
    }

    // GETTER E SETTER

    // METODI
// Implementare nella classe Villa l’overload di reimpostaSuperficie.
// In questo caso prenderà i parametri superficie e superficieGiardino.
    public void reimpostaSuperficie(int superficieInMq, int superficieGiardino) {
        super.reimpostaSuperficie(superficieInMq);
        this.superficieGiardino = superficieGiardino;
    }
    @Override
    public String toString() {
        return "Villa{" +
                "codice immobile:'" + getCodiceImmobile() + '\'' +
                ", indirizzo: '" + getIndirizzo() + '\'' +
                ", CAP: '" + getCap() + '\'' +
                ", città: '" + getCitta() + '\'' +
                ", superficie in mq: " + getSuperficieInMq() +
                ", vani: " + getVani() +
                ", bagni: " + getBagni() +
                ", superficie giardino: " + superficieGiardino +
                ", interessati: " + getInteressati() +
                '}';
    }
}
