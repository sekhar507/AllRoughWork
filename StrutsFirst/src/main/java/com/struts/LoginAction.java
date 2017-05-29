package com.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LoginAction extends Action{
	
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response)
	{
		
	
	LoginForm logiform=(LoginForm)form;
	String forward=null;
	
	System.out.println(logiform.getUsername());
	
	ValidateLoginDetails details=new ValidateLoginDetails();
	boolean isValidate=details.validateLogin(logiform.getUsername(), logiform.getPassword());
	if(isValidate)
	{
		forward="failure";
	}
	else{
		forward="success";
	}
	
	return mapping.findForward(forward);
		
		

}
}
