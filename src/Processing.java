import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2016. 2. 1..
 */
public class Processing extends PApplet {

    private static Processing _this;
    List<BaseShape> shapes = new ArrayList<BaseShape>();

    public static Processing getInstance() {
        if (_this == null) _this = new Processing();
        return _this;
    }

    public static void main(String... args) {
        Processing pinstance = Processing.getInstance();
        pinstance.runSketch();
    }

    public void settings() {
        size(800, 600);
    }

    public void setup() {
        background(255);

        for (int i = 0; i < 1; i++) {
            shapes.add(new Rect()
                    .setColor(Color.Mode.RGB, 255, 255, 255, 255)
                    .setStroke((float) i + 5));

            shapes.add(new Circle()
                    .setColor(Color.Mode.RGB, 255, 10, 10, 255));
        }
        smooth();
    }

    public void draw() {
        clear();
        background(255);
        drawShapes();
    }

    public void drawShapes() {

        for (BaseShape each : shapes) {
            each.draw();
        }

    }

    public void mousePressed() {


        for (BaseShape each : shapes) {
            if (each.isMoved == false) {
                each.isMoved();
            }
        }
    }

    public void mouseDragged() {
        for (BaseShape each : shapes) {
            if (each.isMoved == true) {

                each.setPosition(mouseX - each.d1, mouseY - each.d2);
                //each.x = mouseX;
                //each.y = mouseY;
            }
        }
    }

    public void mouseReleased() {
        for (BaseShape each : shapes) {
            if (each.isMoved == true) {
                each.isMoved = false;
            }
        }
    }

}
