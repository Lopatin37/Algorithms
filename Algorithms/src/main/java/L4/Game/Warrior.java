package L4.Game;

import L3.Main;

class Warrior extends Hero {

    public Warrior(String name) {
        health = 250 + (int)(Math.random()*50);
        this.name = name;
        damage = 50 + (int)(Math.random()*30);
        addHeal = 0;
    }

    @Override
    void hit(Hero hero) {
        if (hero != this) {
            if(health <= 0) {
                System.out.println("Герой погиб и бить не может!");
            } else {
                totalDamage += damage;
                hero.causeDamage(damage);
            }
            System.out.println(this.name + " нанес урон " + hero.name);
        }
    }

    @Override
    void healing(Hero hero) {
        System.out.println("Войны не умеют лечить!");
    }
}
