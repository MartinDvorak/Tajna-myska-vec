package Block;

import java.util.Stack;
import java.util.Vector;

public class CycleCheck {

    protected  Vector<Vector<Integer>> vector;
    protected Vector<Integer> visited;
    protected Stack<Integer> stack;

    public CycleCheck(){
        this.vector = new Vector<>();
        this.visited = new Vector<>();
        this.stack = new Stack<>();
    }

    public boolean CycleFind(){
        if( setArrayVectors() == 0 )
            return false;
        return CycleDetect();
    }

    private Vector<Integer> setVector(int offset){
        Vector<Integer> tmp = new Vector<>();
        if(offset == 0)
        {
            tmp.add(1);
            //tmp.add(3);
        }
        else if(offset == 1)
        {
            tmp.add(0);
            tmp.add(2);
            tmp.add(3);
            tmp.add(4);
        }
        else if(offset == 2)
        {
            //tmp.add(3);
            tmp.add(1);
        }
        else if(offset == 3)
        {
            tmp.add(1);
            //tmp.add(0);
        }
        else if(offset == 4)
        {
            tmp.add(1);
            //tmp.add(0);
        }
        return tmp;
    }

    // TODO from GUI set values
    private int setArrayVectors(){
        this.vector.add(setVector(0));
        this.vector.add(setVector(1));
        this.vector.add(setVector(2));
        this.vector.add(setVector(3));
        this.vector.add(setVector(4));
        int count = 0;
        for(Vector<Integer> singleVector :this.vector){
            count += singleVector.size();
        }
        return count;
    }

    private boolean CycleDetect(){
        // insert first vertex
        this.stack.push(0);
        while(!this.stack.isEmpty())
        {
            int actual = this.stack.peek();
            if(this.vector.get(actual).isEmpty())
            {
                this.stack.pop();
            }
            else{
                for (int value : this.vector.get(actual)) {
                    if(this.visited.contains(value)){
                        return true;
                    }
                    else{
                        this.stack.push(value);
                        this.vector.get(value).removeElement(actual);
                    }
                }
                this.visited.add(actual);
                this.vector.get(actual).clear();
            }

        }
        return false;
    }

    private void printVector(){
        for(Vector<Integer> singleVector : this.vector) {
            System.out.println("---");
            for (int value : singleVector) {
                System.out.println(value);
            }
        }
    }
    private void printVector(Vector<Integer> vector){
        for (int value : vector) {
                System.out.println(value);
            }
    }
}
