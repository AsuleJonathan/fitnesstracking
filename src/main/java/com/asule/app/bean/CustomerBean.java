package com.asule.app.bean;

import com.asule.app.model.Customer;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote
public class CustomerBean extends GenericBean<Customer> implements CustomerBeanI {
}
