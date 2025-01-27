package D2.house.src;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a cloud composed of multiple circles.
 * The cloud is created to visually represent a cloud in a graphical application.
 */
public class Cloud {
    private List<Circle> circles; // multiple circles to represent the clouds

    /**
     * Constructs a cloud at a specified position with a given size.
     * The cloud is made up of three circles to give it a realistic appearance.
     *
     * @param x the horizontal position of the cloud
     * @param y the vertical position of the cloud
     * @param size the size of each circle in the cloud
     */
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

    /**
     * Moves the cloud horizontally by a specified distance.
     * The movement is animated to create a smooth transition.
     * If the cloud moves beyond a certain boundary, it wraps around to the other side.
     *
     * @param distance the distance to move the cloud; positive for right, negative for left
     */
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
    }
}