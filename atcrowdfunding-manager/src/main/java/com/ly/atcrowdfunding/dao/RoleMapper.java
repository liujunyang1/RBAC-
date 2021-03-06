package com.ly.atcrowdfunding.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

import com.ly.atcrowdfunding.entity.Role;

public interface RoleMapper {

	List<Role> pageQueryData(Map<String, Object> map);

	int pageQueryCount(Map<String, Object> map);

	@Select("select * from t_role")
	List<Role> queryAll();

	void insertRolePermission(Map<String, Object> paramMap);

	void deleteRolePermissions(Map<String, Object> paramMap);

}
