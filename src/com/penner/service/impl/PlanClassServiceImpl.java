package com.penner.service.impl;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import com.penner.dao.PlanClassDao;
import com.penner.exception.DaoException;
import com.penner.exception.ServiceException;
import com.penner.model.PlanClass;
import com.penner.service.PlanClassService;


public class PlanClassServiceImpl implements PlanClassService{
    @Autowired
    private PlanClassDao planClassDao;
    
    @Override
    public Collection<PlanClass> findPlanClassesByUser(int userId) throws ServiceException {
        try {
            return planClassDao.findPlanClassesByUser(userId);
        } catch (DaoException e) {
            e.printStackTrace();
            throw new ServiceException(e);
        }
    }
}
