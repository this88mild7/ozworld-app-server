package com.rnts.ozworld.common;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rnts.ozworld.dto.CategoryDto;

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
	
//	public String generateMapList(String jsonParentName, List<Map> map){
//		JSONObject json = new JSONObject();
//		
//		if (map != null) {
//			setSucessCode(json);
//			JSONArray result = new JSONArray();
//			for(Map parameter : map){
//				result.add(parameter);
//			}
//			json.put(jsonParentName, result);
//		}else{
//			setFailCode(json);
//		}
//		
//		return json.toJSONString();
//	}
//	
//	public String generateMap(String jsonParentName, Map map){
//		JSONObject json = new JSONObject();
//		
//		if (map != null) {
//			setSucessCode(json);
//			json.put(jsonParentName, map);
//		}else{
//			setFailCode(json);
//		}
//		return json.toJSONString();
//	}
//	
//	public String generateOk(){
//		JSONObject json = new JSONObject();
//		setSucessCode(json);
//		return json.toJSONString();
//	}
//	
////	"{\"status\":\"200\",\"data\":{\"test\":{\"name\":\"test\",\"type\":\"item\"}}}";
//	public String generateCateListForTree(List<Map> cateList) {
//		JSONObject json = new JSONObject();
//		if (cateList != null) {
//			setSucessCode(json);
//			Map cateMap = new LinkedHashMap();
//			for(Map parameter : cateList){
//				cateMap.put("cate_"+parameter.get("CATE_ID"), parameter);
//			}
//			json.put("data", cateMap);
//		}else{
//			setFailCode(json);
//		}
//		return json.toJSONString();
//	}
//	
//	public String generateSeriesListForTree(List<Map> cateList) {
//		JSONObject json = new JSONObject();
//		if (cateList != null) {
//			setSucessCode(json);
//			Map cateMap = new LinkedHashMap();
//			for(Map parameter : cateList){
//				cateMap.put("series_"+parameter.get("CONTENTS_SERIES_ID"), parameter);
//			}
//			json.put("data", cateMap);
//		}else{
//			setFailCode(json);
//		}
//		return json.toJSONString();
//	}
	
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
