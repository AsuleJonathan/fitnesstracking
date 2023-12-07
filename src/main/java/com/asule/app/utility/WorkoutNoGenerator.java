package com.asule.app.utility;

import javax.inject.Inject;
import javax.inject.Named;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

@Named("workout")
public class WorkoutNoGenerator implements MemberNoGenerator{

    @Inject
    @MemberNo(type = MemberType.workout)
    private int workoutNoInfo;

    public String generate(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yy/MM/dd");

        return "INV" + dateFormat.format(new Date()) + "-" + workoutNoInfo;
    }

}
