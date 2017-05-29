package com.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LoginAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {

		LoginForm loginform = (LoginForm) form;
		String forward = null;
		System.out.println(loginform.getUsername());
		ValidateLogin details = new ValidateLogin();
		System.out.println("Object created");
		boolean isvalid = details.validateLoginDetails(loginform.getUsername(),loginform.getPassword());
		System.out.println("Method called");

		if (isvalid) {
			forward = "success";
		} else{
			forward = "failure";
		}

		return mapping.findForward(forward);
	}

}
