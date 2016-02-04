/**
 * Created by user on 2016. 2. 1..
 */
public class Circle extends BaseShape {

    private float defaultWidth = 30;
    private float defaultHeight = 30;

    public Circle() {
        this.width = defaultWidth;
        this.height = defaultHeight;
    }

    public void draw() {
        super.draw();
        p.ellipse(x, y, width, height);
    }

    public void isMoved() {
        if (p.dist(this.x, this.y, p.mouseX, p.mouseY) < this.width) {
            this.isMoved = true;

            this.d1 = p.mouseX - this.x;
            this.d2 = p.mouseY - this.y;
        }
    }

}
