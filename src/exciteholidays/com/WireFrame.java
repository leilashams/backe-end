package exciteholidays.com;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Leila shams
 *         Date: 2/12/14
 */
public class WireFrame {
    static Component frame = new Container((short) 100, (short) 200);
    static short countImage = 0;

    public static void main(String[] args) {
        boolean continueFlg = true;
        short choiceNumber;

        do {
            try {
                displayMenu();
                Scanner s = new Scanner(System.in);
                choiceNumber = Short.valueOf(s.nextLine());
                switch (choiceNumber) {
                    case 1:
                        addImage();
                        break;
                    case 2:
                        addEffect();
                        break;
                    case 3:
                        draw();
                        continueFlg = false;
                        break;
                }
            } catch (IOException e) {
                e.printStackTrace();
                continue;
            }

        } while (continueFlg);
    }

    private static void displayMenu() throws IOException {
        System.out.println("1. add an image. ");
        System.out.println("2. add an effect to images ");
        System.out.println("3. draw images and exit.");
        System.out.println("--------------------------");
        System.out.println("Please enter your choice :");
    }

    private static void addImage() {
        System.out.println("please enter width");
        Scanner s = new Scanner(System.in);
        String width = s.nextLine();
        System.out.println("please enter high");
        String high = s.nextLine();
        SimpleImage newImage = new SimpleImage(Short.valueOf(width), Short.valueOf(high));
        frame.add(newImage);
        countImage++;
    }

    private static void addEffect() {
        System.out.println("please enter an image number between 1 and " + countImage+":");
        Scanner s = new Scanner(System.in);
        short index = Short.valueOf(s.nextLine());
        if (index < 1 || index > countImage) {
            System.out.println(" Invalid number!");
            return;
        }
        SimpleImage image = (SimpleImage) frame.getChild(index-1);
        System.out.println("please enter an effect number between 1 and 4 :");
        short e = Short.valueOf(s.nextLine());
        if (index < 1 || index > 4) {
            System.out.println(" Invalid number!");
            return;
        }
        switch (e) {
            case 1:
                addEffect1(image);
                break;
            case 2:
                addEffect2(image);
                break;
            case 3:
                addEffect3(image);
                break;
            case 4:
                addEffect4(image);
                break;
        }
    }

    private static void addEffect1(SimpleImage image) {
        Effect currentEffect = image.getEffect();
        Effect newEffect = new Effect1(currentEffect, null);
        image.setEffect(newEffect);
    }

    private static void addEffect2(SimpleImage image) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter effect-specific-1 value : ");
        String value = s.nextLine();
        Map<String, Object> properties = new HashMap<String, Object>();
        properties.put("effect-specific-1", value);
        Effect currentEffect = image.getEffect();
        Effect newEffect = new Effect2(currentEffect, properties);
        image.setEffect(newEffect);
    }

    private static void addEffect3(SimpleImage image) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter effect-specific-1 value : ");
        String value = s.nextLine();
        Map<String, Object> properties = new HashMap<String, Object>();
        properties.put("effect-specific-1", value);
        System.out.println("Please enter effect-specific-2 value : ");
        value = s.nextLine();
        properties.put("effect-specific-2", value);
        Effect currentEffect = image.getEffect();
        Effect newEffect = new Effect3(currentEffect, properties);
        image.setEffect(newEffect);
    }

    private static void addEffect4(SimpleImage image) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter effect-specific-1 value : ");
        String value = s.nextLine();
        Map<String, Object> properties = new HashMap<String, Object>();
        properties.put("effect-specific-1", value);
        System.out.println("Please enter effect-specific-2 value : ");
        value = s.nextLine();
        properties.put("effect-specific-2", value);
        System.out.println("Please enter effect-specific-3 value : ");
        value = s.nextLine();
        properties.put("effect-specific-3", value);
        Effect currentEffect = image.getEffect();
        Effect newEffect = new Effect4(currentEffect, properties);
        image.setEffect(newEffect);
    }


    private static void draw() {
        frame.paint();
    }

}
