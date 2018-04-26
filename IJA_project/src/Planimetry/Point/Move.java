package Planimetry.Point;

import java.util.SortedMap;
import java.util.TreeMap;

public class Move extends AbstractPoint{

    protected double deltaX;
    protected double deltaY;

    public Move(SortedMap<String, Double> Point, double deltaX, double deltaY){
        super(Point);
        this.deltaX = deltaX;
        this.deltaY = deltaY;
    }

    public SortedMap<String, Double> getValue() {
        SortedMap<String, Double> point = getValueAbstract();
        point.put("deltaX", this.deltaX);
        point.put("deltaY", this.deltaY);
        return point;
    }

    public SortedMap<String, Double> execute(){
        SortedMap<String, Double> point = new TreeMap<>();
        this.PointX += this.deltaX;
        this.PointY += this.deltaY;

        point.put("pointX", this.PointX);
        point.put("pointY", this.PointY);

        return point;
    }
}
