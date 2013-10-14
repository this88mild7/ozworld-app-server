package com.rnts.ozworld.dto;

public class ContentsDto {
	
	
	
	private int contentsId;
	
	private String contentsNm;
	
	private String contentsDesc;
	
	private String srcPath;
	
	private String imgPath;
	
	private String prefixUrl;

	public int getContentsId() {
		return contentsId;
	}

	public void setContentsId(int contentsId) {
		this.contentsId = contentsId;
	}

	public String getContentsNm() {
		return contentsNm;
	}

	public void setContentsNm(String contentsNm) {
		this.contentsNm = contentsNm;
	}

	public String getContentsDesc() {
		return contentsDesc;
	}

	public void setContentsDesc(String contentsDesc) {
		this.contentsDesc = contentsDesc;
	}

	public String getSrcPath() {
		return srcPath;
	}

	public void setSrcPath(String srcPath) {
		this.srcPath = srcPath;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public String getPrefixUrl() {
		return prefixUrl;
	}

	public void setPrefixUrl(String prefixUrl) {
		this.prefixUrl = prefixUrl;
	}

	@Override
	public String toString() {
		return "ContentsDto [contentsId=" + contentsId + ", contentsNm="
				+ contentsNm + ", contentsDesc=" + contentsDesc + ", srcPath="
				+ srcPath + ", imgPath=" + imgPath + ", prefixUrl=" + prefixUrl
				+ "]";
	}
	

}
