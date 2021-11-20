package view.Pages;

import javax.faces.event.ActionEvent;

import oracle.adf.controller.TaskFlowId;

public class BankCashOpenFragment {
    private String taskFlowId = "/WEB-INF/Task_Flows/Modules/Payable/OpenFragment.xml#OpenFragment";
    private String taskFlowId1 = "/WEB-INF/Task_Flows/Modules/Receivable/OpenFragment.xml#OpenFragment";
    private String taskFlowId2 = "/WEB-INF/Task_Flows/Modules/Payable/OpenFragment.xml#OpenFragment";
    private String taskFlowId3 = "/WEB-INF/Task_Flows/Modules/Receivable/OpenFragment.xml#OpenFragment";

    public BankCashOpenFragment() {
    }

    public void fragmentCall(ActionEvent actionEvent) {
        // Add event code here...
        String action = (String)actionEvent.getComponent().getAttributes().get("link");
        StringBuilder link = new StringBuilder();
        link.append("/WEB-INF/Task_Flows/Modules/Bank_Cash/");
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

    public void fragmentCall1(ActionEvent actionEvent) {
        // Add event code here...
        String action = (String)actionEvent.getComponent().getAttributes().get("link");
        StringBuilder link = new StringBuilder();
        link.append("/WEB-INF/Task_Flows/Modules/Bank_Cash/");
        link.append(action);
        link.append(".xml#");
        link.append(action);
        setDynamicTaskFlowId1(link.toString());
        
    }

    public TaskFlowId getDynamicTaskFlowId1() {
        return TaskFlowId.parse(taskFlowId1);
    }

    public void setDynamicTaskFlowId1(String taskFlowId) {
        this.taskFlowId1 = taskFlowId;
    }

    public void fragmentCall2(ActionEvent actionEvent) {
        // Add event code here...
        String action = (String)actionEvent.getComponent().getAttributes().get("link");
        StringBuilder link = new StringBuilder();
        link.append("/WEB-INF/Task_Flows/Modules/Bank_Cash/");
        link.append(action);
        link.append(".xml#");
        link.append(action);
        setDynamicTaskFlowId2(link.toString());
    }

    public TaskFlowId getDynamicTaskFlowId2() {
        return TaskFlowId.parse(taskFlowId2);
    }

    public void setDynamicTaskFlowId2(String taskFlowId) {
        this.taskFlowId2 = taskFlowId;
    }

    public void fragmentCall3(ActionEvent actionEvent) {
        // Add event code here...
        String action = (String)actionEvent.getComponent().getAttributes().get("link");
        StringBuilder link = new StringBuilder();
        link.append("/WEB-INF/Task_Flows/Modules/Bank_Cash/");
        link.append(action);
        link.append(".xml#");
        link.append(action);
        setDynamicTaskFlowId3(link.toString());
    }

    public TaskFlowId getDynamicTaskFlowId3() {
        return TaskFlowId.parse(taskFlowId3);
    }

    public void setDynamicTaskFlowId3(String taskFlowId) {
        this.taskFlowId3 = taskFlowId;
    }
}
