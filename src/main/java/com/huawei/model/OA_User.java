package com.huawei.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OA_User {
	private List<OA_Task> oa_tasks=new ArrayList<OA_Task>();

	private Integer userId;

    private String userName;

    private String userPwd;

    private Integer userGender;

    private Date userBirth;

    private Integer userDeptid;

    private String userMobile;

    private Integer userRole;

    private Integer userStatus;

    private String userImgpath;

    private String userMz;

    private String userJg;

    private String userMarrige;

    private String userAddress;

    private String userXl;

    private String userSchool;

    private String userZy;

    private Date userJoinwork;

    private String userEmail;

    private Date userJoincompany;

    private String userPhone;

    private String userZzmm;

    private Date userJoinparty;

    private String userPartyplace;

    private String userGlxs;

    private Integer userInsurance;

    private String userInsurancetype;

    private String userHomeaddress;

    private String userLxr;

    private String userHomephone;
	
	public List<OA_Task> getOa_tasks() {
		return oa_tasks;
	}

	public void setOa_tasks(List<OA_Task> oa_tasks) {
		this.oa_tasks = oa_tasks;
	}

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public Integer getUserGender() {
        return userGender;
    }

    public void setUserGender(Integer userGender) {
        this.userGender = userGender;
    }

    public Date getUserBirth() {
        return userBirth;
    }

    public void setUserBirth(Date userBirth) {
        this.userBirth = userBirth;
    }

    public Integer getUserDeptid() {
        return userDeptid;
    }

    public void setUserDeptid(Integer userDeptid) {
        this.userDeptid = userDeptid;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }

    public Integer getUserRole() {
        return userRole;
    }

    public void setUserRole(Integer userRole) {
        this.userRole = userRole;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserImgpath() {
        return userImgpath;
    }

    public void setUserImgpath(String userImgpath) {
        this.userImgpath = userImgpath == null ? null : userImgpath.trim();
    }

    public String getUserMz() {
        return userMz;
    }

    public void setUserMz(String userMz) {
        this.userMz = userMz == null ? null : userMz.trim();
    }

    public String getUserJg() {
        return userJg;
    }

    public void setUserJg(String userJg) {
        this.userJg = userJg == null ? null : userJg.trim();
    }

    public String getUserMarrige() {
        return userMarrige;
    }

    public void setUserMarrige(String userMarrige) {
        this.userMarrige = userMarrige == null ? null : userMarrige.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public String getUserXl() {
        return userXl;
    }

    public void setUserXl(String userXl) {
        this.userXl = userXl == null ? null : userXl.trim();
    }

    public String getUserSchool() {
        return userSchool;
    }

    public void setUserSchool(String userSchool) {
        this.userSchool = userSchool == null ? null : userSchool.trim();
    }

    public String getUserZy() {
        return userZy;
    }

    public void setUserZy(String userZy) {
        this.userZy = userZy == null ? null : userZy.trim();
    }

    public Date getUserJoinwork() {
        return userJoinwork;
    }

    public void setUserJoinwork(Date userJoinwork) {
        this.userJoinwork = userJoinwork;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public Date getUserJoincompany() {
        return userJoincompany;
    }

    public void setUserJoincompany(Date userJoincompany) {
        this.userJoincompany = userJoincompany;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserZzmm() {
        return userZzmm;
    }

    public void setUserZzmm(String userZzmm) {
        this.userZzmm = userZzmm == null ? null : userZzmm.trim();
    }

    public Date getUserJoinparty() {
        return userJoinparty;
    }

    public void setUserJoinparty(Date userJoinparty) {
        this.userJoinparty = userJoinparty;
    }

    public String getUserPartyplace() {
        return userPartyplace;
    }

    public void setUserPartyplace(String userPartyplace) {
        this.userPartyplace = userPartyplace == null ? null : userPartyplace.trim();
    }

    public String getUserGlxs() {
        return userGlxs;
    }

    public void setUserGlxs(String userGlxs) {
        this.userGlxs = userGlxs == null ? null : userGlxs.trim();
    }

    public Integer getUserInsurance() {
        return userInsurance;
    }

    public void setUserInsurance(Integer userInsurance) {
        this.userInsurance = userInsurance;
    }

    public String getUserInsurancetype() {
        return userInsurancetype;
    }

    public void setUserInsurancetype(String userInsurancetype) {
        this.userInsurancetype = userInsurancetype == null ? null : userInsurancetype.trim();
    }

    public String getUserHomeaddress() {
        return userHomeaddress;
    }

    public void setUserHomeaddress(String userHomeaddress) {
        this.userHomeaddress = userHomeaddress == null ? null : userHomeaddress.trim();
    }

    public String getUserLxr() {
        return userLxr;
    }

    public void setUserLxr(String userLxr) {
        this.userLxr = userLxr == null ? null : userLxr.trim();
    }

    public String getUserHomephone() {
        return userHomephone;
    }

    public void setUserHomephone(String userHomephone) {
        this.userHomephone = userHomephone == null ? null : userHomephone.trim();
    }
}