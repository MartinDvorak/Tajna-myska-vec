package Planimetry;

import Block.AbstractBlock;

import java.util.SortedMap;

public abstract class AbstractPlanimetry extends AbstractBlock{

    public AbstractPlanimetry(){
        super();
    }

    public abstract SortedMap<String, Double> execute();
    public abstract SortedMap<String, Double> getValue();
}
