package Planimetry.Circle;

import Planimetry.AbstractPlanimetry;

import java.util.SortedMap;
import java.util.TreeMap;

public abstract class AbstractCircle extends AbstractPlanimetry {

    protected double midPointX;
    protected double midPointY;
    protected double radius;

    public AbstractCircle(SortedMap<String, Double> midPoint, SortedMap<String, Double> radius){
        super();
        this.midPointX = midPoint.get("pointX");
        this.midPointY = midPoint.get("pointY");
        this.radius = radius.get("scalar");
    }

    public AbstractCircle(SortedMap<String, Double> circle){
        super();
        this.midPointX = circle.get("pointX");
        this.midPointY = circle.get("pointY");
        this.radius = circle.get("scalar");
    }

    public SortedMap<String, Double> getValueAbstract(){
        SortedMap<String, Double> circle = new TreeMap<>();
        circle.put("pointX", this.midPointX);
        circle.put("pointY", this.midPointY);
        circle.put("radius", this.radius);
        return circle;
    }
    public abstract SortedMap<String, Double> getValue();
    public abstract SortedMap<String, Double> execute();
}

