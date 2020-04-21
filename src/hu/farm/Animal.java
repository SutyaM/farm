package hu.farm;

public abstract class Animal extends Creature{

    private String type;
    private boolean domestic;
    private boolean edible;
    private boolean forFun;
    private boolean forSecure;

    public Animal(){}

    public Animal(int age, int hp) {
        super(age, hp, true);
    }

    public void sayHello() {
        System.out.println("hello");
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public int getHp() {
        return super.getHp();
    }

    @Override
    public void getDeathScream() {
        getDeathScream();
    }

    public String getType() {
        return type;
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public void setHp(int hp) {
        super.setHp(hp);
    }

    @Override
    public void setLive(boolean live) {
        super.setLive(live);
    }

    public void setDomestic(boolean domestic) {
        this.domestic = domestic;
    }

    public void setEdible(boolean edible) {
        this.edible = edible;
    }

    public void setForFun(boolean forFun) {
        this.forFun = forFun;
    }

    public void setForSecure(boolean forSecure) {
        this.forSecure = forSecure;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isForSecure() {
        return forSecure;
    }

    public boolean isEdible() {
        return edible;
    }
}
