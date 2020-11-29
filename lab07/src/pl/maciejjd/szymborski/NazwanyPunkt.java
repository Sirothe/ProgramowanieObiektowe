package pl.maciejjd.szymborski;

class NazwanyPunkt extends Punkt
{
    NazwanyPunkt(int x, int y, String name)
    {
        super(x, y);
        this.name = name;
    }
    @Override //lab11
    public void show()
    {
        System.out.println(name + ":<" + x() + ", " + y() + ">");
    }

    private String name;
}

