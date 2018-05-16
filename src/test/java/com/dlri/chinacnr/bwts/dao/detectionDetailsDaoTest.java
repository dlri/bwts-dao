package com.dlri.chinacnr.bwts.dao;

import java.util.Arrays;

import org.junit.Test;

import com.dlri.chinacnr.bwts.dao.impl.DetectionDetailsDaoImpl;
import com.dlri.chinacnr.bwts.entity.DetectionDetails;

public class detectionDetailsDaoTest {
	
	@Test
	public void testInsertOneDetectionDetails() {
		DetectionDetails detectionDetails = new DetectionDetails();
		detectionDetails.setChannelName("IN0:A1");
		detectionDetails.setValidValue((float) 35.28);
		detectionDetails.setPeakValue((float)50.55);
		detectionDetails.setVibrationSeverity((float)0.41);
		detectionDetails.setVibrationEnergy((float)0.00);
		detectionDetails.setPeakNum(0);
		detectionDetails.setRippleFactor((float)4.00);
		detectionDetails.setEvaluation("合格");
		detectionDetails.setNonQualified("");
		detectionDetails.setfDrid(11);

		DetectionDetailsDaoImpl dao = new DetectionDetailsDaoImpl();
		dao.insertOneDetectionDetails(detectionDetails);
	}
	
	@Test
	public void testInsertBatchDetectionDetails() {
		DetectionDetails detectionDetails1 = new DetectionDetails();
		detectionDetails1.setChannelName("IN0:A1");
		detectionDetails1.setValidValue((float) 35.28);
		detectionDetails1.setPeakValue((float)50.55);
		detectionDetails1.setVibrationSeverity((float)0.41);
		detectionDetails1.setVibrationEnergy((float)0.00);
		detectionDetails1.setPeakNum(0);
		detectionDetails1.setRippleFactor((float)4.00);
		detectionDetails1.setEvaluation("合格");
		detectionDetails1.setNonQualified("");
		detectionDetails1.setfDrid(10);
		
		DetectionDetails detectionDetails2 = new DetectionDetails();
		detectionDetails2.setChannelName("IN0:A2");
		detectionDetails2.setValidValue((float) 32.53);
		detectionDetails2.setPeakValue((float)50.47);
		detectionDetails2.setVibrationSeverity((float)0.43);
		detectionDetails2.setVibrationEnergy((float)0.00);
		detectionDetails2.setPeakNum(0);
		detectionDetails2.setRippleFactor((float)4.00);
		detectionDetails2.setEvaluation("合格");
		detectionDetails2.setNonQualified("");
		detectionDetails2.setfDrid(10);
		
		DetectionDetails detectionDetails3 = new DetectionDetails();
		detectionDetails3.setChannelName("IN0:B1");
		detectionDetails3.setValidValue((float) 40.04);
		detectionDetails3.setPeakValue((float)53.62);
		detectionDetails3.setVibrationSeverity((float)0.41);
		detectionDetails3.setVibrationEnergy((float)0.00);
		detectionDetails3.setPeakNum(0);
		detectionDetails3.setRippleFactor((float)4.00);
		detectionDetails3.setEvaluation("合格");
		detectionDetails3.setNonQualified("");
		detectionDetails3.setfDrid(10);

		DetectionDetailsDaoImpl dao = new DetectionDetailsDaoImpl();
		dao.insertBatchDetectionDetails(Arrays.asList(detectionDetails1,detectionDetails2,detectionDetails3));
	}
	
	@Test
	public void testQueryOneDetectionDetails() {
		DetectionDetailsDaoImpl dao = new DetectionDetailsDaoImpl();
		DetectionDetails detectionDetails = dao.queryOneDetectionDetails(4);
		System.out.println(detectionDetails);
	}
}
