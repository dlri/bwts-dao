package com.dlri.chinacnr.bwts.dao;

import java.util.List;
import java.util.Map;

import com.dlri.chinacnr.bwts.entity.DynRecord;

public interface DynRecordDao {

	public List<DynRecord> getAllList();
	
	public List<DynRecord> queryDynRecordDao(Map<String,Object> map);
	
	public long queryDynRecordTotalDao(Map<String,Object> map);
}
