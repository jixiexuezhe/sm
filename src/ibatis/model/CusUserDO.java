package ibatis.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户实体类DO
 * 
 * @author wangyongtao
 */
public class CusUserDO implements Serializable {
    /**
	 * 
	 */
    private static final long serialVersionUID = 5115908810207228969L;

    /**
     * column cus_user.id 主键
     */
    private Long              id;

    /**
     * column cus_user.gmt_create 创建时间
     */
    private Date              gmtCreate;

    /**
     * column cus_user.gmt_modified 修改时间
     */
    private Date              gmtModified;

    /**
     * column cus_user.creator 创建人
     */
    private String            creator;

    /**
     * column cus_user.modifier 修改人
     */
    private String            modifier;

    /**
     * column cus_user.is_deleted 是否删除 N：否 Y：是 默认否(N)
     */
    private String            isDeleted;

    /**
     * column cus_user.user_no 用户编号
     */
    private String            userNo;

    /**
     * column cus_user.user_name 用户姓名
     */
    private String            userName;

    /**
     * column cus_user.user_english_name 用户英文名
     */
    private String            userEnglishName;

    /**
     * column cus_user.user_type 用户类型
     */
    private Integer           userType;

    /**
     * column cus_user.login_name 用户登录名
     */
    private String            loginName;

    /**
     * column cus_user.password 用户密码
     */
    private String            password;

    /**
     * column cus_user.account_id 关联账户id
     */
    private Long              accountId;
    /***
     * 用户被查看的权限类型(如一般用户、高管等等)
     */
    private String            permissionType;

    /**
     * 账号是否被禁用，当前只支持系统用户cus_sys_user
     * 
     * @author Azen.Yao
     */
    private String            isForbidden;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEnglishName() {
        return userEnglishName;
    }

    public void setUserEnglishName(String userEnglishName) {
        this.userEnglishName = userEnglishName;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(String permissionType) {
        this.permissionType = permissionType;
    }

    public String getIsForbidden() {
        return isForbidden;
    }

    public void setIsForbidden(String isForbidden) {
        this.isForbidden = isForbidden;
    }

    @Override
    public String toString() {
        return "CusUserDO [id=" + id + ", gmtCreate=" + gmtCreate + ", gmtModified=" + gmtModified + ", creator="
                + creator + ", modifier=" + modifier + ", isDeleted=" + isDeleted + ", userNo=" + userNo
                + ", userName=" + userName + ", userEnglishName=" + userEnglishName + ", userType=" + userType
                + ", loginName=" + loginName + ", password=" + password + ", accountId=" + accountId
                + ", permissionType=" + permissionType + ", isForbidden=" + isForbidden + "]";
    }

}
