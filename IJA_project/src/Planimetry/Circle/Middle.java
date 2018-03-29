package Planimetry.Circle;

import java.util.SortedMap;
import java.util.TreeMap;

public class Middle extends AbstractCircle {

    public Middle(SortedMap<String, Double> midPoint, double radius){
        super(midPoint, radius);
    }
    public Middle(SortedMap<String, Double> circle){
        super(circle);
    }

    public void execute(){
        //return the midPoint
    }

    @Override
    public SortedMap<String, Double> getValue(){
        SortedMap<String, Double> point = new TreeMap<>();
        point.put("pointX", this.midPointX);
        point.put("pointY", this.midPointY);
        return point;
    }

}
