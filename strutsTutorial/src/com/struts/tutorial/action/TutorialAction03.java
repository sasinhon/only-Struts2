package com.struts.tutorial.action;

public class TutorialAction03 {
	private String msg;
	
	// �Ķ���� �� ������
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	// �信 �����Ҷ�
	public String getMsg() {
		return msg;
	}
	
	public String execute(){
		System.out.println(msg);
		return "success";
	}	
}
