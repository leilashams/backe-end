package exciteholidays.com;

import java.util.Map;

/**
 * @author Leila shams
 * Date: 2/12/14
 */
public class Effect1 implements Effect{
    private Effect effect;
    private Map<String,Long> properties;

    public Effect1(Effect effect, Map<String, Long> properties) {
        this.effect = effect;
        this.properties = properties;
    }

    @Override
    public void apply(SimpleImage image) {
        if (effect!=null){
            effect.apply(image);
        }
        System.out.println("Effect1 applied on the image with non properties ");
    }
}
