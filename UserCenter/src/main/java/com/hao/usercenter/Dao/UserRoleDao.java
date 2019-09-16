//package com.hao.usercenter.Dao;
//
//import com.hao.commonmodel.user.SysRole;
//import org.apache.ibatis.annotations.Insert;
//import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Param;
//import org.apache.ibatis.annotations.Select;
//
//import java.util.Set;
//
///**
// * 用户角色关系
// * 用户和角色是多对多关系，sys_role_user是中间表
// * @author MuggleLee
// * @date 2019/7/22
// */
//@Mapper
//public interface UserRoleDao {
//    int deleteUserRole(@Param("userId") Long userId, @Param("roleId") Long roleId);
//
//    @Insert("insert into sys_role_user(userId, roleId) values(#{userId}, #{roleId})")
//    int saveUserRoles(@Param("userId") Long userId, @Param("roleId") Long roleId);
//
//    /**
//     * 根据用户id获取角色
//     *
//     * @param userId
//     * @return
//     */
//    @Select("select r.* from sys_role_user ru inner join sys_role r on r.id = ru.roleId where ru.userId = #{userId}")
//    Set<SysRole> findRolesByUserId(Long userId);
//}
