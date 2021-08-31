package kr.hs.study.beans;

public class LgTv implements Tv {
	private int price;
	AppleSpeaker speaker;
	
	

	public LgTv(int price, AppleSpeaker speaker) {
		this.price = price;
		this.speaker = speaker;
	}
	

	public AppleSpeaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(AppleSpeaker speaker) {
		this.speaker = speaker;
	}

	public void PowerOn() {
		// TODO Auto-generated method stub
		System.out.println("Lg On");
	}

	public void PowerOff() {
		// TODO Auto-generated method stub
		System.out.println("Lg Off");
	}

}
