package hu.farm;

public class Wolf extends Animal implements AttackerInterface {

    public int attackScore;

    public Wolf (int age, int hp) {
        super(age, hp);
        this.setType("wolf");
        this.setDomestic(false);
        this.setEdible(false);
        this.setForFun(false);
        this.setForSecure(false);
        this.attackScore = 12;
    }

    public int getAttackScore() {
        return attackScore;
    }

    @Override
    public void sayHello() {
        System.out.println("hello growl");
    }

    @Override
    public void getDeathScream() {
        System.out.println("GROOOOOOoooooooowwwlll.... cough...");
    }
}
