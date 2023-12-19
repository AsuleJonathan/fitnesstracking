package com.asule.app.model.entity;

import com.asule.database.helper.DBTableId;
import com.asule.database.helper.DbTableColumn;
import com.asule.view.html.FitnessTableColHeader;

import java.io.Serializable;

public class BaseEntity implements Serializable {
    @FitnessTableColHeader(headerLabel = "id")
    @DBTableId
    @DbTableColumn(name = "id", definition = "int", primaryKey = "primary key", notNull = "not null")
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
