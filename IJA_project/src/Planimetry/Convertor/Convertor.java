package Planimetry.Convertor;

import Planimetry.AbstractPlanimetry;

import java.util.SortedMap;
import java.util.TreeMap;

public class Convertor extends AbstractPlanimetry{

    protected double deltaX;
    protected double deltaY;


    public Convertor (SortedMap<String, Double> input1,SortedMap<String, Double> input2){
        super();
        this.deltaX = input1.get("scalar");
        this.deltaY = input2.get("scalar");
    }

    public SortedMap<String, Double> execute() {
        SortedMap<String, Double> delta = new TreeMap<>();
        delta.put("deltaX",this.deltaX);
        delta.put("deltaY",this.deltaY);
        return delta;
    }

    public SortedMap<String, Double> getValue() {
        SortedMap<String, Double> delta = new TreeMap<>();
        delta.put("deltaX",this.deltaX);
        delta.put("deltaY",this.deltaY);
        return delta;
    }
}
