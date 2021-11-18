package view.Pages;

import javax.faces.event.ActionEvent;

import oracle.adf.controller.TaskFlowId;

public class DrawerOpenFragment {
    private String taskFlowId = "/WEB-INF/Task_Flows/Modules/Donation/Openfragment_TaskFlow.xml#Openfragment_TaskFlow";

    public DrawerOpenFragment() {
    }

    public void fragmentCall(ActionEvent actionEvent) {
        // Add event code here...
        String action = (String)actionEvent.getComponent().getAttributes().get("link");
        StringBuilder link = new StringBuilder();
        link.append("/WEB-INF/Task_Flows/Modules/General_Ledger/");
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
