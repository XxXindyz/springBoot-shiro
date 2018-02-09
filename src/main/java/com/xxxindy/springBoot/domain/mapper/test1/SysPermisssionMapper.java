package com.xxxindy.springBoot.domain.mapper.test1;

import com.xxxindy.springBoot.domain.user.entity.SysPermission;
import com.xxxindy.springBoot.domain.user.entity.SysRole;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: xxxindy
 * @Date:2018/2/9 上午9:35
 * @Description:
 */
public interface SysPermisssionMapper {

    @Select("SELECT permission_id FROM sys_role_permission WHERE role_id = #{roleId}")
    List<Integer> getPermissionIdByRoleid(Integer roleId);

    @Select("<script>"
            + "SELECT * FROM sys_permission WHERE id IN "
            + "<foreach item='permissionId'  collection='permissionIds' open='(' separator=',' close=')'>"
            + "#{permissionId}"
            + "</foreach>"
            + "</script>")
    @Results({
            @Result(property = "id",  column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "resourceType", column = "resource_type"),
            @Result(property = "url", column = "url"),
            @Result(property = "permission", column = "permission"),
            @Result(property = "parentId", column = "parent_id"),
            @Result(property = "available", column = "available"),
            @Result(property = "parentIds", column = "parent_ids"),
    })
    List<SysPermission> getPermissionsByPermissionIds(@Param(value = "permissionIds") List<Integer> permissionIds);
}
