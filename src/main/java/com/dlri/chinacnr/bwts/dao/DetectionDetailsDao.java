package com.dlri.chinacnr.bwts.dao;

import java.util.List;
import java.util.Map;

import com.dlri.chinacnr.bwts.entity.DetectionDetails;

public interface DetectionDetailsDao {
	
	public DetectionDetails queryOneDetectionDetails(long id);
	
	public int insertOneDetectionDetails(DetectionDetails detectionDetails);
	
	public int insertBatchDetectionDetails(List<DetectionDetails> list);
	
	public List<DetectionDetails> queryDetectionRecordByCondition(Map<String,Object> map);
	
}
