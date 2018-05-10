package com.dlri.chinacnr.bwts.entity;

/**
 * 初始数据协议类
 * @author chenchuang
 *
 */
public class Protocol {
	private int fid;//项点编号
	private String fdefines;//项点名称
	private String fposition;//项点位置
	private String ftype;//项点类型
	private String frange;//项点范围
	private String fremark;//项点备注
	private String fenable;//是否启用
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFdefines() {
		return fdefines;
	}
	public void setFdefines(String fdefines) {
		this.fdefines = fdefines;
	}
	public String getFposition() {
		return fposition;
	}
	public void setFposition(String fposition) {
		this.fposition = fposition;
	}
	public String getFtype() {
		return ftype;
	}
	public void setFtype(String ftype) {
		this.ftype = ftype;
	}
	public String getFrange() {
		return frange;
	}
	public void setFrange(String frange) {
		this.frange = frange;
	}
	public String getFremark() {
		return fremark;
	}
	public void setFremark(String fremark) {
		this.fremark = fremark;
	}
	public String getFenable() {
		return fenable;
	}
	public void setFenable(String fenable) {
		this.fenable = fenable;
	}
	@Override
	public String toString() {
		return "Protocol [fid=" + fid + ", fdefines=" + fdefines + ", fposition=" + fposition + ", ftype=" + ftype
				+ ", frange=" + frange + ", fremark=" + fremark + ", fenable=" + fenable + "]";
	}

}
