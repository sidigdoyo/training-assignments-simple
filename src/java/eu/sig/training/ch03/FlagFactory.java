package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FlagFactory {

    private HashMap<Integer, List<Color>> colors = new HashMap<Integer, List<Color>>();
    colors.put(1, Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
    colors.put(2, Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW));
    colors.put(3, Arrays.asList(Color.BLACK, Color.YELLOW, Color.RED));
    colors.put(4, Arrays.asList(Color.BLUE, Color.WHITE, Color.RED));
    colors.put(5, Arrays.asList(Color.GREEN, Color.WHITE, Color.RED));
    colors.put(6, Arrays.asList(Color.BLUE, Color.YELLOW, Color.RED));
    colors.put(7, Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
    colors.put(8, Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
    colors.put(9, Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));


    // tag::getFlag[]
    public List<Color> getFlagColors(Nationality nationality) {
        return colors.get(nationality);
    }
    // end::getFlag[]

}