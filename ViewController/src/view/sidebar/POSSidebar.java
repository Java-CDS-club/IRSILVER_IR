package view.sidebar;

import java.io.Serializable;

import javax.faces.event.ActionEvent;

import oracle.adf.controller.TaskFlowId;

public class POSSidebar implements Serializable{
    private String taskFlowId = "/WEB-INF/Task_Flows/Modules/POS/POS_TaskFlow.xml#POS_TaskFlow";
    private String taskFlowId1 = "/WEB-INF/Task_Flows/Modules/POS/POS_TaskFlow.xml#POS_TaskFlow";
    private String taskFlowId2 = "/WEB-INF/Task_Flows/Modules/POS/POS_TaskFlow.xml#POS_TaskFlow";

    public POSSidebar() {
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }

    public void setDynamicTaskFlowId(String taskFlowId) {
        this.taskFlowId = taskFlowId;
    }    

    public void fragmentCall(ActionEvent actionEvent) {
        // Add event code here...
        // Add event code here...
        String action = (String)actionEvent.getComponent().getAttributes().get("link");
        StringBuilder link = new StringBuilder();
        link.append("/WEB-INF/Task_Flows/Modules/POS/");
        link.append(action);
        link.append(".xml#");
        link.append(action);
        setDynamicTaskFlowId(link.toString());
    }

    public TaskFlowId getDynamicTaskFlowId2() {
        return TaskFlowId.parse(taskFlowId2);
    }

    public void setDynamicTaskFlowId2(String taskFlowId) {
        this.taskFlowId2 = taskFlowId;
    }
}
