package Block;

import BlockSchemes.connectable;

import java.util.SortedMap;

public abstract class AbstractBlock implements connectable {

    protected String state;
    protected int ports;
    protected String name;


    public AbstractBlock(){
        this.state = "waiting";
        this.ports = (Integer) null;
        this.name = null;
    }

    public abstract void execute();

    public String getName(){
        return this.name;
    }

    public abstract SortedMap<String, Double> getValue();

    public String getState(){
        return this.state;
    }

    public int getNumPorts() {
        return this.ports;
    }
}
