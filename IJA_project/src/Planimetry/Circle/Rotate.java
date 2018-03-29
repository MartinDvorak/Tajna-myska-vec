package Planimetry.Circle;

import java.util.SortedMap;

public class Rotate extends AbstractCircle {

    protected double angle;

    public Rotate(SortedMap<String, Double> midPoint, double radius, double angle){
        super(midPoint, radius);
        this.angle = angle;
    }

    public Rotate(SortedMap<String, Double> circle, double angle){
        super(circle);
        this.angle = angle;
    }

    public void execute(){
        //return the same circle
    }

}
