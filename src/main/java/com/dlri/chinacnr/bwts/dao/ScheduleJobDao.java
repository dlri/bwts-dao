package com.dlri.chinacnr.bwts.dao;

import java.util.List;
import java.util.Map;

import com.dlri.chinacnr.bwts.entity.ScheduleJob;

public interface ScheduleJobDao {
	
	public List<ScheduleJob> queryScheduleJobByCondition(Map<String,Object> map);
	
	public void updateScheduleJob(ScheduleJob job);
	
}
