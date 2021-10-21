package ru.samsung.itschool.mdev;

public  class Animal {
    private String name;
    private boolean canFly;
    public static int legs = 4;
    protected boolean canSwim;

    public static void makeSound() {
        System.out.println("Bu!");
    }

    public Animal() {

    }

    public Animal(String name, boolean canFly, int legs, boolean canSwim) {
        this.name = name;
        this.canFly = canFly;
        this.legs = legs;
        this.canSwim = canSwim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }
}
