package L4.Game;

import java.util.Random;

public class NewGame {
    private Random randomStep = new Random();
    private Random randomHealing = new Random();
    private Hero[] team1;
    private Hero[] team2;
    private int totalTeam1Damage;
    private int totalTeam2Damage;
    private int teamSize;

    static void StartTheGame() {
        new NewGame().begin();
    }

    private NewGame() {
        team1 = new Hero[]{new Warrior("Тигрил")
                , new Assasin( "Акали")
                , new Doctor("Жанна")};


        team2 = new Hero[]{new Warrior( "Минотавр")
                , new Assasin( "Джинкс")
                , new Doctor("Зои")};
        totalTeam1Damage = 0;
        totalTeam2Damage = 0;
        teamSize = team1.length;
    }

    private void begin() {
        while(hasMember(team1) && hasMember(team2)) {
            for (int i = 0; i < team1.length; i++) {
                if(randomStep.nextInt(2) == 0) {
                    if(team1[i] instanceof Doctor) {
                        team1[i].healing(team1[randomHealing.nextInt(2)]);
                    } else {
                        if(hasMember(team2)) {
                            team1[i].hit(getAliveHero(team2));
                        }
                    }
                } else {
                    if(team2[i] instanceof Doctor) {
                        team2[i].healing(team2[randomHealing.nextInt(2)]);
                    } else {
                        if(hasMember(team1)) {
                            team2[i].hit(getAliveHero(team1));
                        }
                    }
                }
            }
        }

        setTotalTeamDamage();

        for(int i = 0; i < team1.length; i++) {
            team1[i].info();
        }
        System.out.println("Команда 1 нанесла всего " + totalTeam1Damage + " урона");
        System.out.println();
        for(int i = 0; i < team2.length; i++) {
            team2[i].info();
        }
        System.out.println("Команда 2 нанесла всего " + totalTeam2Damage + " урона");
    }

    private boolean hasMember(Hero[] team) {
        for(int i = 0; i < team.length; i++) {
            if(team[i].getHealth() > 0) {
                return true;
            }
        }
        return false;
    }

    private Hero getAliveHero(Hero[] heroes) {
        for(int i = 0; i < heroes.length; i++) {
            if(heroes[i].getHealth() >= 0) return heroes[i];
        }
        return null;
    }

    private void setTotalTeamDamage() {
        for(int i = 0; i < teamSize; i++) {
            totalTeam1Damage += team1[i].totalDamage;
            totalTeam2Damage += team2[i].totalDamage;
        }
    }

}
