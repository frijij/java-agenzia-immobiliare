package lessons.java.agenzia;

public class Main {
    public static void main(String[] args) {

        Box box1 = new Box("B001", "Viale Michelangelo, 150", "90145",
                "Palermo", 45, 1, 3);
        Abitazione appartamento1 = new Abitazione("A001", "Via Leonardo Da Vinci, 238",
                "90135", "Palermo", 95, 1, 3, 1);
        Villa villa1 = new Villa("A002", "Via Francesco Baracca, 35", "90136",
                "Palermo", 150,1, 5, 2, 20);

    AgenziaImmobiliare agenzia = new AgenziaImmobiliare();
    agenzia.aggiungiImmobile(box1);
    agenzia.aggiungiImmobile(appartamento1);
    agenzia.aggiungiImmobile(villa1);

    }
}
