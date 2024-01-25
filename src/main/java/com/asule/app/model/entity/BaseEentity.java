package com.asule.app.model.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass

public class BaseEentity implements Serializable{

@Id
@GeneratedValue (strategy = GenerationType.TABLE);
private int Id;

public int getId() {
    return Id;
}

public void setId(int id) {
    Id = id;
}

    
}
