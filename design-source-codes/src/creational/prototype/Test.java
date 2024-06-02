package creational.prototype;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {

        Game game1 = new Game();
        game1.setId(1);
        game1.setName("Overwatch");

        Game game2 = game1.clone();
        System.out.printf("Game1: %s", game1);
        System.out.printf("Game2: %s", game2);
    }
}
