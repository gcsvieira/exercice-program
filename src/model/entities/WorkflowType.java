package model.entities;

public class WorkflowType {
    private String type;
    private int typeId;

    public WorkflowType(int typeId) {
        switch (typeId) {
            case 1:
                this.typeId = typeId;
                this.type = "Aberto";
                break;

            case 2:
                this.typeId = typeId;
                this.type = "Desenvolvimento";
                break;

            case 3:
                this.typeId = typeId;
                this.type = "Conclusão";
                break;
            default:
                this.typeId = typeId;
                this.type = "Aberto";
        }
    }

    public WorkflowType() {
    }

    public String getType() {
        return this.type;
    }

    public int getTypeId() {
        return this.typeId;
    }
}
