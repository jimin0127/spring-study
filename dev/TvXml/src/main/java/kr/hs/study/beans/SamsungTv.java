package kr.hs.study.beans;

public class SamsungTv implements Tv {
	private int price;
	SamSpeaker speaker;
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public SamSpeaker getSpeaker() {
		return speaker;
	}
	public void setSpeaker(SamSpeaker speaker) {
		this.speaker = speaker;
	}
	public void PowerOn() {
		// TODO Auto-generated method stub
		System.out.println("Samsung On");
	}
	public void PowerOff() {
		// TODO Auto-generated method stub
		System.out.println("Samsung Off");
	}
	
}
