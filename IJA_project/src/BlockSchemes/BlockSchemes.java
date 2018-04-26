package BlockSchemes;


import Block.CycleCheck;

public class BlockSchemes {

    public static void main(String[] args)
    {
        BlockSchemes block = new BlockSchemes();
        block.run();
    }

    public void run(){
        CycleCheck check = new CycleCheck();
        if( check.CycleFind() )
        {
            System.out.println("Hell");
        }
        else{
            System.out.println("K");
        }

    }

}
