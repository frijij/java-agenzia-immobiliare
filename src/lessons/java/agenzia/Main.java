package lessons.java.agenzia;


public class Main {
    public static void main(String[] args) {

        // creo i miei immobili
        Box box1 = new Box("B001", "Viale Michelangelo, 150", "90145",
                "Palermo", 45, 0, 3);
        Abitazione appartamento1 = new Abitazione("A001", "Via Leonardo Da Vinci, 238",
                "90135", "Palermo", 95, 0, 3, 1);
        Villa villa1 = new Villa("A002", "Via Francesco Baracca, 35", "90136",
                "Palermo", 150,0, 5, 2, 20);
        AgenziaImmobiliare agenzia = new AgenziaImmobiliare();

        // testo metodo aggiungiImmobile
        agenzia.aggiungiImmobile(box1);
        agenzia.aggiungiImmobile(appartamento1);
        agenzia.aggiungiImmobile(villa1);
        System.out.println(agenzia);

        // testo metodo reimpostaSuperfcie
        appartamento1.reimpostaSuperficie(97);
        System.out.println(appartamento1);
        villa1.reimpostaSuperficie(147, 23);
        System.out.println(villa1);

        // testo metodo aggiungiInteressati
        appartamento1.aggiungiInteressati();
        System.out.println("Appartamento 1 - Interessati: " + appartamento1.getInteressati());

        // testo metodo trovaImmobile
        System.out.println("Sto cercando un immobile con codice A001... ");
        System.out.println(agenzia.trovaImmobile("A001"));
        System.out.println("Sto cercando un immobile con codice A006... ");
        System.out.println(agenzia.trovaImmobile("A006"));

        // testo metodo per vedere l'immobile con più interessati
        System.out.println(agenzia.conPiuInteressati() + " è l'immobile con più interessati.");
        // aumento gli interessati a un altro immobile per testare nuovamente
        // il metodo conPiuInteressati
        villa1.aggiungiInteressati();
        villa1.aggiungiInteressati();
        System.out.println(agenzia.conPiuInteressati() + " è l'immobile con più interessati.");

    }
}
