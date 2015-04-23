package com.penner.service;

import java.util.Collection;
import com.penner.exception.ServiceException;
import com.penner.model.Plan;


public interface PlanService {
    Collection<Plan> findPlansByUserAndClass(int userId,int classId) throws ServiceException;
}
