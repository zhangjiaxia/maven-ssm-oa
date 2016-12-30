package com.huawei.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OA_Task {
	private List<OA_User> oa_users=new ArrayList<OA_User>();
	
	private Integer taskId;

    private Date taskTime;

    private String taskContent;

    private Integer taskFromuser;

    private Date taskLimit;

    public List<OA_User> getOa_users() {
		return oa_users;
	}

	public void setOa_users(List<OA_User> oa_users) {
		this.oa_users = oa_users;
	}

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Date getTaskTime() {
        return taskTime;
    }

    public void setTaskTime(Date taskTime) {
        this.taskTime = taskTime;
    }

    public String getTaskContent() {
        return taskContent;
    }

    public void setTaskContent(String taskContent) {
        this.taskContent = taskContent == null ? null : taskContent.trim();
    }

    public Integer getTaskFromuser() {
        return taskFromuser;
    }

    public void setTaskFromuser(Integer taskFromuser) {
        this.taskFromuser = taskFromuser;
    }

    public Date getTaskLimit() {
        return taskLimit;
    }

    public void setTaskLimit(Date taskLimit) {
        this.taskLimit = taskLimit;
    }
}