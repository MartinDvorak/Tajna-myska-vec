package Planimetry.Vector;

import Planimetry.AbstractPlanimetry;

import java.util.SortedMap;
import java.util.TreeMap;

public abstract class AbstractVector extends AbstractPlanimetry {

    protected double PointX1;
    protected double PointY1;
    protected double PointX2;
    protected double PointY2;

    public AbstractVector(SortedMap<String, Double> midPoint1, SortedMap<String, Double> midPoint2) {
        super();
        this.PointX1 = midPoint1.get("PointX");
        this.PointY1 = midPoint1.get("PointY");
        this.PointX2 = midPoint2.get("PointX");
        this.PointY2 = midPoint2.get("PointY");
    }


    public abstract void execute();
}
