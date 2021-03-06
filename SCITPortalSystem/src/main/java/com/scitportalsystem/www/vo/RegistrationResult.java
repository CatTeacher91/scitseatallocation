package com.scitportalsystem.www.vo;

import java.util.Date;

/*
 * 출결관리, 지각보고에 대한 정보
 */
public class RegistrationResult {
	private int registrationNum; // -- 출결관리 글 번호
	private int alumni; // -- 기수
	private String classroom; // -- 반
	private String name; //-- 이름(실명)
	private String id; // --글 작성자 회원번호
	private String registrationContent; // -- 출결관리 글 내용
	private int registrationReason;		// -- 출결 이유
	private String estimatedTime; // -- 도착 예정 시간
	private Date registrationDate; // -- 출결관리 글 작성일
	private int deleteStatus; // -- 논리적 삭제 여부
	private String deleteBy; // -- 논리적 삭제 실행자
	private Date deleteDate; // --논리적 삭제 실행일
	private int late; 		// -- 지각 횟수
	private int absent;		// -- 결석 횟수
	private String attendance_stu;	// -- 출결 확인 여부 
	
	public RegistrationResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegistrationResult(int registrationNum, int alumni, String classroom, String name, String id,
			String registrationContent, int registrationReason, String estimatedTime, Date registrationDate,
			int deleteStatus, String deleteBy, Date deleteDate, int late, int absent, String attendance_stu) {
		super();
		this.registrationNum = registrationNum;
		this.alumni = alumni;
		this.classroom = classroom;
		this.name = name;
		this.id = id;
		this.registrationContent = registrationContent;
		this.registrationReason = registrationReason;
		this.estimatedTime = estimatedTime;
		this.registrationDate = registrationDate;
		this.deleteStatus = deleteStatus;
		this.deleteBy = deleteBy;
		this.deleteDate = deleteDate;
		this.late = late;
		this.absent = absent;
		this.attendance_stu = attendance_stu;
	}

	public int getRegistrationNum() {
		return registrationNum;
	}

	public void setRegistrationNum(int registrationNum) {
		this.registrationNum = registrationNum;
	}

	public int getAlumni() {
		return alumni;
	}

	public void setAlumni(int alumni) {
		this.alumni = alumni;
	}

	public String getClassroom() {
		return classroom;
	}

	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRegistrationContent() {
		return registrationContent;
	}

	public void setRegistrationContent(String registrationContent) {
		this.registrationContent = registrationContent;
	}

	public int getRegistrationReason() {
		return registrationReason;
	}

	public void setRegistrationReason(int registrationReason) {
		this.registrationReason = registrationReason;
	}

	public String getEstimatedTime() {
		return estimatedTime;
	}

	public void setEstimatedTime(String estimatedTime) {
		this.estimatedTime = estimatedTime;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public int getDeleteStatus() {
		return deleteStatus;
	}

	public void setDeleteStatus(int deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

	public String getDeleteBy() {
		return deleteBy;
	}

	public void setDeleteBy(String deleteBy) {
		this.deleteBy = deleteBy;
	}

	public Date getDeleteDate() {
		return deleteDate;
	}

	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}

	public int getLate() {
		return late;
	}

	public void setLate(int late) {
		this.late = late;
	}

	public int getAbsent() {
		return absent;
	}

	public void setAbsent(int absent) {
		this.absent = absent;
	}

	public String getAttendance_stu() {
		return attendance_stu;
	}

	public void setAttendance_stu(String attendance_stu) {
		this.attendance_stu = attendance_stu;
	}

	@Override
	public String toString() {
		return "RegistrationResult [registrationNum=" + registrationNum + ", alumni=" + alumni + ", classroom="
				+ classroom + ", name=" + name + ", id=" + id + ", registrationContent=" + registrationContent
				+ ", registrationReason=" + registrationReason + ", estimatedTime=" + estimatedTime
				+ ", registrationDate=" + registrationDate + ", deleteStatus=" + deleteStatus + ", deleteBy=" + deleteBy
				+ ", deleteDate=" + deleteDate + ", late=" + late + ", absent=" + absent + ", attendance_stu="
				+ attendance_stu + "]";
	}
	
	
	
	
	
	

	
	
	
	
	
}
	
	
	

	
	