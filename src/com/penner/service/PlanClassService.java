package com.penner.service;

import java.util.Collection;
import com.penner.exception.ServiceException;
import com.penner.model.PlanClass;


public interface PlanClassService {

    Collection<PlanClass> findPlanClassesByUser(int userId)
            throws ServiceException;
}
