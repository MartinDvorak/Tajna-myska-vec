package Planimetry.Circle;

import java.util.SortedMap;
import java.util.TreeMap;

public class Move extends AbstractCircle{

    protected double deltaX;
    protected double deltaY;

    public Move(SortedMap<String, Double> midPoint, SortedMap<String, Double> radius, SortedMap<String, Double> delta){
        super(midPoint, radius);
        this.deltaX = delta.get("deltaX");
        this.deltaY = delta.get("deltaY");
    }

    public Move(SortedMap<String, Double> circle, double deltaX, double deltaY){
        super(circle);
        this.deltaX = deltaX;
        this.deltaY = deltaY;
    }

    public SortedMap<String, Double> execute(){
        SortedMap<String,Double> circle = new TreeMap<>();
        circle.put("pointX", this.midPointX + this.deltaX);
        circle.put("pointY", this.midPointY + this.deltaY);
        circle.put("radius", this.radius);
        this.midPointX += this.deltaX;
        this.midPointY += this.deltaY;
        return circle;
    }

    public SortedMap<String, Double> getValue() {
        SortedMap<String,Double> circle = getValueAbstract();
        circle.put("deltaX",this.deltaX);
        circle.put("deltaY",this.deltaY);
        return circle;
    }
}
