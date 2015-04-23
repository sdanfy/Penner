package com.penner.model;

import java.io.Serializable;
import java.util.Date;


public class BaseModel implements Serializable {
    private Date dateCreate;
    private Date dateUpdate;
    private Date dateDelete;
    
    public Date getDateCreate() {
        return dateCreate;
    }
    
    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }
    
    public Date getDateUpdate() {
        return dateUpdate;
    }
    
    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }
    
    public Date getDateDelete() {
        return dateDelete;
    }
    
    public void setDateDelete(Date dateDelete) {
        this.dateDelete = dateDelete;
    }
    
}
