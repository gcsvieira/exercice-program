package model.entities;

public class WorkflowStatus {
    private String name;
    private WorkflowType type;

    public WorkflowStatus(String name, int typeId) {
        this.name = name;
        this.type = new WorkflowType(typeId);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkflowType getType() {
        return this.type;
    }
}
