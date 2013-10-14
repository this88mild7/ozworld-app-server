package com.rnts.ozworld.common;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;

import com.rnts.ozworld.dto.CategoryDto;
import com.rnts.ozworld.dto.ContentsDto;

@Service
public class JsonResponseMaker {
	
	private final String STATUS = "code";
	private final int OK_STATUS = 200;
	private final int FAIL_STATUS = 500;
	private final int NOT_FOUND_STATUS = 404;
	
	private final String CATE_ID = "cateId";
	private final String CATE_NAEM = "cateNm";
	private final String CATE_LEVEL = "cateLevel";
	private final String ORDERING_NO = "orderingNo";
	
	private final String CONTENTS_ID="contentsId";
	private final String CONTENTS_NM = "contentsNm";
	private final String CONTENTS_DESC ="contentsDesc";
	private final String SRC_PATH = "srcPath";
	private final String IMG_PATH = "imgPath";
	private final String PREFIX_URL="prefixUrl";
	
	public String categoryListToJson(List<CategoryDto> cateList) {
		JSONObject json = new JSONObject();
		if(cateList != null){
			setSucessCode(json);
			JSONArray result = new JSONArray();
			for(CategoryDto  cate : cateList){
				JSONObject cateJson = new JSONObject();
				cateJson.put(CATE_ID, cate.getCateId());
				cateJson.put(CATE_NAEM, cate.getCateNm());
				cateJson.put(CATE_LEVEL, cate.getCateLevel());
				cateJson.put(ORDERING_NO, cate.getOrderingNo());
				result.add(cateJson);
			}
			json.put("data", result);
		}else{
			setNotFoundCode(json);
		}
		return json.toJSONString();
	}
	
	public String contentsListToJson(List<ContentsDto> contentsList) {
		JSONObject json = new JSONObject();
		if(contentsList != null){
			setSucessCode(json);
			JSONArray result = new JSONArray();
			for(ContentsDto  contents : contentsList){
				JSONObject contentsJson = new JSONObject();
				contentsJson.put(CONTENTS_ID, contents.getContentsId());
				contentsJson.put(CONTENTS_NM, contents.getContentsNm());
				contentsJson.put(CONTENTS_DESC, contents.getContentsDesc());
				contentsJson.put(SRC_PATH, contents.getSrcPath());
				contentsJson.put(IMG_PATH, contents.getImgPath());
				contentsJson.put(PREFIX_URL, contents.getPrefixUrl());
				result.add(contentsJson);
			}
			json.put("data", result);
		}else{
			setNotFoundCode(json);
		}
		return json.toJSONString();
	}
	
	
	private void setSucessCode(JSONObject result) {
		result.put(STATUS, OK_STATUS);
	}

	private void setFailCode(JSONObject result) {
		result.put(STATUS, FAIL_STATUS);
	}
	private void setNotFoundCode(JSONObject result) {
		result.put(STATUS, NOT_FOUND_STATUS);
	}



	

}
