import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        EnemyShipFactory enemyShipFactory = new EnemyShipFactory();
        Scanner userInput = new Scanner(System.in);
        System.out.println("What type of ship? (D/F)");
        EnemyShip enemyShip = null;

        if (userInput.hasNext()) {
            String shipType = userInput.nextLine();
            enemyShip = enemyShipFactory.makeEnemyShip(shipType);
        }
        if (enemyShip != null) {
            doSomething(enemyShip);
        }
        else {
            System.out.println("Enter a D or F next time please");
        }
    }

    private static void doSomething(EnemyShip anEnemyShip) {
        anEnemyShip.showEnemyShip();
        anEnemyShip.chaseHeroShip();
        anEnemyShip.enemyShipShoots();
    }
}
