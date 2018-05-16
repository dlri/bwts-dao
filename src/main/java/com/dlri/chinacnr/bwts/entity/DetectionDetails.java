package com.dlri.chinacnr.bwts.entity;

public class DetectionDetails {
	private long id;//主键编号
	private String channelName;//测点名
	private Float validValue;//有效值
	private Float peakValue;//峰值
	private Float vibrationSeverity;//振动烈度
	private Float vibrationEnergy;//振动能量
	private int peakNum;//峰值个数
	private Float rippleFactor;//纹波系数
	private String evaluation;//评价
	private String nonQualified;//不合格项
	private long fDrid;//检测记录外键
	
	private DetectionRecord detectionRecord;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public Float getValidValue() {
		return validValue;
	}
	public void setValidValue(Float validValue) {
		this.validValue = validValue;
	}
	public Float getPeakValue() {
		return peakValue;
	}
	public void setPeakValue(Float peakValue) {
		this.peakValue = peakValue;
	}
	public Float getVibrationSeverity() {
		return vibrationSeverity;
	}
	public void setVibrationSeverity(Float vibrationSeverity) {
		this.vibrationSeverity = vibrationSeverity;
	}
	public Float getVibrationEnergy() {
		return vibrationEnergy;
	}
	public void setVibrationEnergy(Float vibrationEnergy) {
		this.vibrationEnergy = vibrationEnergy;
	}
	public int getPeakNum() {
		return peakNum;
	}
	public void setPeakNum(int peakNum) {
		this.peakNum = peakNum;
	}
	public Float getRippleFactor() {
		return rippleFactor;
	}
	public void setRippleFactor(Float rippleFactor) {
		this.rippleFactor = rippleFactor;
	}
	public String getEvaluation() {
		return evaluation;
	}
	public void setEvaluation(String evaluation) {
		this.evaluation = evaluation;
	}
	public String getNonQualified() {
		return nonQualified;
	}
	public void setNonQualified(String nonQualified) {
		this.nonQualified = nonQualified;
	}
	public long getfDrid() {
		return fDrid;
	}
	public void setfDrid(long fDrid) {
		this.fDrid = fDrid;
	}
	public DetectionRecord getDetectionRecord() {
		return detectionRecord;
	}
	public void setDetectionRecord(DetectionRecord detectionRecord) {
		this.detectionRecord = detectionRecord;
	}
	@Override
	public String toString() {
		return "DetectionDetails [id=" + id + ", channelName=" + channelName + ", validValue=" + validValue
				+ ", peakValue=" + peakValue + ", vibrationSeverity=" + vibrationSeverity + ", vibrationEnergy="
				+ vibrationEnergy + ", peakNum=" + peakNum + ", rippleFactor=" + rippleFactor + ", evaluation="
				+ evaluation + ", nonQualified=" + nonQualified + ", fDrid=" + fDrid +"]";
	}
	
}
