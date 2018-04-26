package Planimetry.Point;

import java.util.SortedMap;

public class Middle extends AbstractPoint {

    public Middle(SortedMap<String, Double> point){
        super(point);
    }

    public SortedMap<String, Double> getValue() {
        return getValueAbstract();
    }

    public SortedMap<String, Double> execute() {
        return getValue();
    }
}
