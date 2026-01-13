package org.example;

import java.util.Objects;

public class Dog extends Animal{
    public final String breed; //не всі тварини мають породу, тому це властивість окрема для собак
    public Dog(String name, String breed){
        super(name);
        this.breed=breed;
    }
    String eat(){
        return ("Dog "+getName()+" is eating");
    }
    String bark(){
        return ("Dog "+getName()+" said bark");
    }
    @Override
    public String toString() {
        return super.toString()+"Type: dog; Breed: "+breed+";";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(breed, dog.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), breed);
    }
}
