package net.hypixel.api.pets;

public enum PetAttribute {

    HUNGER(1),
    THIRST(1),
    EXERCISE(1);

    private int decay;

    PetAttribute(int decay) {
        this.decay = decay;
    }

    public int getDecay() {
        return decay;
    }

}