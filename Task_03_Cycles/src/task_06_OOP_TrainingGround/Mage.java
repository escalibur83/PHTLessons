package task_06_OOP_TrainingGround;

public class Mage extends Hero {

    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(3);
    }
}
