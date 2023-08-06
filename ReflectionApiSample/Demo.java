package ReflectionApiSample;

import java.lang.reflect.Field;

public class Demo {
    public static void main(String[] args) {
        try {
            Animal a = new Animal();
            Field[] catfields = a.getClass().getDeclaredFields();
            for (Field field : catfields) {
                System.out.println(field.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
