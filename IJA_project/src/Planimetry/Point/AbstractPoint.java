package Planimetry.Point;

import Planimetry.AbstractPlanimetry;

import java.util.SortedMap;
import java.util.TreeMap;

public abstract class AbstractPoint extends AbstractPlanimetry {

    protected double PointX;
    protected double PointY;

    public AbstractPoint(SortedMap<String, Double> Point){
        super();
        this.PointX = Point.get("pointX");
        this.PointY = Point.get("pointY");
    }

    public SortedMap<String, Double> getValueAbstract(){
        SortedMap<String, Double> Point = new TreeMap<>();
        Point.put("pointX", this.PointX);
        Point.put("pointY", this.PointY);
        return Point;
    }

    public abstract SortedMap<String, Double> getValue();
    public abstract SortedMap<String, Double> execute();

}
