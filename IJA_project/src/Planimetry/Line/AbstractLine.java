package Planimetry.Line;

import Planimetry.AbstractPlanimetry;

import java.util.SortedMap;
import java.util.TreeMap;

public abstract class AbstractLine extends AbstractPlanimetry {

    protected double PointX1;
    protected double PointY1;
    protected double PointX2;
    protected double PointY2;

    public AbstractLine(SortedMap<String, Double> Point1, SortedMap<String, Double> Point2) {
        super();
        this.PointX1 = Point1.get("pointX");
        this.PointY1 = Point1.get("pointY");
        this.PointX2 = Point2.get("pointX");
        this.PointY2 = Point2.get("pointY");
    }

    public AbstractLine(SortedMap<String, Double> Vector) {
        super();
        this.PointX1 = Vector.get("pointX1");
        this.PointY1 = Vector.get("pointY1");
        this.PointX2 = Vector.get("pointX2");
        this.PointY2 = Vector.get("pointY2");
    }

    public SortedMap<String, Double> getValueAbstract(){
        SortedMap<String, Double> vector = new TreeMap<>();
        vector.put("pointX1", this.PointX1);
        vector.put("pointY1", this.PointY1);
        vector.put("pointX2", this.PointX2);
        vector.put("pointY2", this.PointY2);
        return vector;
    }

    public abstract SortedMap<String, Double> getValue();
    public abstract SortedMap<String, Double> execute();
}
