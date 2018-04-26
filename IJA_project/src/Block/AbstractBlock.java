package Block;

import BlockSchemes.connectable;

import java.util.SortedMap;

public abstract class AbstractBlock implements connectable {

    protected String state;
    protected int ports;
    protected String name;


    public AbstractBlock(){
        this.state = "waiting";
        this.ports = 0;
        this.name = null;
    }

    public abstract SortedMap<String, Double> execute();

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
