package com.cn.by.common;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.tags.PermissionTag;

public class ShiroPermissionTag extends PermissionTag {

    @Override
    protected boolean showTagBody(String s) {
        boolean hasAny = false;
        Subject subject = getSubject();
        if(subject != null){
            for (String  permission:s.split(",")){
                if(subject.isPermitted(permission.trim())){
                    hasAny = true;
                    break;
                }
            }
        }
        return false;
    }
}
