package model.entities;

public class Field {
    private String name;
    private WorkflowStatus workflowId;

    public Field(String name, String workflowName, int workflowId) {
        this.name = name;
        this.workflowId = new WorkflowStatus(workflowName, workflowId);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkflowStatus getWorkflowId() {
        return this.workflowId;
    }

    public void setWorkflowId(WorkflowStatus workflowId) {
        this.workflowId = workflowId;
    }
}
