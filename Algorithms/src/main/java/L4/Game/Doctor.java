package L4.Game;

class Doctor extends Hero {

    public Doctor(String name) {
        health = 100 + (int)(Math.random()*20);
        this.name = name;
        damage = 10 + (int)(Math.random()*10);
        addHeal = 50 + (int)(Math.random()*30);
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
        hero.addHealth(addHeal);
    }
}
