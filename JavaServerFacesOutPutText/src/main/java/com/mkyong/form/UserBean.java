package com.mkyong.form;
 
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="user")
@SessionScoped
public class UserBean{
	private boolean editmode=false;
	

	public String text = "This is Text!";
	public String htmlInput = "<input type='text' size='20' />";
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getHtmlInput() {
		return htmlInput;
	}
	public void setHtmlInput(String htmlInput) {
		this.htmlInput = htmlInput;
	}
	public boolean isEditmode() {
		return editmode;
	}
	public void setEditmode(boolean editmode) {
		this.editmode = editmode;
	}

	
}