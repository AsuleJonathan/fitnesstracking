package com.asule.app.utility;

import javax.inject.Inject;
import javax.inject.Named;
import java.text.SimpleDateFormat;
import java.util.Date;

@Named("fitness")
public class FitnessNoGenerator implements MemberNoGenerator{

    @Inject
    @MemberNo(type = MemberType.fitness)
    private int fitnessNoInfo;

    public String generate(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");

        return "JNL" + dateFormat.format(new Date()) + "-" + fitnessNoInfo;
    }
}
