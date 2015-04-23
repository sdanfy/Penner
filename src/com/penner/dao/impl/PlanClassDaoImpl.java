package com.penner.dao.impl;

import java.util.Collection;
import com.penner.dao.PlanClassDao;
import com.penner.exception.DaoException;
import com.penner.model.PlanClass;


public class PlanClassDaoImpl extends BaseDao implements PlanClassDao{
    @Override
    public Collection<PlanClass> findPlanClassesByUser(int userId) throws DaoException{
        Collection<PlanClass> planClasses = getSession().selectList("penner.plan.class.findPlanClassesByUser", userId);
        return planClasses;
    }
}
