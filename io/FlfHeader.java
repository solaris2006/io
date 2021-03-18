package io;

public class FlfHeader {

	private char hardBlank;
	private int height;
	private int maxLength;
	private int commentLines;
	
	public char getHardBlank() {
		return hardBlank;
	}
	public void setHardBlank(char hardBlank) {
		this.hardBlank = hardBlank;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getMaxLength() {
		return maxLength;
	}
	public void setMaxLength(int maxLength) {
		this.maxLength = maxLength;
	}
	public int getCommentLines() {
		return commentLines;
	}
	public void setCommentLines(int commentLines) {
		this.commentLines = commentLines;
	}
	
	@Override
	public String toString() {
		return "FlfHeader [hardBlank=" + hardBlank + ", height=" + height + ", maxLength=" + maxLength
				+ ", commentLines=" + commentLines + "]";
	}
	
	
}
