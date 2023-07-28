import javax.swing.JApplet;

interface Passion {
    public default void hash() {
        System.out.println("hello");
    }
}

interface Passion1 {
    public default void hash() {
        System.out.println("hello1");
    }
}

class Kick {
    public static void speed() {
        System.out.println("45kmph");
    }
}

public class JavaSample extends Kick implements Passion, Passion1 {
    public static void main(String[] args) {
        new JavaSample().hash();
    }

    public void hash() {
        Passion.super.hash();
    }
}
