public abstract class EnemyShip {

    private String name;
    private double amtDamage;

    public String getName() {
        return this.name;
    }

    public void setName(String shipName) {
        this.name = shipName;
    }

    public double getAmtDamage() {
        return amtDamage;
    }

    public void setAmtDamage(double amtDamage) {
        this.amtDamage = amtDamage;
    }

    public void chaseHeroShip() {
        System.out.println(getName() + " is following the hero");
    }

    public void showEnemyShip() {
        System.out.println(getName() + " is on the screen");
    }

    public void enemyShipShoots() {
        System.out.println(getName() + " is shooting at the hero ship and doing " + getAmtDamage() + " damage");
    }
}
