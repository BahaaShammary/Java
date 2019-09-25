public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String shipType) {
            EnemyShip enemyShip = null;

            if (shipType.equals("D")) {
                enemyShip = new DestroyerEnemyShip();
            }
            else if (shipType.equals("F")) {
                enemyShip = new FrigateEnemyShip();
            }
            return enemyShip;
    }
}
