package com.tv;

public class TVCR extends Tv implements IVCR {
	public static void main(String[] args) {
		TVCR tv = new TVCR();
		tv.play();
		tv.stop();
		tv.channelUp();
//		tv.channelDown();
		System.out.println(tv.channel);
		
	}
	VCR vcr = new VCR();
	
	public void play() {
		vcr.play();
	}
	public void stop() {
		vcr.stop();
	}
	public void reset() {
		vcr.reset();
	}
	public int getCounter() {
		return vcr.getCounter();
	}
	public void setCounter(int c) {
		vcr.setCounter(c);
	}

}
