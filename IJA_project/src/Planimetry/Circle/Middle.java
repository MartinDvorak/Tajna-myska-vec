package Planimetry.Circle;

import java.util.SortedMap;
import java.util.TreeMap;

public class Middle extends AbstractCircle {

    public Middle(SortedMap<String, Double> midPoint, SortedMap<String, Double> radius){
        super(midPoint, radius);
    }
    public Middle(SortedMap<String, Double> circle){
        super(circle);
    }

    public SortedMap<String, Double> execute(){
        SortedMap<String, Double> middle = new TreeMap<>();
        middle.put("pointX", this.midPointX);
        middle.put("pointY", this.midPointY);
        return middle;
    }

    public SortedMap<String, Double> getValue(){
        SortedMap<String, Double> circle = getValueAbstract();
        return circle;
    }
}
