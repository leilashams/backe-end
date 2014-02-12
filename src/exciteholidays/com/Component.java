package exciteholidays.com;

/**
 * @author Leila shams
 *         Date: 2/12/14
 */
public interface Component {
    /**
     * add a component to container
     * @param item is a new component that should be added to the container
     */
    void add(Component item);

    /**
     * remove a component from container
      * @param item is a component that should be removed from the container.
     */
    void remove(Component item);

    /**
     * @param index number of component that should returned from container
     * @return component
     */
    Component getChild(int index);

    /**
     * @return width of component
     */
    short getWidth();

    /**
     * @return high of component
     */
    short getHigh();

    /**
     * draw a component
     */
    void paint();

}
