package com.asule.app.bean;

import com.asule.app.model.Workout;
import com.asule.app.utility.InvoiceNoGenerator;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
@Remote
public class workoutBean extends GenericBean<Workout> implements WorkoutBeanI {

    @Inject
    private InvoiceNoGenerator invoiceNoGenerator;

    @Override
    public void addOrUpdate(Workout invoice) {
        invoice.setInvoiceNo(invoiceNoGenerator.generate());
        getDao().addOrUpdate(invoice);

    }
}
