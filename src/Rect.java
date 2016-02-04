/**
 * Created by user on 2016. 2. 1..
 */
public class Rect extends BaseShape {

    private float defaultWidth = 100;
    private float defaultHeight = 100;

    public Rect() {
        this.width = defaultWidth;
        this.height = defaultHeight;
    }

    public void draw() {
        super.draw();
        p.rect(x, y, width, height);

    }

    public void isMoved() {
        if (p.mouseX > this.x & p.mouseX < this.x + this.width & p.mouseY > this.y & p.mouseY < this.y + this.height) {
            this.isMoved = true;
            this.d1 = p.mouseX - this.x;
            this.d2 = p.mouseY - this.y;
        }
    }
}
