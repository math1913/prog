package AEA3.Animales;

public class Dog extends Animal{

    public Dog(){
        this.setId(1+this.getId());
    }

    public Dog(int id){
        this.setId(id);
    }

    // Own behavior
    private void bark() {
        System.out.println("Dog '" + this.getId() + "' is barking");
    }

    // Overriding super class behavior
    @Override
    public void sound() {
        bark();
    }
}