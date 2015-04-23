package com.penner.dao.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.penner.dao.PlanDao;
import com.penner.exception.DaoException;
import com.penner.model.Plan;

@Repository
public class PlanDaoImpl extends BaseDao implements PlanDao{

    @Override
    public Collection<Plan> findPlansByUserAndClass(int userId, int classId)
            throws DaoException {
        List<Integer> ids = new ArrayList<>();
        ids.add(userId);
        ids.add(classId);
        Map<String, Integer> map = new HashMap<String,Integer>();
        map.put("userId", userId);
        map.put("classId", classId);
        Collection<Plan> plans = getSession().selectList("penner.plan.findPlansByUserAndClass",map);
        return plans;
    }
    
}
