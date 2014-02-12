package exciteholidays.com;

import java.util.Map;

/**
 * @author Leila shams
 * Date: 2/12/14
 */
public class Effect2 implements Effect{
    private Effect effect;
    private Map<String,Object> properties;

    public Effect2(Effect effect, Map<String,Object> properties) {
        this.effect = effect;
        this.properties = properties;
    }

    @Override
    public void apply(SimpleImage image) {
        if (effect!=null){
            effect.apply(image);
        }
        StringBuilder result =new StringBuilder();
        for (String key : properties.keySet()) {
            result.append(key).append(":").append(properties.get(key)).append(",");
        }
        System.out.println("Effect2 applied on the image with these properties :"+result);
    }
}
