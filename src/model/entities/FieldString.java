package model.entities;

public class FieldString extends Field {
    private String content;

    public FieldString(String name, String workflowName, int workflowId, String content) {
        super(name, workflowName, workflowId);
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
