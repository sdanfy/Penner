package com.penner.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Add by CK
 * Jan 31, 2015
 */
public abstract class BaseDao {

    /** sqlSessionFactory , add by vivian.liu */
    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    /** session , add by vivian.liu */
    private SqlSession session;

    /**
     * @return the session
     */
    public SqlSession getSession() {
        if (session == null) {
            session = this.getSqlSessionFactory().openSession();
        }
        return session;
    }

    /**
     * @param session
     *        the session to set
     */
    public void setSession(SqlSession session) {
        this.session = session;
    }

    /**
     * @return the sqlSessionFactory
     */
    public SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }

    /**
     * @param sqlSessionFactory
     *        the sqlSessionFactory to set
     */
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }
}
