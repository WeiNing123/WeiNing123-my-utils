package com.wn.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("sys_menu")
@Data
public class SysMenu {
    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;
    //名称
    private String label;
    //排序
    private Integer orderBy;
    //父id
    private Integer parentId;
    //路径
    private String path;
    //图标
    private String icon;
}
