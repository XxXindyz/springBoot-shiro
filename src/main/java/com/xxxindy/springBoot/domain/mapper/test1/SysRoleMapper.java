package com.xxxindy.springBoot.domain.mapper.test1;

import com.xxxindy.springBoot.domain.user.entity.SysRole;
import com.xxxindy.springBoot.domain.user.entity.User;
import com.xxxindy.springBoot.domain.user.entity.UserSexEnum;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: xxxindy
 * @Date:2018/2/8 上午10:16
 * @Description:
 */
public interface SysRoleMapper {

    @Select("SELECT role_id FROM sys_user_role WHERE uid = #{id}")
    List<Integer> getRoleIdByUid(Integer uid);

    @Select("<script>"
            + "SELECT * FROM sys_role WHERE id IN "
            + "<foreach item='roleId'  collection='roleIds' open='(' separator=',' close=')'>"
            + "#{roleId}"
            + "</foreach>"
            + "</script>")
    @Results({
            @Result(property = "id",  column = "id"),
            @Result(property = "role", column = "role"),
            @Result(property = "description", column = "description"),
            @Result(property = "available", column = "available")
    })
    List<SysRole> getSysRolesByRoleIds(@Param(value = "roleIds") List<Integer> roleIds);
}
