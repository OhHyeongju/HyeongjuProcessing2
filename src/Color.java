/**
 * Created by user on 2016. 2. 1..
 */
public class Color extends ProcessingBaseObject {

    public enum Mode {
        RGB(1), HSB(3);

        private int mode;

        Mode(int mode) {
            this.mode = mode;
        }

        public int getValue() {
            return mode;
        }

    }

    private int color;
    private int x, y, z, a;

    private Mode mode;

    Color(Mode mode, int x, int y, int z, int a) {
        setMode(mode);
        this.color = a << 24 | x << 16 | y << 8 | z;
        this.x = x;
        this.y = y;
        this.z = z;
        this.a = a;
    }

    Color() {
        setMode(Mode.RGB);
        this.x = 255;
        this.y = 255;
        this.z = 255;
        this.a = 255;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    public Mode getMode() {
        return this.mode;
    }

    public void setColor(Mode mode, int x, int y, int z, int a) {
        setMode(mode);
        this.color = a << 24 | x << 16 | y << 8 | z;
        this.x = x;
        this.y = y;
        this.z = z;
        this.a = a;
    }

    public int getColor() {
        return this.color;
    }

    public void setModeProperties() {
        p.colorMode(this.mode.getValue());
    }

    public void setFillProperties() {
        setModeProperties();
        p.fill(this.mode.getValue());
    }


}
