package Planimetry.Circle;

import java.util.SortedMap;
import java.util.TreeMap;

public class Size extends AbstractCircle {

    public Size(SortedMap<String, Double> midPoint, SortedMap<String, Double> radius){
        super(midPoint, radius);
    }
    public Size(SortedMap<String, Double> circle){
        super(circle);
    }

    public SortedMap<String, Double> execute(){
        SortedMap<String, Double> size = new TreeMap<>();
        size.put("scalar", this.radius);
        return size;
    }

    public SortedMap<String, Double> getValue() {
        SortedMap<String, Double>  scale = getValueAbstract();
        scale.put("size", this.radius);
        return scale;
    }
}
