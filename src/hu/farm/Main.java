package hu.farm;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Animal[] farm = new Animal[100];

        for (int i = 0; i < farm.length; i++) {
            Random rand = new Random();
            int numb = rand.nextInt(100);
            if (numb < 61) {
                farm[i] = new Chicken(1, 10);
            } else if (numb > 60 && numb < 81) {
                farm[i] = new Wolf(3, 50);
            } else if (numb > 80 && numb < 91) {
                farm[i] = new Dog(2, 47);
            } else if (numb > 90 && numb < 96) {
                farm[i] = new Turkey(1, 18);
            } else if (numb > 95) {
                farm[i] = new Cat (4, 20);
            }
        }

        while(farmAlive(farm)) {
            attack(farm);
        }


    }

    public static boolean wolfAlive(Animal[] farm) {
        for (int i = 0; i < farm.length; i++) {
            if (farm[i] instanceof Wolf && farm[i].isLive()) {
                return true;
            }
        }
        return false;
    }

    public static boolean notWolfAlive(Animal[] farm) {
        for (int i = 0; i< farm.length; i++) {
            if(farm[i].getType() != "wolf" && farm[i].isLive()) {
                return true;
            }
        }
        return false;
    }

    public static boolean farmAlive(Animal[] farm) {
        if(wolfAlive(farm) && notWolfAlive(farm)) {
            return true;
        }
        return false;
    }

    public static void fightDog(Wolf w, Dog d) {
        d.setHp(d.getHp() - w.getAttackScore());
        w.setHp(w.getHp() - d.getAttackScore());
    }

    public static void fightTurkey(Wolf w, Turkey t) {
        t.setHp(t.getHp() - w.getAttackScore());
        w.setHp(w.getHp() - t.getAttackScore());
    }

    public static void attack(Animal [] farm) {
        for (int i = 0; i < farm.length; i++) {
            if ( farm[i] instanceof Wolf) {
                Wolf attacker = (Wolf) farm[i];
                Random rand = new Random();
                int numb = rand.nextInt(100);
                Animal defender = farm[numb];
                while(attacker.getHp() > 0 && defender.getHp() > 0) {
                    attackAnimal(attacker, defender);
                }
            }
        }
    }

    public static void attackAnimal(Wolf attacker, Animal defender) {
        defender.setHp(defender.getHp() - attacker.getAttackScore());
        if(defender.isLive()) {
            if(defender instanceof AttackerInterface) {
                AttackerInterface def = (AttackerInterface) defender;
                attacker.setHp(attacker.getHp() - def.getAttackScore());
            }
        }
    }

}
