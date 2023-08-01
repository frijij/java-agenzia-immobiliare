package lessons.java.agenzia;

import java.util.ArrayList;
import java.util.List;

public class AgenziaImmobiliare {

    // ATTRIBUTI
    private List<Immobile> listaImmobili;

    // COSTRUTTORI
    public AgenziaImmobiliare() {
      listaImmobili = new ArrayList<>();
    }
    // GETTER E SETTER

    // METODI
    // aggiugnere un immobile
    public void aggiungiImmobile(Immobile immobile){
        listaImmobili.add(immobile);
    }

    // cercare un immobile tramite codice alfanumerico
    public Immobile trovaImmobile (String codiceImmobile){
        for (Immobile immobile:listaImmobili){
            if (codiceImmobile.equals(immobile.getCodiceImmobile())){
                return immobile;
            }
        }
        return null;
    }

    // restituire l'immobile con il maggior numero di persone interessate
    public Immobile conPiuInteressati() {
      Immobile immobilePiuPiaciuto = null;
        int interessati =0;
            for (Immobile immobile : listaImmobili){
            if (immobile.getInteressati()>interessati){
                immobilePiuPiaciuto = immobile;
            }
        }
        return immobilePiuPiaciuto;
    }

    @Override
    public String toString() {
        return "Agenzia Immobiliare{" +
                "lista immobili=" + listaImmobili +
                '}';
    }
}
