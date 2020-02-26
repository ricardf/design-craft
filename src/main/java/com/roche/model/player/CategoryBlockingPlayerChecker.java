package com.roche.model.player;

import com.roche.model.Offer;

public class CategoryBlockingPlayerChecker implements PlayerChecker {

    @Override
    public Boolean check(Offer offer) {
        return true;
    }
}
