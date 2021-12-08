package com.wn.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wn.mapper.SysMenuMapper;
import com.wn.model.SysMenu;
import com.wn.service.ISysMenuService;
import org.springframework.stereotype.Service;

@Service
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenu> implements ISysMenuService {
}
