package org.example;

public class Cat extends Animal{
    public final String breed;
    public Cat(String name, String breed){
        super(name);
        this.breed=breed;
    }
    @Override
    public String toString() {
        return super.toString()+"Type: cat; Breed: "+breed+";";
    }
}
