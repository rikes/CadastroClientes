package br.com.vixsystem.view;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class MenuView {	
	
	    private String orientation = "horizontal";
	 
	    public String getOrientation() {
	        return orientation;
	    }
	 
	    public void setOrientation(String orientation) {
	        this.orientation = orientation;
	    }
}

