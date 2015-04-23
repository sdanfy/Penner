package com.penner.exception;


public class ServiceException extends Exception{
    public ServiceException(String msg){
        super(msg);
    }
    
    public ServiceException(Throwable e){
        super(e);
    }
    
    public ServiceException(String msg,Throwable e){
        super(msg, e);
    }
}
