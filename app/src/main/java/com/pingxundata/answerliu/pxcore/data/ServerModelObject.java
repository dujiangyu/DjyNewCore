package com.pingxundata.answerliu.pxcore.data;


import java.math.BigDecimal;

/**
 * Created by Administrator on 2017/8/29.
 */

public class    ServerModelObject {

    private int id;
    private int userId;
    private String name;
    private String certNo;
    private String city;
    private String address;
    private String sex;
    private String birthday;
    private String age;
    private String domicilePlace;
    private String education;
    private String socialIdentity;
    private int income;
    private boolean isSocial;
    private boolean isFund;
    private boolean isCreditCard;
    private boolean isHouseOrCarLoan;
    private int wechatAmount;
    private int sesameCredit;


    private String img;
    private String detailImg;
    private String productType;
    private Object productSubType;
    private String serviceType;

    private String rateMemo;
    private String periodType;
    private String periodTypeStr;
    private int startPeriod;
    private int endPeriod;

    private String loanDay;
    private String applyFlow;
    private String applyCondition;
    private String applyMaterial;
    private String productDesc;
    private String sourceType;
    private String channel;
    private String url;
    private int showOrder;
    private int viewNum;
    private int clickNum;
    private String startDate;
    private Object endDate;
    private String onlineDate;
    private boolean isValid;
    private boolean androidFlag;
    private boolean appleFlag;
    private boolean wechatFlag;
    private String productFlag;
    private String belongApp;
    private int showOrderJds;
    private int showOrderXsd;
    private int showOrderJqw;
    private int showOrderDkqb;
    private int showOrderDsqb;
    private int showOrderLsqd;
    private int showOrderLyb;
    private int showOrderPxqb;
    private int isRecommend;
    private String productLabel;
    private String backendLoginUrl;
    private String loginUser;
    private String loginPwd;
    private String cooperationModel;
    private String unitPrice;
    private boolean isDownloadApp;

    private String title;
    private String content;
    private String sendDate;


    private String cmsImg;
    private int serviceUserNum;
    private double loanTotalAmount;
    private double successRate;
    private double startAmount;
    private double endAmount;
    private int startPeriodDay;
    private int endPeriodDay;
    private int startPeriodMonth;
    private int endPeriodMonth;
    private double loanRate;
    private int recommendFlag;
    private String suspendFlag;
    private BigDecimal serviceRate;

    public BigDecimal getServiceRate() {
        return serviceRate;
    }

    public void setServiceRate(BigDecimal serviceRate) {
        this.serviceRate = serviceRate;
    }

    public String getSuspendFlag() {
        return suspendFlag;
    }

    public void setSuspendFlag(String suspendFlag) {
        this.suspendFlag = suspendFlag;
    }


    public int getRecommendFlag() {
        return recommendFlag;
    }

    public void setRecommendFlag(int recommendFlag) {
        this.recommendFlag = recommendFlag;
    }

    public int getStartPeriodDay() {
        return startPeriodDay;
    }

    public void setStartPeriodDay(int startPeriodDay) {
        this.startPeriodDay = startPeriodDay;
    }

    public int getEndPeriodDay() {
        return endPeriodDay;
    }

    public void setEndPeriodDay(int endPeriodDay) {
        this.endPeriodDay = endPeriodDay;
    }

    public int getStartPeriodMonth() {
        return startPeriodMonth;
    }

    public void setStartPeriodMonth(int startPeriodMonth) {
        this.startPeriodMonth = startPeriodMonth;
    }

    public int getEndPeriodMonth() {
        return endPeriodMonth;
    }

    public void setEndPeriodMonth(int endPeriodMonth) {
        this.endPeriodMonth = endPeriodMonth;
    }

    public double getLoanRate() {
        return loanRate;
    }

    public void setLoanRate(double loanRate) {
        this.loanRate = loanRate;
    }


    public String getCmsImg() {
        return cmsImg;
    }

    public void setCmsImg(String cmsImg) {
        this.cmsImg = cmsImg;
    }

    public int getServiceUserNum() {
        return serviceUserNum;
    }

    public void setServiceUserNum(int serviceUserNum) {
        this.serviceUserNum = serviceUserNum;
    }

    public double getLoanTotalAmount() {
        return loanTotalAmount;
    }

    public void setLoanTotalAmount(double loanTotalAmount) {
        this.loanTotalAmount = loanTotalAmount;
    }

    public double getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(double successRate) {
        this.successRate = successRate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSendDate() {
        return sendDate;
    }

    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDetailImg() {
        return detailImg;
    }

    public void setDetailImg(String detailImg) {
        this.detailImg = detailImg;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Object getProductSubType() {
        return productSubType;
    }

    public void setProductSubType(Object productSubType) {
        this.productSubType = productSubType;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }


    public String getRateMemo() {
        return rateMemo;
    }

    public void setRateMemo(String rateMemo) {
        this.rateMemo = rateMemo;
    }

    public String getPeriodType() {
        return periodType;
    }

    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }

    public String getPeriodTypeStr() {
        return periodTypeStr;
    }

    public void setPeriodTypeStr(String periodTypeStr) {
        this.periodTypeStr = periodTypeStr;
    }

    public int getStartPeriod() {
        return startPeriod;
    }

    public void setStartPeriod(int startPeriod) {
        this.startPeriod = startPeriod;
    }

    public int getEndPeriod() {
        return endPeriod;
    }

    public void setEndPeriod(int endPeriod) {
        this.endPeriod = endPeriod;
    }

    public double getStartAmount() {
        return startAmount;
    }

    public void setStartAmount(double startAmount) {
        this.startAmount = startAmount;
    }

    public double getEndAmount() {
        return endAmount;
    }

    public void setEndAmount(double endAmount) {
        this.endAmount = endAmount;
    }

    public String getLoanDay() {
        return loanDay;
    }

    public void setLoanDay(String loanDay) {
        this.loanDay = loanDay;
    }

    public String getApplyFlow() {
        return applyFlow;
    }

    public void setApplyFlow(String applyFlow) {
        this.applyFlow = applyFlow;
    }

    public String getApplyCondition() {
        return applyCondition;
    }

    public void setApplyCondition(String applyCondition) {
        this.applyCondition = applyCondition;
    }

    public String getApplyMaterial() {
        return applyMaterial;
    }

    public void setApplyMaterial(String applyMaterial) {
        this.applyMaterial = applyMaterial;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getShowOrder() {
        return showOrder;
    }

    public void setShowOrder(int showOrder) {
        this.showOrder = showOrder;
    }

    public int getViewNum() {
        return viewNum;
    }

    public void setViewNum(int viewNum) {
        this.viewNum = viewNum;
    }

    public int getClickNum() {
        return clickNum;
    }

    public void setClickNum(int clickNum) {
        this.clickNum = clickNum;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public Object getEndDate() {
        return endDate;
    }

    public void setEndDate(Object endDate) {
        this.endDate = endDate;
    }

    public String getOnlineDate() {
        return onlineDate;
    }

    public void setOnlineDate(String onlineDate) {
        this.onlineDate = onlineDate;
    }

    public boolean isIsValid() {
        return isValid;
    }

    public void setIsValid(boolean isValid) {
        this.isValid = isValid;
    }

    public boolean isAndroidFlag() {
        return androidFlag;
    }

    public void setAndroidFlag(boolean androidFlag) {
        this.androidFlag = androidFlag;
    }

    public boolean isAppleFlag() {
        return appleFlag;
    }

    public void setAppleFlag(boolean appleFlag) {
        this.appleFlag = appleFlag;
    }

    public boolean isWechatFlag() {
        return wechatFlag;
    }

    public void setWechatFlag(boolean wechatFlag) {
        this.wechatFlag = wechatFlag;
    }

    public String getProductFlag() {
        return productFlag;
    }

    public void setProductFlag(String productFlag) {
        this.productFlag = productFlag;
    }

    public String getBelongApp() {
        return belongApp;
    }

    public void setBelongApp(String belongApp) {
        this.belongApp = belongApp;
    }

    public int getShowOrderJds() {
        return showOrderJds;
    }

    public void setShowOrderJds(int showOrderJds) {
        this.showOrderJds = showOrderJds;
    }

    public int getShowOrderXsd() {
        return showOrderXsd;
    }

    public void setShowOrderXsd(int showOrderXsd) {
        this.showOrderXsd = showOrderXsd;
    }

    public int getShowOrderJqw() {
        return showOrderJqw;
    }

    public void setShowOrderJqw(int showOrderJqw) {
        this.showOrderJqw = showOrderJqw;
    }

    public int getShowOrderDkqb() {
        return showOrderDkqb;
    }

    public void setShowOrderDkqb(int showOrderDkqb) {
        this.showOrderDkqb = showOrderDkqb;
    }

    public int getShowOrderDsqb() {
        return showOrderDsqb;
    }

    public void setShowOrderDsqb(int showOrderDsqb) {
        this.showOrderDsqb = showOrderDsqb;
    }

    public int getShowOrderLsqd() {
        return showOrderLsqd;
    }

    public void setShowOrderLsqd(int showOrderLsqd) {
        this.showOrderLsqd = showOrderLsqd;
    }

    public int getShowOrderLyb() {
        return showOrderLyb;
    }

    public void setShowOrderLyb(int showOrderLyb) {
        this.showOrderLyb = showOrderLyb;
    }

    public int getShowOrderPxqb() {
        return showOrderPxqb;
    }

    public void setShowOrderPxqb(int showOrderPxqb) {
        this.showOrderPxqb = showOrderPxqb;
    }

    public int getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(int isRecommend) {
        this.isRecommend = isRecommend;
    }

    public String getProductLabel() {
        return productLabel;
    }

    public void setProductLabel(String productLabel) {
        this.productLabel = productLabel;
    }

    public String getBackendLoginUrl() {
        return backendLoginUrl;
    }

    public void setBackendLoginUrl(String backendLoginUrl) {
        this.backendLoginUrl = backendLoginUrl;
    }

    public String getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getCooperationModel() {
        return cooperationModel;
    }

    public void setCooperationModel(String cooperationModel) {
        this.cooperationModel = cooperationModel;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public boolean isIsDownloadApp() {
        return isDownloadApp;
    }

    public void setIsDownloadApp(boolean isDownloadApp) {
        this.isDownloadApp = isDownloadApp;
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Object getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Object getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Object getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDomicilePlace() {
        return domicilePlace;
    }

    public void setDomicilePlace(String domicilePlace) {
        this.domicilePlace = domicilePlace;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSocialIdentity() {
        return socialIdentity;
    }

    public void setSocialIdentity(String socialIdentity) {
        this.socialIdentity = socialIdentity;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public boolean isIsSocial() {
        return isSocial;
    }

    public void setIsSocial(boolean isSocial) {
        this.isSocial = isSocial;
    }

    public boolean isIsFund() {
        return isFund;
    }

    public void setIsFund(boolean isFund) {
        this.isFund = isFund;
    }

    public boolean isIsCreditCard() {
        return isCreditCard;
    }

    public void setIsCreditCard(boolean isCreditCard) {
        this.isCreditCard = isCreditCard;
    }

    public boolean isIsHouseOrCarLoan() {
        return isHouseOrCarLoan;
    }

    public void setIsHouseOrCarLoan(boolean isHouseOrCarLoan) {
        this.isHouseOrCarLoan = isHouseOrCarLoan;
    }

    public int getWechatAmount() {
        return wechatAmount;
    }

    public void setWechatAmount(int wechatAmount) {
        this.wechatAmount = wechatAmount;
    }

    public int getSesameCredit() {
        return sesameCredit;
    }

    public void setSesameCredit(int sesameCredit) {
        this.sesameCredit = sesameCredit;
    }

}
