package com.asule.app.utility;

import com.asule.app.model.Fitness;

public class FitnessValidator {

    public boolean valid(Fitness journal){
        return !(journal.getDebitBalance() == null || journal.getCreditBalance() == null ||
            journal.getDebitBalance().compareTo(journal.getCreditBalance()) !=0);
    }

    public boolean inValid(Fitness journal){
        return !this.valid(journal);
    }
}
