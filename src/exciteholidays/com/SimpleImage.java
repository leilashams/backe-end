package exciteholidays.com;

/**
 * @author Leila shams
 * Date: 2/12/14
 */
public class SimpleImage implements Component,Image{
    private short width;
    private short high;
    private Effect effect;

    public SimpleImage(short width, short high) {
        this.width = width;
        this.high = high;
    }

    @Override
    public void add(Component item) {
    }

    @Override
    public void remove(Component item) {
    }

    @Override
    public Component getChild(int index) {
        return null;
    }

    @Override
    public short getWidth() {
        return width;
    }

    @Override
    public short getHigh() {
        return high;
    }

    @Override
    public void paint() {
        System.out.println(" - paint an Image with:" );
        System.out.println(" - these properties ");
        System.out.println("    width = " + width);
        System.out.println("    high = " + high);
        if (effect!=null){
            System.out.println(" - These effects ");
            effect.apply(this);
        }
        System.out.println("-----------------------------------------------");
    }

    @Override
    public void setEffect(Effect effect) {
        this.effect=effect;
    }

    @Override
    public Effect getEffect() {
        return effect;
    }
}
