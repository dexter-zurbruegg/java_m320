package D2.house.src;

import java.util.ArrayList;
import java.util.List;

public class Cloud {
    private List<Circle> circles; // multiple circles to represent the clouds

    public Cloud(int x, int y, int size) {
        circles = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Circle circle = new Circle();
            circle.changeColor("gray");
            circle.changeSize(size);
            circle.moveHorizontal(x + (i * (size / 2)));
            circle.moveVertical(y);
            circle.makeVisible();
            circles.add(circle);
        }
    }

    public void move(int distance) {
        for (int i = 0; i < Math.abs(distance); i++) {
            for (Circle circle : circles) {
                if (distance > 0) {
                    circle.slowMoveHorizontal(1);
                } else {
                    circle.slowMoveHorizontal(-1);
                }
            }
        }

        if (circles.get(0).getDiameter() + circles.get(0).getXPosition() > 500) {
            for (Circle circle : circles) {
                circle.moveHorizontal(-500);
            }
        }
    }
}