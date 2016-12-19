package ar.gob.mpf.siif.web.view.managedbean;


import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import ar.gob.mpf.commons.model.entities.Causa;
import ar.gob.mpf.siif.siifweb.view.service.CriminalCausesService;

/**
 * 
 * ManagedBean for home page 
 * 
 * @author a-b
 *
 */
@ManagedBean
@ViewScoped
public class HomeCausesManagedBean implements Serializable{
	  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<Causa> criminalCauses;
     
    private Causa selectedCause;
     
    @ManagedProperty("#{causesService}")
    private CriminalCausesService service;
     
    @PostConstruct
    public void init() {
        criminalCauses = service.createCauses(10);
    }
 
    public List<Causa> getCriminalCauses() {
        return criminalCauses;
    }
 
    public void setService(CriminalCausesService service) {
        this.service = service;
    }
 
    public Causa getSelectedCause() {
        return selectedCause;
    }
 
    public void setSelectedCause(Causa selectedCauses) {
        this.selectedCause = selectedCauses;
    }
    
    
	public String goToDetail() {
		return "/pages/timeLine.xhtml";
	}
}
