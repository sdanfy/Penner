package com.penner.action;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSON;
import com.penner.exception.ServiceException;
import com.penner.model.Plan;
import com.penner.model.PlanClass;
import com.penner.service.PlanClassService;
import com.penner.service.PlanService;

@Controller
public class PlanAction extends BaseAction{
    @Autowired
    private PlanService planService;
    
    @Autowired
    private PlanClassService planClassService;
    
    @ResponseBody
    @RequestMapping(value="/plan/q",method=RequestMethod.POST)
    public String findPlansByUserAndClass(int userId,int classId){
        try {
            // TODO userId from Session . 
            Collection<Plan> plans = planService.findPlansByUserAndClass(userId, classId);
            String jsonString = JSON.toJSONString(plans);
            this.writeJSON(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    @ResponseBody
    @RequestMapping(value="/plan/cs/q",method=RequestMethod.POST)
    public String findClassesByUser(int userId){
        try {
            // TODO userId from Session
            Collection<PlanClass> planClasses = planClassService.findPlanClassesByUser(userId);
            this.writeJSON(JSON.toJSONString(planClasses));
        } catch (ServiceException e) {
            e.printStackTrace();
        }
        return null;
    }
}
