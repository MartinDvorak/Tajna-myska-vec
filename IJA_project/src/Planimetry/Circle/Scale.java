package Planimetry.Circle;

import java.util.SortedMap;

public class Scale extends AbstractCircle {

    protected double multiplicator;

    public Scale(SortedMap<String, Double> midPoint, double radius, double multiplicator){
        super(midPoint, radius);
        this.multiplicator = multiplicator;
    }
    public Scale(SortedMap<String, Double> circle, double multiplicator){
        super(circle);
        this.multiplicator = multiplicator;
    }

    public void execute(){
        this.radius *= multiplicator;
    }
}
