package AEA3.Animales;

public class Main_Animal {
    public static void main(String[] args) {
        //animal
        Animal a = new Animal();
        //animal crida la funció sound();
        a.sound();

        Animal a1 = new Animal();
        //animal crida la funció sound();
        a1.sound();

        //dog
        Dog d = new Dog();
        //dog crida la funció sound();
        d.sound();

        //dog
        Dog d1 = new Dog();
        //dog crida la funció sound();
        d1.sound();

        Dog d2 = new Dog(23);
        //dog crida la funció sound();
        d1.sound();

        Cat c = new Cat();
        c.sound();
    }
}
