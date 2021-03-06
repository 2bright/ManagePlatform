package com.hao.usercenter.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hao.commonmodel.log.LogAnnotation;
import com.hao.commonmodel.user.SysPermission;
import com.hao.commonmodel.common.Page;
import com.hao.usercenter.service.SysPermissionService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class SysPermissionController {

    @Autowired
    private SysPermissionService sysPermissionService;

    /**
     * 管理后台添加权限
     *
     * @param sysPermission
     * @return
     */
    @LogAnnotation(module = "添加权限")
    @PreAuthorize("hasAuthority('back:permission:save')")
    @PostMapping("/permissions")
    public SysPermission save(@RequestBody SysPermission sysPermission) throws IllegalAccessException {
        if (StringUtils.isBlank(sysPermission.getPermission())) {
            throw new IllegalArgumentException("权限标识不能为空");
        }
        if (StringUtils.isBlank(sysPermission.getName())) {
            throw new IllegalArgumentException("权限名不能为空");
        }

        sysPermissionService.save(sysPermission);

        return sysPermission;
    }

    /**
     * 管理后台修改权限
     *
     * @param sysPermission
     */
    @LogAnnotation(module = "修改权限")
    @PreAuthorize("hasAuthority('back:permission:update')")
    @PutMapping("/permissions")
    public SysPermission update(@RequestBody SysPermission sysPermission) {
        if (StringUtils.isBlank(sysPermission.getName())) {
            throw new IllegalArgumentException("权限名不能为空");
        }

        sysPermissionService.update(sysPermission);

        return sysPermission;
    }

    /**
     * 删除权限标识
     *
     * @param id
     */
    @LogAnnotation(module = "删除权限")
    @PreAuthorize("hasAuthority('back:permission:delete')")
    @DeleteMapping("/permissions/{id}")
    public void delete(@PathVariable Long id) {
        sysPermissionService.delete(id);
    }

    /**
     * 查询所有的权限标识
     */
    @PreAuthorize("hasAuthority('back:permission:query')")
    @GetMapping("/permissions")
    public IPage<SysPermission> findPermissions(@RequestParam Map<String, Object> params) {
        return sysPermissionService.findPermissions(params);
    }
}
