package Planimetry;

import Block.AbstractBlock;

import java.util.SortedMap;

public abstract class AbstractPlanimetry extends AbstractBlock{

    public AbstractPlanimetry(){
        super();
    }

    public abstract void execute();
    public abstract SortedMap<String, Double> getValue();
}
