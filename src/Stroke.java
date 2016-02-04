/**
 * Created by user on 2016. 2. 1..
 */
public class Stroke extends ProcessingBaseObject {

    private Color color;
    private float weight;
    private final float defaultWeight = 10;

    Stroke(){
        this.color = new Color();
        this.weight = defaultWeight;
    }

    Stroke(float weight){
        this.color = new Color();
        this.weight = weight;
    }

    Stroke(Color color){
        this.color = color;
        this.weight = defaultWeight;
    }

    public void setStroke(Color color, float weight){
        this.color = color;
        this.weight = weight;
    }

    public void setStroke(float weight){
        this.weight = weight;
    }

    public float getWeight(){
        return this.weight;
    }

    public void setStrokeProperties(){
        p.strokeWeight(weight);
        p.stroke(color.getColor());
    }




}
