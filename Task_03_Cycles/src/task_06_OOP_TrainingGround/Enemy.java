package task_06_OOP_TrainingGround;

public class Enemy implements Mortal {
    int health = 0;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Enemy(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;

        if (health < 0) {
            health = 0;
        }
    }


    @Override
    public boolean isAlive() {

        return health > 0;
    }
}
