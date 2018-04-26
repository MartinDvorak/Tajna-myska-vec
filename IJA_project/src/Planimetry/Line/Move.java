package Planimetry.Line;

import java.util.SortedMap;
import java.util.TreeMap;

public class Move extends AbstractLine {

    protected double deltaX;
    protected double deltaY;

    public Move(SortedMap<String, Double> vector,SortedMap<String, Double> delta){
        super(vector);
        this.deltaX = delta.get("deltaX");
        this.deltaY = delta.get("deltaY");
    }

    public Move(SortedMap<String, Double> point1,SortedMap<String, Double> point2,SortedMap<String, Double> delta){
        super(point1,point2);
        this.deltaX = delta.get("deltaX");
        this.deltaY = delta.get("deltaY");
    }


    public SortedMap<String, Double> execute() {
        SortedMap<String, Double> line = new TreeMap<>();
        this.PointX1 += deltaX;
        this.PointX2 += deltaX;
        this.PointY1 += deltaY;
        this.PointY2 += deltaY;

        line.put("pointX1", this.PointX1);
        line.put("pointX2", this.PointX2);
        line.put("pointY1", this.PointY1);
        line.put("pointY2", this.PointY2);
        return line;
    }

    public SortedMap<String, Double> getValue() {
        SortedMap<String, Double> vectorMove = getValueAbstract();
        vectorMove.put("deltaX",this.deltaX);
        vectorMove.put("deltaY",this.deltaY);
        return vectorMove;
    }
}
