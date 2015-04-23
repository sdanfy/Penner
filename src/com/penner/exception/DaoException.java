package com.penner.exception;


public class DaoException extends Exception {
    public DaoException(String msg){
        super(msg);
    }
    
    public DaoException(Throwable e){
        super(e);
    }
    
    public DaoException(String msg,Throwable e){
        super(msg, e);
    }
}
