package com.UG8A.main.character;

public abstract class Character implements ObjectAttack{
    protected String name;
    protected int health;
    protected int damage;

    public Character(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }


    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }


    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public boolean isDie(){

        // isi kode anda disini
        if (getHealth()<=0){
            return true;
        } else {
            return false;
        }
    }

    public void showCharacterInfo() {
        // isi kode anda disini
        System.out.println("Hero  : "+getName());
        System.out.println("Health: "+getHealth());
        System.out.println("Damage: "+getDamage());
        System.out.println("Armor : ");
        System.out.println(" ");
    }

    public void attacked(int attack) {

    }


}
