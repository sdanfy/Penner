package com.penner.dao;

import java.util.Collection;
import com.penner.exception.DaoException;
import com.penner.model.Plan;


public interface PlanDao {
    Collection<Plan> findPlansByUserAndClass(int userId,int classId) throws DaoException;
    
}
