package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private List<Field> fields = new ArrayList<Field>();
    private List<WorkflowStatus> workflow = new ArrayList<WorkflowStatus>();

    public Client(String razaoSocial, int cnpj, boolean contactType, String contact) {
        fields.add(new FieldString("Razão Social", "Cliente em potencial", 1, razaoSocial));
        fields.add(new FieldInt("CNPJ", "Cliente em potencial", 1, cnpj));

        if (contactType) {
            fields.add(new FieldString("E-mail", "Cliente em potencial", 1, contact));
        } else {
            fields.add(new FieldInt("Telefone", "Cliente em potencial", 1, Integer.parseInt(contact)));

        }
    }

    public void createFieldString(String name, String workflowName, int workflowId, String content) {
        fields.add(new FieldString(name, workflowName, workflowId, content));
    }

    public void createFieldInt(String name, String workflowName, int workflowId, int content) {
        fields.add(new FieldInt(name, workflowName, workflowId, content));
    }

    public List<Field> getFields() {
        return this.fields;
    }

    public List<WorkflowStatus> getWorkflow() {
        return this.workflow;
    }

    @Override
    public String toString() {
        return "{" +
                " fields='" + getFields() + "'" +
                ", workflow='" + getWorkflow() + "'" +
                "}";
    }
}
