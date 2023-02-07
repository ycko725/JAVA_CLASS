package Ex04.Ex04_Board;

import java.util.Date;

public class Board {
	private int boardNo;
	private String title;
	private String content;
	private String writer;
	private Date regDate;
	private Date upDate;
	
	//생성자
	public Board() {
		
		
	}
	
	
	
	
	public Board(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regDate = new Date();
		this.upDate = new Date();
	}
	//getter, setter
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Date getUpDate() {
		return upDate;
	}
	public void setUpDate(Date upDate) {
		this.upDate = upDate;
	}
	//toString()



	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", title=" + title + ", content=" + content + ", writer=" + writer
				+ ", regDate=" + regDate + ", upDate=" + upDate + "]";
	}
	
	// : 객체를 출력할 때, 지정할 문자열 형식을 반환하는 메소드
	// 	Object(최상위클래스)에 정의되어 있으며, 이를 오버라이딜한다.
	
	
	
}
