package com.penner.model;


public class PlanClass extends BaseModel {
    private int planClassId;
    private int planCLassLevel;
    private String planClassName;
    private int planClassPrevId;
    
    public int getPlanClassId() {
        return planClassId;
    }
    
    public void setPlanClassId(int planClassId) {
        this.planClassId = planClassId;
    }
    
    public int getPlanCLassLevel() {
        return planCLassLevel;
    }
    
    public void setPlanCLassLevel(int planCLassLevel) {
        this.planCLassLevel = planCLassLevel;
    }
    
    public String getPlanClassName() {
        return planClassName;
    }
    
    public void setPlanClassName(String planClassName) {
        this.planClassName = planClassName;
    }
    
    public int getPlanClassPrevId() {
        return planClassPrevId;
    }
    
    public void setPlanClassPrevId(int planClassPrevId) {
        this.planClassPrevId = planClassPrevId;
    }
    
    
}
