package com.UG8A.main.character.hero;

import com.UG8A.main.character.Character;
import com.UG8A.main.character.PhysicalCharacter;
import com.UG8A.main.character.TargetSkill;

public class LegionCommander extends PhysicalCharacter implements TargetSkill {
    private int kill = 0;

    public LegionCommander() {
        super("Legion Commander", 1200,120,30);
    }

    @Override
    public void attack(Character character) {
        // isi kode anda disini
        if (character.isDie()){
            kill +=1;
            damage +=10;
        }
        character.attacked(this.damage);
    }


    @Override
    public boolean skill(Character character) {
        // isi kode anda disini
        while (!isDie() && !character.isDie()) {
            attack(character);
            character.attack(this);


        }
        return isDie();
    }
}
