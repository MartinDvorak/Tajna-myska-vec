package Planimetry.Circle;

import java.util.SortedMap;
import java.util.TreeMap;

public class Scale extends AbstractCircle {

    protected double multiplicator;

    public Scale(SortedMap<String, Double> midPoint, SortedMap<String, Double> radius, SortedMap<String, Double> multiplicator){
        super(midPoint, radius);
        this.multiplicator = multiplicator.get("scalar");
    }
    public Scale(SortedMap<String, Double> circle, SortedMap<String, Double> multiplicator){
        super(circle);
        this.multiplicator = multiplicator.get("scalar");
    }

    public SortedMap<String, Double> execute(){
        SortedMap<String, Double> circle = new TreeMap<>();
        circle.put("pointX", this.midPointX);
        circle.put("pointY", this.midPointY);
        circle.put("radius", this.radius *= this.multiplicator);
        this.radius *= this.multiplicator;
        return circle;
    }

    public SortedMap<String, Double> getValue(){
        SortedMap<String, Double> circle = getValueAbstract();
        circle.put("multiplicator", this.multiplicator);
        return circle;
    }
}
