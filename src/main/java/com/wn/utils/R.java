package com.wn.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * 格式化返回数据
 * @author WeiNing
 * @since 2021-10-28
 */

public class R extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;

    public R() {
        this.put((String)"code", 200);
    }

    public static R error() {
        return error(500, "系统发生错误，请重试或联系管理员解决！");
    }

    public static R error(String msg) {
        return error(500, msg);
    }

    public static R error(int code, String msg) {
        R r = new R();
        r.put((String)"code", code);
        r.put((String)"msg", msg);
        return r;
    }

    public static R ok(String msg) {
        R r = new R();
        r.put((String)"msg", msg);
        return r;
    }

    public static R ok(Map<String, Object> map) {
        R r = new R();
        r.putAll(map);
        return r;
    }

    public static R ok() {
        return new R();
    }

    public R put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
