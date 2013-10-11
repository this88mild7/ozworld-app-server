package com.rnts.ozworld.dto;

public class CategoryDto {
	
    private int cateId;
    
    private String cateNm;
    
    private int cateLevel;
    
    private int orderingNo;

	public int getCateId() {
		return cateId;
	}

	public void setCateId(int cateId) {
		this.cateId = cateId;
	}

	public String getCateNm() {
		return cateNm;
	}

	public void setCateNm(String cateNm) {
		this.cateNm = cateNm;
	}

	public int getCateLevel() {
		return cateLevel;
	}

	public void setCateLevel(int cateLevel) {
		this.cateLevel = cateLevel;
	}

	public int getOrderingNo() {
		return orderingNo;
	}

	public void setOrderingNo(int orderingNo) {
		this.orderingNo = orderingNo;
	}

	@Override
	public String toString() {
		return "CategoryDto [cateId=" + cateId + ", cateNm=" + cateNm
				+ ", cateLevel=" + cateLevel + ", orderingNo=" + orderingNo
				+ "]";
	}
    

}
