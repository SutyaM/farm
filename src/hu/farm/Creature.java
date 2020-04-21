package hu.farm;

public abstract class Creature {

    private int age;
    private int hp;
    private boolean live;

    public Creature() {
    }

    public Creature(int age, int hp, boolean live) {
        this.age = age;
        this.hp = hp;
        this.live = live;
    }

    public int getAge() {
        return age;
    }

    public int getHp() {
        return hp;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHp(int hp) {
        if (hp <= 0) {
            hp = 0;
            this.setLive(false);
            this.getDeathScream();
        }
        this.hp = hp;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    public abstract void getDeathScream();

    public boolean isLive() {
        if(this.live) {
            return true;
        } else {
            return false;
        }
    }
}
