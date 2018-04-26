package Planimetry.Point;

import java.util.SortedMap;
import java.util.TreeMap;

public class Size extends AbstractPoint{

    protected double size;

    public Size(SortedMap<String, Double> point){
        super(point);
    }

    public SortedMap<String, Double> execute() {
        SortedMap<String, Double> size = new TreeMap<>();
        this.size = 0.0;
        size.put("scalar", this.size);
        return size;
    }

    public SortedMap<String, Double> getValue() {
        SortedMap<String, Double> point = getValueAbstract();
        point.put("size",this.size);
        return point;
    }
}
