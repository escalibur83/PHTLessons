package task_06_OOP_TrainingGround;

public abstract class  Hero {
    private String name;
    private int health;

    public String getName() {
        return name;
    }
    public int getHealth() { return health; }

    public Hero (String name, int health)
    {
        this.name = name;
        this.health = health;
    }

    public abstract void attackEnemy(Enemy enemy);
}