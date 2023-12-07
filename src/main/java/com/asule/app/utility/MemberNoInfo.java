package com.asule.app.utility;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import java.util.concurrent.ThreadLocalRandom;

@ApplicationScoped
public class MemberNoInfo {


    @Produces
    @MemberNo(type = MemberType.fitness)
    int fitnessNoInfo(){
        return ThreadLocalRandom.current().nextInt(0, 1000 + 1);
    }

    @Produces
    @MemberNo(type = MemberType.workout)
    int workoutNoInfo(){
        return ThreadLocalRandom.current().nextInt(1000, 2000 + 1);
    }


}
