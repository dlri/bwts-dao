package com.dlri.chinacnr.bwts.entity;

import java.util.List;

/**
 * 检测记录表
 * @author ChenChuang
 *
 */
public class DetectionRecord {
	private long id;//主键编号
	private String wheelId;//轮对编号
	private String repairRank;//修程级别
	private String aBearingNum;//A侧轴承编号
	private String bBearingNum;//B侧轴承编号
	private String detectionTime;//检测时间
	private int channelNum; //通道记录数
	private String tBedNum;//试验台编号
	private String workShop;//车间
	private String placement;//机位
	private String equipment;//设备
	private String checker;//检验员
	private String gearboxNum;//齿轮箱编号
	private String gearboxNog;//齿轮箱型号(G)
	private String gearboxNop;//齿轮箱型号(P)
	private String bearingNo;//轴承型号
	
	public int getChannelNum() {
		return channelNum;
	}
	public void setChannelNum(int channelNum) {
		this.channelNum = channelNum;
	}
	private String savePath;//存放路径
	private String pdfFile;//PDF文件
	private String bgmFile;//BGM文件
	private List<DetectionDetails>detailsList;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getWheelId() {
		return wheelId;
	}
	public void setWheelId(String wheelId) {
		this.wheelId = wheelId;
	}
	public String getRepairRank() {
		return repairRank;
	}
	public void setRepairRank(String repairRank) {
		this.repairRank = repairRank;
	}
	public String getaBearingNum() {
		return aBearingNum;
	}
	public void setaBearingNum(String aBearingNum) {
		this.aBearingNum = aBearingNum;
	}
	public String getbBearingNum() {
		return bBearingNum;
	}
	public void setbBearingNum(String bBearingNum) {
		this.bBearingNum = bBearingNum;
	}
	public String getDetectionTime() {
		return detectionTime;
	}
	public void setDetectionTime(String detectionTime) {
		this.detectionTime = detectionTime;
	}
	public String gettBedNum() {
		return tBedNum;
	}
	public void settBedNum(String tBedNum) {
		this.tBedNum = tBedNum;
	}
	public String getSavePath() {
		return savePath;
	}
	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}
	public String getPdfFile() {
		return pdfFile;
	}
	public void setPdfFile(String pdfFile) {
		this.pdfFile = pdfFile;
	}
	public String getBgmFile() {
		return bgmFile;
	}
	public void setBgmFile(String bgmFile) {
		this.bgmFile = bgmFile;
	}
	
	public List<DetectionDetails> getDetailsList() {
		return detailsList;
	}
	public void setDetailsList(List<DetectionDetails> detailsList) {
		this.detailsList = detailsList;
	}
	
	public String getWorkShop() {
		return workShop;
	}
	public void setWorkShop(String workShop) {
		this.workShop = workShop;
	}
	public String getPlacement() {
		return placement;
	}
	public void setPlacement(String placement) {
		this.placement = placement;
	}
	public String getEquipment() {
		return equipment;
	}
	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}
	public String getChecker() {
		return checker;
	}
	public void setChecker(String checker) {
		this.checker = checker;
	}
	public String getGearboxNum() {
		return gearboxNum;
	}
	public void setGearboxNum(String gearboxNum) {
		this.gearboxNum = gearboxNum;
	}
	
	public String getGearboxNog() {
		return gearboxNog;
	}
	public void setGearboxNog(String gearboxNog) {
		this.gearboxNog = gearboxNog;
	}
	public String getGearboxNop() {
		return gearboxNop;
	}
	public void setGearboxNop(String gearboxNop) {
		this.gearboxNop = gearboxNop;
	}
	public String getBearingNo() {
		return bearingNo;
	}
	public void setBearingNo(String bearingNo) {
		this.bearingNo = bearingNo;
	}
	@Override
	public String toString() {
		return "DetectionRecord [id=" + id + ", wheelId=" + wheelId + ", repairRank=" + repairRank + ", aBearingNum="
				+ aBearingNum + ", bBearingNum=" + bBearingNum + ", detectionTime=" + detectionTime + ", tBedType="
				+ channelNum + ", tBedNum=" + tBedNum + ", savePath=" + savePath + ", pdfFile=" + pdfFile + ", bgmFile="
				+ bgmFile + "]";
	}

}
