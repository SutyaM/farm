package hu.farm;

public class Chicken extends Animal {

    public Chicken (int age, int hp) {
        super(age, hp);
        this.setType("chicken");
        this.setDomestic(true);
        this.setEdible(true);
        this.setForFun(false);
        this.setForSecure(false);
    }

    @Override
    public void sayHello() {
        System.out.println("hello cluck cluck");
    }

    @Override
    public void getDeathScream() {
        System.out.println("cluuuuck... cough.. cough.. clu.. cluck..");
    }
}
