package PojoFiles;

public class FeesType {

    //   {id: null, name: "merve", translateName: [], code: "bio101", priority: "12345", active: true,…}

    private String name;
    private String code;
    private int priority;
    private int budgetAccountIntegrationCode;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    private Boolean active;

    public int getBudgetAccountIntegrationCode() {
        return budgetAccountIntegrationCode;
    }

    public void setBudgetAccountIntegrationCode(int budgetAccountIntegrationCode) {
        this.budgetAccountIntegrationCode = budgetAccountIntegrationCode;
    }


}
