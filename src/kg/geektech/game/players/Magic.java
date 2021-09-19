package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Magic extends Hero {
    public Magic(int health, int damage) {
        super(health, damage, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        int increaseDamagePoints = RPG_Game.random.nextInt(4) + 2;
        if (this.getHealth()>0){
            for (int i = 0; i < heroes.length; i++) {

                if (heroes[i].getHealth()>0){
                    heroes[i].setDamage(heroes[i].getDamage()+increaseDamagePoints);
                }
            }
            System.out.println("Маг повысил урон на " + increaseDamagePoints);
        }

    }
}
