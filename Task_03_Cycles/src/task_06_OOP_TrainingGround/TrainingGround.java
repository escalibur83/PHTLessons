package task_06_OOP_TrainingGround;

public class TrainingGround {

    public static void main (String [] args){

        Enemy enemy = new Enemy(10);

        Warrior warrior = new Warrior("Ben", 1000);
        warrior.attackEnemy(enemy);
        Mage mage = new Mage("MakDak", 500);
        mage.attackEnemy(enemy);
        Archer archer = new Archer("Hood", 700);
        archer.attackEnemy(enemy);

        System.out.println("Enemy health after battle: " + enemy.health + " Is alive? "+enemy.isAlive());
    }
}