package L4.Game;


class Assasin extends Hero {


    public Assasin(String name) {
        health = 150 + (int)(Math.random()*30);
        this.name = name;
        damage = 90 + (int)(Math.random()*20);
        addHeal = 0;
    }

    @Override
    void hit(Hero hero) {
        if (hero != this) {
            if(health <= 0) {
                System.out.println("Герой погиб и бить не может!");
            } else {
                int fullDamage = damage + getCricitalHit();
                totalDamage += fullDamage;
                hero.causeDamage(fullDamage);
            }
            System.out.println(this.name + " нанес урон " + hero.name);
        }
    }

    @Override
    void healing(Hero hero) {
        System.out.println("Убийцы не умеют лечить!");
    }

    public int getCricitalHit() {
        return 20 + (int)(Math.random()*10);
    }

}