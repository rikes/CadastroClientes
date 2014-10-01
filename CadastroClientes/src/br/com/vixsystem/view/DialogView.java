package br.com.vixsystem.view;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;


@ManagedBean
public class DialogView {

   public void destroyWorld() {
       addMessage("Sessão encerrada.", "Aguarde.");
   }
    
   public void addMessage(String summary, String detail) {
       FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
       FacesContext.getCurrentInstance().addMessage(null, message);
   }
}