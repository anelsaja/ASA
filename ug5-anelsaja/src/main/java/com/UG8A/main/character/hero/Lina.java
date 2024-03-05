package com.UG8A.main.character.hero;

import com.UG8A.main.character.Character;
import  com.UG8A.main.character.MagicCharacter;
import com.UG8A.main.character.TargetSkill;


public class Lina extends MagicCharacter implements TargetSkill {


    public Lina() {
        super("Lina",800,70,120);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }

    @Override
    public void setDamage(int damage) {
        super.setDamage(damage);
    }

    @Override
    public void setMana(int mana) {
        super.setMana(mana);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public int getDamage() {
        return super.getDamage();
    }

    @Override
    public int getMana() {
        return super.getMana();
    }

    @Override

    public void attack(Character enemy) {
        // isi kode anda disini
        enemy.attacked(this.damage);
        if (enemy.isDie()) {
            this.mana += 45;
        }
    }


    @Override
    public boolean skill(Character enemy) {
        // isi kode anda disini
        if (this.mana<=0){
            return false;
        } else {
            enemy.attacked(600);
            this.mana -= 60;
            return true;
        }

    }



}
