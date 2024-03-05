package com.UG8A.main.character.hero;

import com.UG8A.main.character.Character;
import com.UG8A.main.character.NoTargetSkill;
import com.UG8A.main.character.PhysicalCharacter;

public class DragonKnight extends PhysicalCharacter implements NoTargetSkill {
    private int dragonFormAttack = 0;

    public DragonKnight(){
        super("Dragon Knight",1800,95,50);
    }

    @Override
    public void skill() {
       // isi kode anda disini
        dragonFormAttack = 2;
    }

    @Override
    public void attack(Character character) {
        if (dragonFormAttack > 0){
            damage = damage +90;
            dragonFormAttack = dragonFormAttack - 1;
        }
        character.attacked(this.damage);
        // isi kode anda disini
    }


}
