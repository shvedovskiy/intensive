package ru.spbstu.patterns.bridge;

/**
 * Created by sergey.tovmasyan on 16/09/16.
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());
        Shape yellowCircle = new Circle(100, 100, 10, new YellowCircle());

        redCircle.draw();
        greenCircle.draw();
        yellowCircle.draw();
    }
}
