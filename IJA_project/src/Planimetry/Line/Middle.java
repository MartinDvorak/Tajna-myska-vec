package Planimetry.Line;

import java.util.SortedMap;
import java.util.TreeMap;

public class Middle extends AbstractLine {

    protected double midX;
    protected double midY;


    public Middle(SortedMap<String,Double> vector){
        super(vector);
    }

    public Middle(SortedMap<String,Double> point1,SortedMap<String,Double> point2){
        super(point1,point2);
    }

    public SortedMap<String, Double> getValue() {
        SortedMap<String, Double> line =  getValueAbstract();
        line.put("middleX",this.midX);
        line.put("middleY",this.midY);
        return line;
    }

    public SortedMap<String, Double> execute() {
        SortedMap<String, Double> midPoint = new TreeMap<>();
        this.midX = (this.PointX1 + this.PointX2)/2;
        this.midY = (this.PointY1 + this.PointY2)/2;

        midPoint.put("pointX", this.midX);
        midPoint.put("pointY", this.midY);
        return midPoint;
    }
}
