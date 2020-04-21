package hu.farm;

public class Turkey extends Animal implements AttackerInterface{

    private int attackScore;

    public Turkey(int age, int hp) {
        super(age, hp);
        this.setType("turkey");
        this.setDomestic(true);
        this.setEdible(true);
        this.setForFun(false);
        this.setForSecure(false);
        this.attackScore = 8;
    }

    public int getAttackScore() {
        return attackScore;
    }

    @Override
    public void sayHello() {
        System.out.println("hello gobble gobble");
    }

    @Override
    public void getDeathScream() {
        System.out.println("goooobble... cough.. cough..");
    }
}
