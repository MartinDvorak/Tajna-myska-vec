package Planimetry.Circle;

import java.util.SortedMap;
import java.util.TreeMap;

public class Size extends AbstractCircle {

    public Size(SortedMap<String, Double> midPoint, double radius){
        super(midPoint, radius);
    }
    public Size(SortedMap<String, Double> circle){
        super(circle);
    }

    public void execute(){
        //return the midPoint
    }

    @Override
    public SortedMap<String, Double> getValue() {
        SortedMap<String, Double>  scale = new TreeMap<>();
        scale.put("scalar", this.radius);
        scale.put("scalar", this.radius);
        return scale;
    }
}
