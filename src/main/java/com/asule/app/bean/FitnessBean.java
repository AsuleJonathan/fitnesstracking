package com.asule.app.bean;

import com.asule.app.model.AuditLog;
import com.asule.app.model.Fitness;
import com.asule.app.utility.MemberNoGenerator;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.inject.Named;
import java.text.DateFormat;
import java.util.Date;

@Stateless
public class FitnessBean extends GenericBean<Fitness> implements FitnessBeanI {

    @Inject
    @Named("fitness")
    private MemberNoGenerator txnNoGenerator;

    @Inject
    private Event<AuditLog> logger;

    @Override
    public void addOrUpdate(Fitness fitness) {
        if (inValid(fitness))
            throw new RuntimeException("Invalid fitness");

        if (fitness.getDate() == null)
            fitness.setDate(new Date());

        fitness.setfitnessNo(txnNoGenerator.generate());

        getDao().addOrUpdate(fitness);

        AuditLog log = new AuditLog();
        log.setLogDetails("A fitness " + fitness.getfitnessNo() + " was added at "
                + DateFormat.getDateTimeInstance().format(new Date()));

        logger.fire(log);
    }

    @Inject
    public void logInjection() {
        System.out.println("this method is executed through injection...0");
    }

    @Inject
    public void logInjection1() {
        System.out.println("this method is executed through injection....1");
    }

    @Inject
    public void logInjection2() {
        System.out.println("this method is executed through injection....2");
    }

    private boolean inValid(Fitness fitness) {
        // Implement your validation logic here
        return false;
    }
}
