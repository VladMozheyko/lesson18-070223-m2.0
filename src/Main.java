public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck();                  // Создаю колоду. Объект класса Deck
        deck.generateDeck();                     // В объекте класса Deck генерирую колоду
        System.out.println("Колода до раздачи карт: ");
        deck.display();
        deck.distributeCards();                  // Даю команду объекту класса Deck раздать карты двум игрокам.
        Card[] player1 = deck.getPlayer1();      // Получаю карты первого игрока
        Card[] player2 = deck.getPlayer2();      // Получаю карты второго игрока

        System.out.println("Колода после раздачи карт: ");
        deck.display();

        System.out.println("Карты первого игрока: ");
        for (int i = 0; i < player1.length ; i++) {    // Вывожу колоду первого игрока
            System.out.println(player1[i]);
        }

        System.out.println("Карты второго игрока: ");
        for (int i = 0; i < player2.length ; i++) {    // Вывожу колоду второго игрока
            System.out.println(player2[i]);
        }
                                                      // Создаем вторую колоду
        Deck deck1 = new Deck();
        deck1.generateDeck();
        System.out.println("Вторая колода: ");
        deck1.display();

        Player vlad = new Player("Vlad", player1);          // Создаем игроков. Даем им имя и карты
        Player masha = new Player("Masha", player2);

        System.out.println("Колода Влада:");                // Отображаем их колоды
        vlad.displayCards();

        System.out.println("Колода Маши:");
        masha.displayCards();

        vlad.makeMove(1);                                  // Каждый игрок делает ход

        masha.makeMove(4);

        System.out.println("Колода Влада:");               // Отображаем колоды после хода
        vlad.displayCards();

        System.out.println("Колода Маши:");
        masha.displayCards();

    }
}
