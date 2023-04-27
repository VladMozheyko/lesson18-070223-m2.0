public class Player {
    private String name;                                       // Поля класса
    private Card[] cards;

    public Player(String name, Card[] cards) {                 // Конструктор
        this.name = name;
        this.cards = cards;
    }

    public void displayCards(){                               // Метод для отображения карт игрока
        for (int i = 0; i < cards.length; i++) {
            if(cards[i] == null){                              // Если карты нет, вывожу сообщение
                System.out.println("null");
            }
            else {
                System.out.println(cards[i].toString());      // Если карта есть, вывожу ее
            }
        }
    }

    public void makeMove(int number){                         // Метод для того, чтобы сделать ход
        System.out.println(name + " сделал ход картой: " + cards[number]);   // Вывожу карту и имя игрока
        cards[number] = null;                                     // Удаляю карту
    }


}
