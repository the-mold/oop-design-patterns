package creational.prototype.java;

public class Main {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape1 = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape1.getType());
        System.out.println(clonedShape1);

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("\nShape : " + clonedShape2.getType());
        System.out.println(clonedShape2);
    }
}
