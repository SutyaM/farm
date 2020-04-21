package hu.farm;

public class Cat extends Animal{

    public Cat(int age, int hp) {
        super(age, hp);
        this.setType("cat");
        this.setDomestic(true);
        this.setEdible(false);
        this.setForFun(true);
        this.setForSecure(false);
    }

    @Override
    public void sayHello() {
        System.out.println("hello meow meow");
    }

    @Override
    public void getDeathScream() {
        System.out.println("meoooooww... cough.. cough.. meow.. me..");
    }
}
