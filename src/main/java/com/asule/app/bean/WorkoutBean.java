package com.asule.app.bean;

import com.asule.app.model.AuditLog;
import com.asule.app.model.Workout;
import com.asule.app.utility.MemberNoGenerator;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.inject.Named;
import java.text.DateFormat;
import java.util.Date;

@Stateless
@Remote
public class WorkoutBean extends GenericBean<Workout> implements WorkoutBeanI {

    @Inject
    @Named("workout")
    private MemberNoGenerator txnNoGenerator;

    @Inject
    private Event<AuditLog> logger;

    @Override
    public void addOrUpdate(Workout workout) {
        workout.setworkoutNo(txnNoGenerator.generate());
        getDao().addOrUpdate(workout);



        AuditLog log = new AuditLog();
        log.setLogDetails("A workout " + workout.getworkoutNo() + " was added at "
            + DateFormat.getDateTimeInstance().format(new Date()));

        logger.fire(log);
    }
}
