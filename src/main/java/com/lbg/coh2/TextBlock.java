package com.lbg.coh2;

public class TextBlock {
	private int blockNo;
	private String data;
	
	public TextBlock(int blockNo,String data){
		this.blockNo=blockNo;
		this.data=data;
	}
	
	
	public int getBlockNo() {
		return blockNo;
	}
	public void setBlockNo(int blockNo) {
		this.blockNo = blockNo;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return getBlockNo() + ":" +getData();
	}
	
	
	

}
