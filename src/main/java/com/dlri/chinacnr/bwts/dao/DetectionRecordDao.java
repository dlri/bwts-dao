package com.dlri.chinacnr.bwts.dao;

import java.util.List;
import java.util.Map;

import com.dlri.chinacnr.bwts.entity.DetectionRecord;
import com.dlri.chinacnr.bwts.entity.RecordTotal;

public interface DetectionRecordDao {
	
	public DetectionRecord queryOneDetectionRecord(long id);
	
	public DetectionRecord queryDetectionRecordWithDetails(long id);
	
	public int insertOneDetectionRecord(DetectionRecord detectionRecord);
	
	public List<DetectionRecord> queryDetectionRecordByCondition(Map<String,Object> map);
	
	public RecordTotal queryDetectionRecordTotal(Map<String,Object> map);
	
	public int insertCallProcedureRecord(Map<String,Object> map);
	
	public List<DetectionRecord> queryRecordByLastTime();
	
	
}
