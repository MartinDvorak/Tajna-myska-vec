package Planimetry.Line;

import java.util.SortedMap;
import java.util.TreeMap;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class Rotate extends AbstractLine {

    protected double angle;

    public Rotate(SortedMap<String, Double> vector,SortedMap<String, Double> angle){
        super(vector);
        this.angle = angle.get("scalar");
    }

    public Rotate(SortedMap<String, Double> point1,SortedMap<String, Double> point2,SortedMap<String, Double> angle){
        super(point1,point2);
        this.angle = angle.get("scalar");
    }

    public SortedMap<String, Double> getValue() {
        SortedMap<String, Double> vector_rotate = getValueAbstract();
        vector_rotate.put("angle",this.angle);
        return vector_rotate;
    }

    protected double computateX(double angle, double pointX, double pointY){
        return pointX * cos(angle) - sin(angle)* pointY;
    }

    protected double computateY(double angle, double pointX, double pointY){
        return pointX * sin(angle) + cos(angle)* pointY;
    }

    public SortedMap<String, Double> execute() {
        SortedMap<String, Double> line = new TreeMap<>();
        this.PointX1 = computateX(this.angle,this.PointX1,this.PointY1);
        this.PointX2 = computateX(this.angle,this.PointX2,this.PointY2);
        this.PointY1 = computateY(this.angle,this.PointX1,this.PointY1);
        this.PointY2 = computateY(this.angle,this.PointX2,this.PointY2);

        line.put("pointX1", this.PointX1);
        line.put("pointX2", this.PointX2);
        line.put("pointY1", this.PointY1);
        line.put("pointY2", this.PointY2);
        return line;
    }
}
