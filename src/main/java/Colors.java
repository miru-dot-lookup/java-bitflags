public enum Colors
{
    BLUE(1, "blue"),
    RED(2, "red"),
    YELLOW(4, "yellow"),
    BLACK(8, "black"),
    WHITE(16, "white");

    private int bit;
    private String name;

    Colors(int bit, String name)
    {
        this.bit = bit;
        this.name = name;
    }

    public int bit() { return bit; }
    public String c() { return name; }
}