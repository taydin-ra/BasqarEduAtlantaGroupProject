package PojoFiles;

public class Budget {
    /*
    active: true
comment: ""
constants: []
description: "Description"
enterEndDate: "2020-09-22T00:00:00.000Z"
enterStartDate: "2020-09-20T00:00:00.000Z"
id: null
status: "STARTED"
     */

    private Boolean active;
    private String description;
    private String enterEndDate;
    private String enterStartDate;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEnterEndDate() {
        return enterEndDate;
    }

    public void setEnterEndDate(String enterEndDate) {
        this.enterEndDate = enterEndDate;
    }

    public String getEnterStartDate() {
        return enterStartDate;
    }

    public void setEnterStartDate(String enterStartDate) {
        this.enterStartDate = enterStartDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String status;
}
