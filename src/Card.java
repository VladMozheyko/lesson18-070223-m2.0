public class Card {
    private String suit;                        // Масть: бубны, крести, пики, черви
    private String value;                       // Достоинство: Туз, король, дама, валет и т.д.
    private int cost;                           // В зависимости от игры карту будут друг друга бить, чтобы определять какая карта старше другой, введем эту переменную

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Масть: " + suit +
                " Достоинство:" + value;

    }
}
