package AEA3.Animales;

public class Cat extends Animal{

    public Cat(){
        int id = this.getId();
        this.setId(++id);
    }

    public Cat(int id){
        this.setId(id);
    }

    // Own behavior
    private void bark() {
        System.out.println("Cat '" + this.getId() + "' is meawing");
    }

    // Overriding super class behavior
    @Override
    public void sound() {
        bark();
    }
}
