import java.util.EnumSet;

public class Bitflag
{
    // holds active flags
    private int flags = 0;

    // sets a flag to active
    public void setFlag(int flag)
    {
        flags |= flag;
    }

    // unsets a flag if bit is set
    public void unsetFlag(int flag)
    {
        flags &= ~flag;
    }

    // the bit is flipped, i.e. if a flag is set, it is unset and vice versa
    public void flipFlag(int flag)
    {
        flags ^= flag;
    }

    // checks if a certain flag is set
    public boolean hasFlag(int flag)
    {
        return (flag & flags) == (flag);
    }

    // output all set flags
    public void printActiveFlags()
    {
        System.out.println("------------- Active Flags -------------");

        EnumSet flags = EnumSet.allOf(Colors.class);
        for(var v : flags.toArray())
        {
            Colors flag = (Colors)v;
            if(hasFlag(flag.bit()))
                System.out.println("Color:" + flag.c() + " Bit:" + flag.bit());
        }
    }
}