package BlockSchemes;

import java.util.SortedMap;

public interface connectable {

    public SortedMap<String, Double> getValue();
    public String getState();
    public int getNumPorts();
    public void execute();
    public String getName();
}
