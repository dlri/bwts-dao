package com.dlri.chinacnr.bwts.dao.impl;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dlri.chinacnr.bwts.dao.DetectionRecordDao;
import com.dlri.chinacnr.bwts.entity.DetectionRecord;
import com.dlri.chinacnr.bwts.utils.MybatisUtils;
 
public class DetectionRecordDaoImpl{
	MybatisUtils mybatisUtils = new MybatisUtils();
	SqlSession sqlSession = null;

	public DetectionRecord queryOneDetectionRecord(long id) {
		DetectionRecord  detectionRecord = null;
		try {
			sqlSession = mybatisUtils.getSqlSession();
			DetectionRecordDao detectionRecordDao = sqlSession.getMapper(DetectionRecordDao.class);
			detectionRecord = detectionRecordDao.queryOneDetectionRecord(id);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		return detectionRecord;
	}

	public int insertOneDetectionRecord(DetectionRecord detectionRecord) {
		int count=0;
		try {
			sqlSession=mybatisUtils.getSqlSession();
			DetectionRecordDao detectionRecordDao = sqlSession.getMapper(DetectionRecordDao.class);
			count = detectionRecordDao.insertOneDetectionRecord(detectionRecord);
			sqlSession.commit();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return count;
	}

	public DetectionRecord queryDetectionRecordWithDetails(long id) {
		DetectionRecord detectionRecord = null;
		try {
			sqlSession = mybatisUtils.getSqlSession();
			DetectionRecordDao detectionRecordDao = sqlSession.getMapper(DetectionRecordDao.class);
			detectionRecord = detectionRecordDao.queryDetectionRecordWithDetails(id);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		return detectionRecord;
	}
}
