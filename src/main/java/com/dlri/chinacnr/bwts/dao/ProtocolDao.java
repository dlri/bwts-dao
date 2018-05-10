package com.dlri.chinacnr.bwts.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dlri.chinacnr.bwts.entity.Protocol;

public interface ProtocolDao {

	public List<Protocol> getAllList();
	
	public int createNewTable(@Param("newTableName") String newTableName,
            @Param("originalTableName") String originalTableName);
	
	public int createDynamicTable(@Param("tableName")String tableName,@Param("sql1")String sql);
	
	public int add(@Param("addSql")String addSql);
}
