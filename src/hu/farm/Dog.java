package hu.farm;

public class Dog extends Animal implements AttackerInterface {

    private int attackScore;

    public Dog (int age, int hp) {
        super(age, hp);
        this.setType("dog");
        this.setDomestic(true);
        this.setEdible(false);
        this.setForFun(true);
        this.setForSecure(true);
        this.attackScore = 15;
    }

    public int getAttackScore() {
        return attackScore;
    }

    public void alert(Wolf w, Animal[] farm) {
        System.out.println("WOOOF-WOOOOF");
        for(int i = 0; i < farm.length; i++) {
            if(farm[i] instanceof Dog){
                Dog alertedDog = (Dog) farm[i];
                if(w.getHp() > 0) {
                    w.setHp(w.getHp() - alertedDog.getAttackScore());
                }
            }
        }
    }

    @Override
    public void sayHello() {
        System.out.println("hello woof woof");
    }

    @Override
    public void getDeathScream() {
        System.out.println("woooof... cough.. cough.. woo.. f..");
    }
}
