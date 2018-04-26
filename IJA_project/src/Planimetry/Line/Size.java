package Planimetry.Line;

import java.util.SortedMap;
import java.util.TreeMap;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Size extends AbstractLine {

    protected double size;

    public Size(SortedMap<String, Double> vector){
        super(vector);
    }

    public Size(SortedMap<String, Double> point1,SortedMap<String, Double> point2){
        super(point1,point2);
    }

    public SortedMap<String, Double> getValue() {
        SortedMap <String, Double> line = getValueAbstract();
        line.put("size",this.size);
        return line;
    }

    public SortedMap<String, Double> execute() {
        SortedMap<String, Double> size = new TreeMap<>();
        this.size = sqrt(pow(this.PointX2 - this.PointX1,2)+pow(this.PointY2 - this.PointY1,2));
        size.put("scalar",this.size);
        return size;
    }
}
