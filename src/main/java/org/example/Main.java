package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Dog dog1 = new Dog("Bobik", "Wiener");
        System.out.println(dog1);
        String str1=new String("hello");
        String str2=new String("hello");
        System.out.println("==: "+(str1==str2)); //порівняння адрес, тому хиба
        System.out.println("equals(): "+str1.equals(str2)); //порівняння значень, тому істина
        Integer a, b;
        for(int i=-128; i<=128; i++){
            a=i; b=i;
           System.out.println(i+": ==: "+(a==b)+"    equals(): "+a.equals(b));
        }
        Dog dog2 = new Dog("Bobik", "Wiener");
        Dog dog3 = new Dog("Bobik", "Sheperd");
        System.out.print("1. "+dog1+"\n"+"2. "+dog2+"\n"+"3. "+dog3+"\n");
        System.out.println("Dog1 and Dog2:  "+dog1.equals(dog2));
        System.out.println("Dog1 and Dog3:  "+dog1.equals(dog3));
        System.out.println(dog1.eat());
        Animal animal2 = new Dog("Barbos", "Spitz");
        System.out.println(animal2);
        Animal animal3 = new Cat("Murchik", "Scotland");
        feed(animal2);
        feed(animal3);
    }
   private static void feed(Animal animal){
        if(animal instanceof Dog dog) //без перевірки у метод могла потапити інша тварина, що не містить метод bark()
            System.out.println(dog.bark());
        System.out.println(animal.eat());
    }
}
