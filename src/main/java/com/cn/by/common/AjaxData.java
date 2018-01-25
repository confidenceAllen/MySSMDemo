package com.cn.by.common;

import java.io.Serializable;
import java.util.Map;

/**
 * @author Confidence
 * Ajax 返回实体类
 */
public class AjaxData implements Serializable{

    /**
     * 返回信息
     */
    private String msg;
    /**
     * 返回值: true or false 回调
     */
    private boolean judge = true;

    /**
     * 返回的数据
     */
    private Map<String,Object> data;


    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public boolean isJudge() {
        return judge;
    }

    public void setJudge(boolean judge) {
        this.judge = judge;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
