package de.Adorsys.project.overview.domain;

public class Project {

    private String projectOwner;
    private String projectManager;
    private String scrumMaster;
    private String technicalLead;

    public String getProjectOwner() {
        return projectOwner;
    }

    public void setProjectOwner(String projectOwner) {
        this.projectOwner = projectOwner;
    }

    public String getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(String projectManager) {
        this.projectManager = projectManager;
    }

    public String getScrumMaster() {
        return scrumMaster;
    }

    public void setScrumMaster(String scrumMaster) {
        this.scrumMaster = scrumMaster;
    }

    public String getTechnicalLead() {
        return technicalLead;
    }

    public void setTechnicalLead(String technicalLead) {
        this.technicalLead = technicalLead;
    }
}
