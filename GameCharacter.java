//public abstract class GameCharacter implements Attackable {
//
//    protected String name;
//    protected int health;
//
//    public GameCharacter(String name, int health) {
//        this.name = name;
//        this.health = health;
//    }
//
//    public void takeDamage(int damage) {
//        health -= damage;
//        if (health < 0) health = 0;
//        System.out.println(name + " takes " + damage + " damage. HP = " + health);
//    }
//
//    public boolean isAlive() {
//        return health > 0;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getHealth() {
//        return health;
//    }
//
//    public void showInfo() {
//        System.out.println(name + " | HP: " + health);
//    }
//}
