import java.awt.*;

public class Main
{
    public static void main(String[] args)
    {
        // create a new bitflag object
        Bitflag colors = new Bitflag();

        /* do some flag operations */

        // set flag white
        colors.setFlag(Colors.WHITE.bit());

        // set flag blue and black
        colors.setFlag(Colors.BLUE.bit() | Colors.BLACK.bit());

        // unset flag white
        colors.unsetFlag(Colors.WHITE.bit());

        // Flip the flag blue and yellow (blue is unset, yellow is set)
        colors.flipFlag(Colors.BLUE.bit() | Colors.YELLOW.bit());

        // Yellow is set, hence red is set
        if(colors.hasFlag(Colors.YELLOW.bit()))
            colors.setFlag(Colors.RED.bit());

        /* end flag operations */

        // print all currently active flags
        colors.printActiveFlags();

        /* CONSOLE OUTPUT
            ------------- Active Flags -------------
            Color:red Bit:2
            Color:yellow Bit:4
            Color:black Bit:8
         */
    }
}