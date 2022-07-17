package com.zxf.vhr.model;

/**
 * @ClassName: Meta
 * @Description: Meta
 * @author: 赵晓峰
 * @date: 2022/7/16 5:00 下午
 * @Blog: https://blog.csdn.net/Websphere_zxf
 */
public class Meta {
    private Boolean keepAlive;

    private Boolean requireAuth;

    public Boolean getKeepAlive() {
        return keepAlive;
    }

    public void setKeepAlive(Boolean keepAlive) {
        this.keepAlive = keepAlive;
    }

    public Boolean getRequireAuth() {
        return requireAuth;
    }

    public void setRequireAuth(Boolean requireAuth) {
        this.requireAuth = requireAuth;
    }
}
