public  Test{

package com.star.sms.business.accept2.checkRule;

import java.io.Serializable;

public class CheckedObject implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -5905232185466246135L;

    /**
     * 待检测对象ID
     */
    private Long checkedObjectId;

    /**
     * 待检测对象类型
     */
    private CheckedObjectType checkedObjectType;

    /**
     * 规则路径
     */
    private String rulePath;

    /**
     * 待检测对象名称
     * 
     * @return
     */
    private String checkedObjectName;

    public Long getCheckedObjectId() {
        return checkedObjectId;
    }

    public void setCheckedObjectId(Long checkedObjectId) {
        this.checkedObjectId = checkedObjectId;
    }
    public CheckedObjectType getCheckedObjectType() {
        return checkedObjectType;
    }
    public void setCheckedObjectType(CheckedObjectType checkedObjectType) {
        this.checkedObjectType = checkedObjectType;
    }
    public String getRulePath() {
        return rulePath;
    }
    public void setRulePath(String rulePath) {
        this.rulePath = rulePath;
    }

    public String getCheckedObjectName() {
        return checkedObjectName;
    }

    public void setCheckedObjectName(String checkedObjectName) {
        this.checkedObjectName = checkedObjectName;
    }

}


}
