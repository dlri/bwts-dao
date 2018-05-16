package com.dlri.chinacnr.bwts.dao;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import java.io.InputStream;
import com.dlri.chinacnr.bwts.dao.impl.DetectionRecordDaoImpl;
import com.dlri.chinacnr.bwts.entity.DetectionRecord;
import com.dlri.chinacnr.bwts.utils.MybatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DetectionRecordDaoTest {

	@Test
	public void testInsertOneDetectionRecord() {
		DetectionRecordDaoImpl detectionRecordDao = new DetectionRecordDaoImpl();
		DetectionRecord dr = new DetectionRecord();
		dr.setWheelId("H63-2304");
		dr.setRepairRank("三级");
		dr.setaBearingNum("5-15-3");
		dr.setbBearingNum("5-15-1");
		dr.setDetectionTime("20180303094041");
		dr.settBedType("跑合台");
		dr.settBedNum("RUN001");
		dr.setSavePath("D://test");
		dr.setPdfFile("cc.pdf");
		dr.setBgmFile("cc.bgm");
		detectionRecordDao.insertOneDetectionRecord(dr);
		System.out.println("sucesse");
	}

	@Test
	public void testQueryOneDetectionRecord() {
		DetectionRecordDaoImpl detectionRecordDao = new DetectionRecordDaoImpl();
		DetectionRecord detectionRecord = new DetectionRecord();

		detectionRecord = detectionRecordDao.queryOneDetectionRecord(12);
		System.out.println(detectionRecord.toString());
	}

	@Test
	public void testqueryDetectionRecordWithDetails() throws IOException {
		MybatisUtils mybatisUtils = new MybatisUtils();
		SqlSession openSession;
		openSession = mybatisUtils.getSqlSession();
		DetectionRecordDao mapper = openSession.getMapper(DetectionRecordDao.class);
		DetectionRecord detectionRecord = mapper.queryDetectionRecordWithDetails(10);
		System.out.println(detectionRecord);
		System.out.println(detectionRecord.getDetailsList());
		openSession.close();
	}

}
