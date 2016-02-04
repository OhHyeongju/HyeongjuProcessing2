/**
 * Created by user on 2016. 2. 1..
 */
public class BaseShape extends ProcessingBaseObject {

    protected Color color;

    protected Stroke stroke;

    protected float x, y, z;

    protected float d1, d2;

    public boolean isMoved;

    protected float width, height;

    private final float defaultPosition = 100;

    BaseShape() {
        this.x = defaultPosition;
        this.y = defaultPosition;
        this.z = defaultPosition;
        color = new Color();
        stroke = new Stroke();
        this.isMoved = false;
        this.d1 = 0;
        this.d2 = 0;
    }

    public BaseShape setColor(Color.Mode Mode, int x, int y, int z, int a) {
        return this;
    }

    public Color getColor() {
        return this.color;
    }

    public BaseShape setStroke(Color color, float weight) {

        this.stroke.setStroke(color, weight);

        return this;
    }

    public BaseShape setStroke(float weight) {

        this.stroke.setStroke(weight);
        return this;
    }

    public Stroke getStroke() {
        return this.stroke;
    }

    public void setProperties() {

        this.color.setFillProperties();
        setStroke(10);
        this.stroke.setStrokeProperties();
    }

    public void draw() {
        setProperties();

    }

    public void setPosition(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void setSize(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public void isMoved() {
    }
}
