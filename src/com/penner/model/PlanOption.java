package com.penner.model;


public class PlanOption extends BaseModel{
    private int planOptionId;
    private String planOptionName;
    private String planOptionCmd;
    private int planOptionStatus;
    private int planOptionPrevId;
    private int refPlanId;
    
    public int getPlanOptionId() {
        return planOptionId;
    }
    
    public void setPlanOptionId(int planOptionId) {
        this.planOptionId = planOptionId;
    }
    
    public String getPlanOptionName() {
        return planOptionName;
    }
    
    public void setPlanOptionName(String planOptionName) {
        this.planOptionName = planOptionName;
    }
    
    public String getPlanOptionCmd() {
        return planOptionCmd;
    }
    
    public void setPlanOptionCmd(String planOptionCmd) {
        this.planOptionCmd = planOptionCmd;
    }
    
    public int getPlanOptionStatus() {
        return planOptionStatus;
    }
    
    public void setPlanOptionStatus(int planOptionStatus) {
        this.planOptionStatus = planOptionStatus;
    }
    
    public int getPlanOptionPrevId() {
        return planOptionPrevId;
    }
    
    public void setPlanOptionPrevId(int planOptionPrevId) {
        this.planOptionPrevId = planOptionPrevId;
    }
    
    public int getRefPlanId() {
        return refPlanId;
    }
    
    public void setRefPlanId(int refPlanId) {
        this.refPlanId = refPlanId;
    }
    
}
