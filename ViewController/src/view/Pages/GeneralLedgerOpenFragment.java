package view.Pages;

import javax.faces.event.ActionEvent;

import oracle.adf.controller.TaskFlowId;

public class GeneralLedgerOpenFragment {
    private String taskFlowId =
        "/WEB-INF/Task_Flows/Modules/General_Ledger/GL_OpenFrafment_TaskFlow.xml#GL_OpenFrafment_TaskFlow";
    private String taskFlowId1 =
        "/WEB-INF/Task_Flows/Modules/General_Ledger/GL_OpenFrafment_TaskFlow.xml#GL_OpenFrafment_TaskFlow";
    private String taskFlowId2 = "/WEB-INF/Task_Flows/Modules/POS/OpenFragment.xml#OpenFragment";
    private String taskFlowId3 = "/WEB-INF/Task_Flows/Modules/POS/OpenFragment.xml#OpenFragment";
    private String taskFlowId4 = "/WEB-INF/Task_Flows/Modules/Sales/OpenFragment.xml#OpenFragment";
    private String taskFlowId5 = "/WEB-INF/Task_Flows/Modules/Sales/OpenFragment.xml#OpenFragment";
    private String taskFlowId6 = "/WEB-INF/Task_Flows/Modules/Sales/OpenFragment.xml#OpenFragment";
    private String taskFlowId7 = "/WEB-INF/Task_Flows/Modules/Payroll/OpenFragemnt.xml#OpenFragemnt";


    public GeneralLedgerOpenFragment() {
    }

    public void fragmentCall(ActionEvent actionEvent) {
        // Add event code here...
        String action = (String)actionEvent.getComponent().getAttributes().get("link");
        StringBuilder link = new StringBuilder();
        link.append("/WEB-INF/Task_Flows/Modules/Sale_Purchase/");
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


   

    public void fragmentCall2(ActionEvent actionEvent) {
        // Add event code here...
        String action = (String)actionEvent.getComponent().getAttributes().get("link");
        StringBuilder link = new StringBuilder();
        link.append("/WEB-INF/Task_Flows/Modules/Sale_Purchase/");
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


    public void fragmentCall3(ActionEvent actionEvent) {
        // Add event code here...
        String action = (String)actionEvent.getComponent().getAttributes().get("link");
        StringBuilder link = new StringBuilder();
        link.append("/WEB-INF/Task_Flows/Modules/Sale_Purchase/");
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

    public void fragmentCall4(ActionEvent actionEvent) {
        // Add event code here...
        String action = (String)actionEvent.getComponent().getAttributes().get("link");
        StringBuilder link = new StringBuilder();
        link.append("/WEB-INF/Task_Flows/Modules/Sale_Purchase/");
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

    public void fragmentCall5(ActionEvent actionEvent) {
        // Add event code here...
        String action = (String)actionEvent.getComponent().getAttributes().get("link");
        StringBuilder link = new StringBuilder();
        link.append("/WEB-INF/Task_Flows/Modules/Sale_Purchase/");
        link.append(action);
        link.append(".xml#");
        link.append(action);
        setDynamicTaskFlowId4(link.toString());
        
    }

    public TaskFlowId getDynamicTaskFlowId4() {
        return TaskFlowId.parse(taskFlowId4);
    }

    public void setDynamicTaskFlowId4(String taskFlowId) {
        this.taskFlowId4 = taskFlowId;
    }

    public void fragmentCall6(ActionEvent actionEvent) {
        // Add event code here...
        String action = (String)actionEvent.getComponent().getAttributes().get("link");
        StringBuilder link = new StringBuilder();
        link.append("/WEB-INF/Task_Flows/Modules/Sale_Purchase/");
        link.append(action);
        link.append(".xml#");
        link.append(action);
        setDynamicTaskFlowId5(link.toString());
    }

    public TaskFlowId getDynamicTaskFlowId5() {
        return TaskFlowId.parse(taskFlowId5);
    }

    public void setDynamicTaskFlowId5(String taskFlowId) {
        this.taskFlowId5 = taskFlowId;
    }

    public void fragmentCall7(ActionEvent actionEvent) {
        // Add event code here...
        String action = (String)actionEvent.getComponent().getAttributes().get("link");
        StringBuilder link = new StringBuilder();
        link.append("/WEB-INF/Task_Flows/Modules/Sale_Purchase/");
        link.append(action);
        link.append(".xml#");
        link.append(action);
        setDynamicTaskFlowId6(link.toString());
    }

    public TaskFlowId getDynamicTaskFlowId6() {
        return TaskFlowId.parse(taskFlowId6);
    }

    public void setDynamicTaskFlowId6(String taskFlowId) {
        this.taskFlowId6 = taskFlowId;
    }

    public void fragmentCall8(ActionEvent actionEvent) {
        // Add event code here...
        String action = (String)actionEvent.getComponent().getAttributes().get("link");
        StringBuilder link = new StringBuilder();
        link.append("/WEB-INF/Task_Flows/Modules/Sale_Purchase/");
        link.append(action);
        link.append(".xml#");
        link.append(action);
        setDynamicTaskFlowId7(link.toString());
    }


    public TaskFlowId getDynamicTaskFlowId7() {
        return TaskFlowId.parse(taskFlowId7);
    }

    public void setDynamicTaskFlowId7(String taskFlowId) {
        this.taskFlowId7 = taskFlowId;
    }
}
