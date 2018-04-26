package Planimetry.Line;

import java.util.SortedMap;
import java.util.TreeMap;

public class Scale extends AbstractLine {

    protected double scaleX;
    protected double scaleY;

    public Scale(SortedMap<String, Double> vector,SortedMap<String, Double> scale){
        super(vector);
        this.scaleX = scale.get("deltaX");
        this.scaleY = scale.get("deltaY");
    }

    public Scale(SortedMap<String, Double> point1,SortedMap<String, Double> point2, SortedMap<String, Double> scale){
        super(point1,point2);
        this.scaleX = scale.get("deltaX");
        this.scaleY = scale.get("deltaY");
    }

    public SortedMap<String, Double> execute() {
        SortedMap<String, Double> lineScale = new TreeMap<>();
        lineScale.put("pointX1", this.scaleX*this.PointX1);
        lineScale.put("pointX2", this.scaleX*this.PointX2);
        lineScale.put("pointY1", this.scaleY*this.PointY1);
        lineScale.put("pointX2", this.scaleY*this.PointY2);
        return lineScale;
    }

    public SortedMap<String, Double> getValue() {
        SortedMap<String, Double> lineScale = getValueAbstract();
        lineScale.put("scaleX",this.scaleX);
        lineScale.put("scaleY",this.scaleY);
        return lineScale;
    }
}
