package com.asule.utils;

import javax.inject.Named;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

@Named("Membership")
public class MembershipNumber implements UniqueNoGenerator {
    public String generate(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yy/MM/dd");
        return "TIC" + dateFormat.format(new Date()) + "-" + ThreadLocalRandom.current().nextInt(1000, 2000 + 1);
    }
}