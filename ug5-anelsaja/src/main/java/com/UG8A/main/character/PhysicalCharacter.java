package com.UG8A.main.character;

public abstract class PhysicalCharacter extends Character{
    private int armor;

    public PhysicalCharacter(String name, int health, int damage, int armor){
        super(name,health,damage);
        this.armor=armor;
    }

    @Override
    public void showCharacterInfo() {
        // isi kode anda disini
        System.out.println("Hero  : "+super.name);
        System.out.println("Health: "+super.health);
        System.out.println("Damage: "+super.damage);
        System.out.println("Armor : "+armor);
        System.out.println(" ");
    }

    @Override
    public void attacked(int damage) {
        // isi kode anda disini
        if (damage>0) {
            int serang = damage - armor;
            this.health -= serang;
        }
    }
}
