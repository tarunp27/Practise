package ReflectionApiSample;

public class Animal {
    public int a = 78;

    public Animal() {
        System.out.println("This is default private constructior");
    }

    public Animal(int a) {
        System.out.println("This is int parameter constructor");
    }

    public void show() {
        System.out.println("Value of a " + this.a);
    }
}