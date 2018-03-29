package Planimetry.Point;

import Planimetry.AbstractPlanimetry;

import java.util.SortedMap;
import java.util.TreeMap;

public abstract class AbstractPoint extends AbstractPlanimetry {

    protected double PointX;
    protected double PointY;

    public AbstractPoint(SortedMap<String, Double> midPoint){
        super();
        this.PointX = midPoint.get("PointX");
        this.PointY = midPoint.get("PointY");
    }

    public abstract void execute();

}
