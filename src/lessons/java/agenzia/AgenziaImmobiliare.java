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
       boolean trovato = false;
       int contatore=0;
       Immobile immobileCercato = null;
        while (!trovato && contatore<listaImmobili.size()){
            if (codiceImmobile.equals(immobileCercato.getCodiceImmobile())) {
                trovato=true;
            }
            contatore ++;
        }
        return immobileCercato;
    }

    // restituire l'immobile con il maggior numero di persone interessate
    public Immobile piuInteressati() {
        Immobile immobilePiuPiaciuto = null;
        for (Immobile immobile : listaImmobili){
            if (immobile.getInteressati()>immobilePiuPiaciuto.getInteressati()){
                immobilePiuPiaciuto = immobile;
            }
        }
        return immobilePiuPiaciuto;
    }
}
