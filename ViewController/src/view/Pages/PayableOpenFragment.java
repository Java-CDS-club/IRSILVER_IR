package view.Pages;

import javax.faces.event.ActionEvent;

import oracle.adf.controller.TaskFlowId;

public class PayableOpenFragment {


    private String taskFlowId =
        "/WEB-INF/Task_Flows/Modules/General_Ledger/GL_OpenFrafment_TaskFlow.xml#GL_OpenFrafment_TaskFlow";

    public PayableOpenFragment() {
    }

    public void fragmentCall(ActionEvent actionEvent) {
        // Add event code here...
        String action = (String)actionEvent.getComponent().getAttributes().get("link");
        StringBuilder link = new StringBuilder();
        link.append("/WEB-INF/Task_Flows/Modules/Payable/");
        link.append(action);
        link.append(".xml#");
        link.append(action);
        setDynamicTaskFlowId(link.toString());
    }


    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }

    public void setDynamicTaskFlowId(String taskFlowId) {
        this.taskFlowId = taskFlowId;
    }
}
