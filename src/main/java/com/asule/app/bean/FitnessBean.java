package com.asule.app.bean;

import com.asule.app.model.Fitness;
import com.asule.app.utility.FitnessNoGenerator;
import com.asule.app.utility.FitnessValidator;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.Date;

@Stateless
public class FitnessBean extends GenericBean<Fitness> implements FitnessBeanI{

    @Inject
    private FitnessNoGenerator  fitnessNoGenerator;

    @Inject
    private FitnessValidator fitnessValidator;

    @Override
    public void addOrUpdate(Fitness journal) {
        if (fitnessValidator.inValid(journal))
            throw new RuntimeException("Invalid journal");

        if (journal.getDate() == null)
            journal.setDate(new Date());

        journal.setJournalNo( fitnessNoGenerator.generate());
        getDao().addOrUpdate(journal);

    }

    @Inject
    public void logInjection(){
        System.out.println("this method is executed through injection...0");
    }

    @Inject
    public void logInjection1(){
        System.out.println("this method is executed through injection....1");
    }

    @Inject
    public void logInjection2(){
        System.out.println("this method is executed through injection....2");
    }

}
