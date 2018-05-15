package com.dlri.chinacnr.bwts.dao;

import org.junit.Test;

import com.dlri.chinacnr.bwts.dao.impl.DetectionRecordDaoImpl;
import com.dlri.chinacnr.bwts.entity.DetectionRecord;

public class DetectionRecordDaoTest {
	@Test
	public void testInsertOneDetectionRecord(){
		DetectionRecordDaoImpl detectionRecordDao=new DetectionRecordDaoImpl();
		DetectionRecord dr=new DetectionRecord();
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
	public void testQueryOneDetectionRecord(){
		DetectionRecordDaoImpl detectionRecordDao=new DetectionRecordDaoImpl();
		DetectionRecord detectionRecord=new DetectionRecord();
		
		detectionRecord=detectionRecordDao.queryOneDetectionRecord(11);
		System.out.println(detectionRecord.toString());
	}
	@Test
	public void testqueryDetectionRecordWithDetails() {
		DetectionRecordDaoImpl detectionRecordDao=new DetectionRecordDaoImpl();
		DetectionRecord detectionRecord = detectionRecordDao.queryDetectionRecordWithDetails(11);
		System.out.println("显示内容："+detectionRecord);
	}

}
