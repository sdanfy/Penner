package com.penner.dao;

import java.util.Collection;
import com.penner.exception.DaoException;
import com.penner.model.PlanClass;


public interface PlanClassDao {

    Collection<PlanClass> findPlanClassesByUser(int userId) throws DaoException;
}
