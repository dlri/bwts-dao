package com.dlri.chinacnr.bwts.dao;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.dlri.chinacnr.bwts.dao.impl.DetectionRecordDaoImpl;
import com.dlri.chinacnr.bwts.entity.DetectionRecord;
import com.dlri.chinacnr.bwts.utils.MybatisUtils;

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
		int num=detectionRecordDao.insertOneDetectionRecord(dr);
		
		System.out.println("sucesse"+num);
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
	
	@Test
	public void insertCallProcedureRecord() throws IOException {
		java.util.Date date = new java.util.Date();          // 获取一个Date对象
        Timestamp timeStamp = new Timestamp(date.getTime());     
		MybatisUtils mybatisUtils = new MybatisUtils();
		SqlSession openSession;
		openSession = mybatisUtils.getSqlSession();
		DetectionRecordDao mapper = openSession.getMapper(DetectionRecordDao.class);
		Map<String,Object>map=new HashMap<String,Object>();
		map.put("wheelId", "H63-2305");
		map.put("repairRank", "三级");
		map.put("aBearingNum", "5-15-5");
		map.put("bBearingNum", "5-15-1");
		map.put("detectionTime", timeStamp);
		map.put("tBedNum", "RUN001");
		map.put("savePath", "/2018/04/");
		map.put("pdfFile", "cc.pdf");
		map.put("bgmFile", "cc.bgm");
		map.put("detectionData", "IN0:A3,35.28,50.55,0.41,0.00,0.00,4.00,合格,无,IN0:A2,36.28,50.55,0.41,0.00,0.00,4.00,合格2,无,");
		
		int reslut = mapper.insertCallProcedureRecord(map);
		openSession.commit();
		System.out.println("插入返回值："+reslut);
		
		openSession.close();
	}

}
