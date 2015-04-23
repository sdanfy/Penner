package com.penner.model;




public class Plan extends BaseModel{
    private int planId;
    private String planTitle;
    private String planDesc;
    private String planCmd;
    private int planType;
    private int refPlanClassId;
    private int refUserId;
    
    public int getPlanId() {
        return planId;
    }
    
    public void setPlanId(int planId) {
        this.planId = planId;
    }
    
    public String getPlanTitle() {
        return planTitle;
    }
    
    public void setPlanTitle(String planTitle) {
        this.planTitle = planTitle;
    }
    
    public String getPlanDesc() {
        return planDesc;
    }
    
    public void setPlanDesc(String planDesc) {
        this.planDesc = planDesc;
    }
    
    public String getPlanCmd() {
        return planCmd;
    }
    
    public void setPlanCmd(String planCmd) {
        this.planCmd = planCmd;
    }
    
    public int getPlanType() {
        return planType;
    }
    
    public void setPlanType(int planType) {
        this.planType = planType;
    }
    
    public int getRefPlanClassId() {
        return refPlanClassId;
    }
    
    public void setRefPlanClassId(int refPlanClassId) {
        this.refPlanClassId = refPlanClassId;
    }
    
    public int getRefUserId() {
        return refUserId;
    }
    
    public void setRefUserId(int refUserId) {
        this.refUserId = refUserId;
    }
    
    
}
