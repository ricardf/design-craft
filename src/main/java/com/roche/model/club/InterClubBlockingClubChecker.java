package com.roche.model.club;

import com.roche.model.Offer;

public class InterClubBlockingClubChecker implements ClubChecker {
    @Override
    public Boolean check(Offer offer) {
        return true;
    }
}
