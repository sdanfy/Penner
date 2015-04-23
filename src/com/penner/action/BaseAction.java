package com.penner.action;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.ModelAttribute;


public class BaseAction {
    private HttpServletRequest request;
    private HttpServletResponse response;
    private HttpSession session;
    
    @ModelAttribute
    public void set(HttpServletRequest request,HttpServletResponse response){
        this.request = request;  
        response.setCharacterEncoding("UTF-8");
        this.response = response;  
        this.session = request.getSession();  
    }
    
    
    protected HttpServletRequest getRequest(){
        return this.request;
    }

    protected HttpServletResponse getResponse(){
        return this.response;
    }
    
    protected HttpSession getSession(){
        return this.session;
    }
    
    protected void writeJSON(String json) {
        try {
            this.getResponse().getWriter().write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
