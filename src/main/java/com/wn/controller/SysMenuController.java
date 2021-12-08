package com.wn.controller;

import com.wn.model.SysMenu;
import com.wn.service.ISysMenuService;
import com.wn.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sysMenu")
public class SysMenuController {

    @Autowired
    private ISysMenuService sysMenuService;

    @PostMapping("/modify")
    public R modify(@RequestBody SysMenu sysMenu) {
        SysMenu result = sysMenuService.getById(sysMenu.getId());
        return R.ok().put("data", result);
    }
}
