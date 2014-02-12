package exciteholidays.com;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Leila shams
 * Date: 2/12/14
 */
public class Container implements Component{

    List<Component> items = new ArrayList<Component>();
    private short width;
    private short high;

    public Container(short width, short high) {
        this.width = width;
        this.high = high;
    }

    @Override
    public void add(Component item) {
        items.add(item);
    }

    @Override
    public void remove(Component item) {
        items.remove(item);
    }

    @Override
    public Component getChild(int index) {
        return items.get(index);
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
        int index = 1;
        for (Component item : items) {
            System.out.print(" index :"+index++);
            item.paint();
        }
    }
}
