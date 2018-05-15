package com.dlri.chinacnr.bwts.dao.impl;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dlri.chinacnr.bwts.dao.DetectionDetailsDao;
import com.dlri.chinacnr.bwts.entity.DetectionDetails;
import com.dlri.chinacnr.bwts.utils.MybatisUtils;

public class DetectionDetailsDaoImpl{
	MybatisUtils mybatisUtils = new MybatisUtils();
	SqlSession sqlSession = null;
	public DetectionDetails queryOneDetectionDetails(long id) {
		DetectionDetails detectionDetails = null;
		try {
			sqlSession = mybatisUtils.getSqlSession();
			DetectionDetailsDao detectionDetailsDao = sqlSession.getMapper(DetectionDetailsDao.class);
			detectionDetails = detectionDetailsDao.queryOneDetectionDetails(id);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
		return detectionDetails;
	}

	public int insertOneDetectionDetails(DetectionDetails detectionDetails) {
		try {
			sqlSession = mybatisUtils.getSqlSession();
			DetectionDetailsDao detectionDetailsDao = sqlSession.getMapper(DetectionDetailsDao.class);
			detectionDetailsDao.insertOneDetectionDetails(detectionDetails);
			sqlSession.commit();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
		return 1;
	}

	public int insertBatchDetectionDetails(List<DetectionDetails> list) {
		try {
			sqlSession = mybatisUtils.getSqlSession();
			DetectionDetailsDao detectionDetailsDao = sqlSession.getMapper(DetectionDetailsDao.class);
			detectionDetailsDao.insertBatchDetectionDetails(list);
			sqlSession.commit();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
		return 1;
	}

}
