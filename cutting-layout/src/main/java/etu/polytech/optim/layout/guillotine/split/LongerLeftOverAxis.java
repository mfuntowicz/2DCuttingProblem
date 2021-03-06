package etu.polytech.optim.layout.guillotine.split;

import etu.polytech.optim.layout.lang.Rectangle;

/**
 * Created by Morgan on 12/04/2015.
 */
public class LongerLeftOverAxis extends SplitHeuristic {

    private static final String NAME = "Split Along Left Longer Axis";

    @Override
    protected boolean isSplittingHorizontally(Rectangle freeRect, Rectangle placedRect, double w, double h) {
        return w > h;
    }

    @Override
    public String name() {
        return NAME;
    }
}
