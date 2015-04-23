package com.penner.service.impl;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.penner.dao.PlanDao;
import com.penner.exception.DaoException;
import com.penner.exception.ServiceException;
import com.penner.model.Plan;
import com.penner.service.PlanService;


@Service
public class PlanServiceImpl implements PlanService{
    
    @Autowired
    private PlanDao planDao;

    @Override
    public Collection<Plan> findPlansByUserAndClass(int userId, int classId)
            throws ServiceException {
        try {
            return planDao.findPlansByUserAndClass(userId, classId);
        } catch (DaoException e) {
            e.printStackTrace();
            throw new ServiceException(e);
        }
    }
}
