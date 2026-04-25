public class Robot extends GameCharacter {

    public Robot(String name) {
        super(name, 150);
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println(name + " fires laser at " + target.getName());
        target.takeDamage(20);
    }
}
