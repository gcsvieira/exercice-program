package model.entities;

public class FieldInt extends Field {
    private int content;

    public FieldInt(String name, String workflowName, int workflowId, int content) {
        super(name, workflowName, workflowId);
        this.content = content;
    }

    public int getContent() {
        return this.content;
    }

    public void setContent(int content) {
        this.content = content;
    }
}
