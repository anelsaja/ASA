package com.UG8A.main.character;

public abstract class MagicCharacter extends Character {
    protected int mana;

    public MagicCharacter(String name, int health, int damage, int mana) {
        super(name, health, damage);
        this.mana = mana;
    }


    @Override
    public void showCharacterInfo() {
        // isi kode anda disini
        System.out.println("Hero  : "+super.name);
        System.out.println("Health: "+super.health);
        System.out.println("Damage: "+super.damage);
        System.out.println("Mana  : "+mana);
        System.out.println(" ");
    }

    @Override
    public void setDamage(int damage) {
        super.setDamage(damage);
    }

    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public int getDamage() {
        return super.getDamage();
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public int getMana() {
        return mana;
    }

    @Override
    public void attacked(int damage) {
        this.health = getHealth()-damage;
       // isi kode anda disini
    }

}
