package Planimetry.Circle;

import java.util.SortedMap;
import java.util.TreeMap;

public class Move extends AbstractCircle{

    protected double deltaX;
    protected double deltaY;

    public Move(SortedMap<String, Double> midPoint, double radius, double deltaX, double deltaY){
        super(midPoint, radius);
        this.deltaX = deltaX;
        this.deltaY = deltaY;

    }

    public Move(SortedMap<String, Double> circle, double deltaX, double deltaY){
        super(circle);
        this.deltaX = deltaX;
        this.deltaY = deltaY;

    }

    public void execute(){
        this.midPointX += this.deltaX;
        this.midPointY += this.deltaY;
    }
}
