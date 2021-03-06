package com.scitportalsystem.www.vo;
 
/* 
 * 설문조사 답변용에 대한 정보
 * 이건 설문조사 답변 양식의 프로토 타입입니다.
 * 양식이 유동적으로 바뀌게 되면 이 VO도 유동적으로 바꾸거나, 
 * 다른 방법으로 DB의 자료 사용할 수 있도록 불러와야합니다.
 */
public class Survey { 
	  
	private int surveyNum; // -- 설문조사 양식 번호
	private String name; // -- 설문조사 작성한 선생님 이름
	// 실제 데이터베이스상 Survey 테이블에는 name 항목 없음.
	// 조인으로 다른 테이블에서 이름을 가져올 때 VO를 통해 가져오기 위해 생성한 것.
	private int teacherNum; // -- 설문조사 작성한 선생님 번호
	private int surveyCategory; // -- 설문조사 분
	private String surveyTitle; // -- 설문조사 제목
	private String surveyWrittenDate; // Date NOT NULL, -- 설문조사 작성일
	private String surveyStartDate; // Date NOT NULL, -- 설문조사 시작일
	private String surveyEndDate; // Date NOT NULL, -- 설문조사 종료일
	private int surveyTargetAlumni; // 설문조사 대상 기수
	private String surveyTargetClassroom; // 설문조사 대상 반
	private int surveyPageNum; //각 설문의 페이지 번호
	private int surveyQuestionNum; // 각 질문 번호
	private String surveyQuestionContent; // 각 질문 내용
	private String surveyQuestionType; // 각 질문 유형
	private int surveyQuestionRequired; // 각 질문 필수 응답 여부
	private int surveyOptionNum; // 각 질문 선택지의 번호
	private String surveyOptionContent; // 각 질문 선택지의 내용
	private int surveyRespondNum; // 설문에 대한 응답 번호
	private int surveyRespondOptionNum; // 설문 타입이 radio, checkbox, dropdown일 경우 응답한 선택지 번호
	private String surveyRespondContent; // 설문 타입이 singleinput, comment일 경우 응답 내용
	private int surveyRespondmemberNum; // 응답한 회원 번호
	private String surveyRespondDate; // 회원의 설문 응답 날짜
	private int alumni; // 설문 참여 대상 기수
	private int memberNum; // 설문 참여한 학생 회원번호
	private String classroom; // 설문 참여 대상 반
	public Survey(int surveyNum, String name, int teacherNum, int surveyCategory, String surveyTitle,
			String surveyWrittenDate, String surveyStartDate, String surveyEndDate, int surveyTargetAlumni,
			String surveyTargetClassroom, int surveyPageNum, int surveyQuestionNum, String surveyQuestionContent,
			String surveyQuestionType, int surveyQuestionRequired, int surveyOptionNum, String surveyOptionContent,
			int surveyRespondNum, int surveyRespondOptionNum, String surveyRespondContent, int surveyRespondmemberNum,
			String surveyRespondDate, int alumni, int memberNum, String classroom) {
		super();
		this.surveyNum = surveyNum;
		this.name = name;
		this.teacherNum = teacherNum;
		this.surveyCategory = surveyCategory;
		this.surveyTitle = surveyTitle;
		this.surveyWrittenDate = surveyWrittenDate;
		this.surveyStartDate = surveyStartDate;
		this.surveyEndDate = surveyEndDate;
		this.surveyTargetAlumni = surveyTargetAlumni;
		this.surveyTargetClassroom = surveyTargetClassroom;
		this.surveyPageNum = surveyPageNum;
		this.surveyQuestionNum = surveyQuestionNum;
		this.surveyQuestionContent = surveyQuestionContent;
		this.surveyQuestionType = surveyQuestionType;
		this.surveyQuestionRequired = surveyQuestionRequired;
		this.surveyOptionNum = surveyOptionNum;
		this.surveyOptionContent = surveyOptionContent;
		this.surveyRespondNum = surveyRespondNum;
		this.surveyRespondOptionNum = surveyRespondOptionNum;
		this.surveyRespondContent = surveyRespondContent;
		this.surveyRespondmemberNum = surveyRespondmemberNum;
		this.surveyRespondDate = surveyRespondDate;
		this.alumni = alumni;
		this.memberNum = memberNum;
		this.classroom = classroom;
	}
	public Survey() {
		super();
	}
	public int getSurveyNum() {
		return surveyNum;
	}
	public void setSurveyNum(int surveyNum) {
		this.surveyNum = surveyNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTeacherNum() {
		return teacherNum;
	}
	public void setTeacherNum(int teacherNum) {
		this.teacherNum = teacherNum;
	}
	public int getSurveyCategory() {
		return surveyCategory;
	}
	public void setSurveyCategory(int surveyCategory) {
		this.surveyCategory = surveyCategory;
	}
	public String getSurveyTitle() {
		return surveyTitle;
	}
	public void setSurveyTitle(String surveyTitle) {
		this.surveyTitle = surveyTitle;
	}
	public String getSurveyWrittenDate() {
		return surveyWrittenDate;
	}
	public void setSurveyWrittenDate(String surveyWrittenDate) {
		this.surveyWrittenDate = surveyWrittenDate;
	}
	public String getSurveyStartDate() {
		return surveyStartDate;
	}
	public void setSurveyStartDate(String surveyStartDate) {
		this.surveyStartDate = surveyStartDate;
	}
	public String getSurveyEndDate() {
		return surveyEndDate;
	}
	public void setSurveyEndDate(String surveyEndDate) {
		this.surveyEndDate = surveyEndDate;
	}
	public int getSurveyTargetAlumni() {
		return surveyTargetAlumni;
	}
	public void setSurveyTargetAlumni(int surveyTargetAlumni) {
		this.surveyTargetAlumni = surveyTargetAlumni;
	}
	public String getSurveyTargetClassroom() {
		return surveyTargetClassroom;
	}
	public void setSurveyTargetClassroom(String surveyTargetClassroom) {
		this.surveyTargetClassroom = surveyTargetClassroom;
	}
	public int getSurveyPageNum() {
		return surveyPageNum;
	}
	public void setSurveyPageNum(int surveyPageNum) {
		this.surveyPageNum = surveyPageNum;
	}
	public int getSurveyQuestionNum() {
		return surveyQuestionNum;
	}
	public void setSurveyQuestionNum(int surveyQuestionNum) {
		this.surveyQuestionNum = surveyQuestionNum;
	}
	public String getSurveyQuestionContent() {
		return surveyQuestionContent;
	}
	public void setSurveyQuestionContent(String surveyQuestionContent) {
		this.surveyQuestionContent = surveyQuestionContent;
	}
	public String getSurveyQuestionType() {
		return surveyQuestionType;
	}
	public void setSurveyQuestionType(String surveyQuestionType) {
		this.surveyQuestionType = surveyQuestionType;
	}
	public int getSurveyQuestionRequired() {
		return surveyQuestionRequired;
	}
	public void setSurveyQuestionRequired(int surveyQuestionRequired) {
		this.surveyQuestionRequired = surveyQuestionRequired;
	}
	public int getSurveyOptionNum() {
		return surveyOptionNum;
	}
	public void setSurveyOptionNum(int surveyOptionNum) {
		this.surveyOptionNum = surveyOptionNum;
	}
	public String getSurveyOptionContent() {
		return surveyOptionContent;
	}
	public void setSurveyOptionContent(String surveyOptionContent) {
		this.surveyOptionContent = surveyOptionContent;
	}
	public int getSurveyRespondNum() {
		return surveyRespondNum;
	}
	public void setSurveyRespondNum(int surveyRespondNum) {
		this.surveyRespondNum = surveyRespondNum;
	}
	public int getSurveyRespondOptionNum() {
		return surveyRespondOptionNum;
	}
	public void setSurveyRespondOptionNum(int surveyRespondOptionNum) {
		this.surveyRespondOptionNum = surveyRespondOptionNum;
	}
	public String getSurveyRespondContent() {
		return surveyRespondContent;
	}
	public void setSurveyRespondContent(String surveyRespondContent) {
		this.surveyRespondContent = surveyRespondContent;
	}
	public int getSurveyRespondmemberNum() {
		return surveyRespondmemberNum;
	}
	public void setSurveyRespondmemberNum(int surveyRespondmemberNum) {
		this.surveyRespondmemberNum = surveyRespondmemberNum;
	}
	public String getSurveyRespondDate() {
		return surveyRespondDate;
	}
	public void setSurveyRespondDate(String surveyRespondDate) {
		this.surveyRespondDate = surveyRespondDate;
	}
	public int getAlumni() {
		return alumni;
	}
	public void setAlumni(int alumni) {
		this.alumni = alumni;
	}
	public int getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(int memberNum) {
		this.memberNum = memberNum;
	}
	public String getClassroom() {
		return classroom;
	}
	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}
	@Override
	public String toString() {
		return "Survey [surveyNum=" + surveyNum + ", name=" + name + ", teacherNum=" + teacherNum + ", surveyCategory="
				+ surveyCategory + ", surveyTitle=" + surveyTitle + ", surveyWrittenDate=" + surveyWrittenDate
				+ ", surveyStartDate=" + surveyStartDate + ", surveyEndDate=" + surveyEndDate + ", surveyTargetAlumni="
				+ surveyTargetAlumni + ", surveyTargetClassroom=" + surveyTargetClassroom + ", surveyPageNum="
				+ surveyPageNum + ", surveyQuestionNum=" + surveyQuestionNum + ", surveyQuestionContent="
				+ surveyQuestionContent + ", surveyQuestionType=" + surveyQuestionType + ", surveyQuestionRequired="
				+ surveyQuestionRequired + ", surveyOptionNum=" + surveyOptionNum + ", surveyOptionContent="
				+ surveyOptionContent + ", surveyRespondNum=" + surveyRespondNum + ", surveyRespondOptionNum="
				+ surveyRespondOptionNum + ", surveyRespondContent=" + surveyRespondContent
				+ ", surveyRespondmemberNum=" + surveyRespondmemberNum + ", surveyRespondDate=" + surveyRespondDate
				+ ", alumni=" + alumni + ", memberNum=" + memberNum + ", classroom=" + classroom + "]";
	}
	
}