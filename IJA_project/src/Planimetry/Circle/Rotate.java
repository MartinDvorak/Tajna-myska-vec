package Planimetry.Circle;

import java.util.SortedMap;
import java.util.TreeMap;

public class Rotate extends AbstractCircle {

    protected double angle;

    public Rotate(SortedMap<String, Double> midPoint, SortedMap<String, Double> radius, SortedMap<String, Double> angle){
        super(midPoint, radius);
        this.angle = angle.get("scalar");
    }

    public Rotate(SortedMap<String, Double> circle, SortedMap<String, Double> angle){
        super(circle);
        this.angle = angle.get("scalar");
    }

    public SortedMap<String, Double> getValue() {
        SortedMap<String, Double> circleRotate =  getValueAbstract();
        circleRotate.put("angle",this.angle);
        return circleRotate;
    }

    public SortedMap<String, Double> execute(){
        SortedMap<String, Double> rotate = new TreeMap<>();
        rotate.put("pointX", this.midPointX);
        rotate.put("pointY", this.midPointY);
        rotate.put("radius",this.radius);
        return rotate;
    }

}
