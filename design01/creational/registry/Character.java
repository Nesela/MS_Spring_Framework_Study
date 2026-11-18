package design01.creational.registry;

public class Character {
    private String job;
    private int hp;
    private int attack;
    private int defense;
    private int level;

    public Character(String job, int hp, int attack, int defense, int level) {
        this.job = job;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.level = level;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Character copy() {
        return new Character(this.job, this.hp, this.attack, this.defense, this.level);
    }

    @Override
    public String toString() {
        return String.format("직업 : %s \n체력 : %d \t 공격력 : %d \t 방어력 : %d \t 레벨 : %d \t",
                job, hp, attack, defense, level);
    }
}
