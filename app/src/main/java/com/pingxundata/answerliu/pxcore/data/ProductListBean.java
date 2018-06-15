package com.pingxundata.answerliu.pxcore.data;

/**
 * Created by LH on 2017/8/2.
 * 产品列表数据源
 */

public class ProductListBean {
            /**
             * id : 87
             * name : 魔借
             * img : http://119.23.64.92:8099/group1/M00/00/01/rBKc91l-7wWAYtkiAABP1_8dhwM676.png
             * serviceRate : 8.0
             * startPeriod : 2
             * endPeriod : 12
             * periodType : 月
             * startAmount : 3000.0
             * endAmount : 200000.0
             * isValid : true
             * viewNum : 49
             * clickNum : 12
             * productFlag : 0
             */

            private int id;
            private String name;
            private String img;
            private double serviceRate;
            private int startPeriod;
            private int endPeriod;
            private String periodType;
            private double startAmount;
            private double endAmount;
            private boolean isValid;
            private int viewNum;
            private int clickNum;
            private String productFlag;



            private String productLabel;
            private int isRecommend;


            public String getProductLabel() {
                return productLabel;
            }

            public void setProductLabel(String productLabel) {
                this.productLabel = productLabel;
            }

            public int getIsRecommend() {
                return isRecommend;
            }

            public void setIsRecommend(int isRecommend) {
                this.isRecommend = isRecommend;
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

            public double getServiceRate() {
                return serviceRate;
            }

            public void setServiceRate(double serviceRate) {
                this.serviceRate = serviceRate;
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

            public String getPeriodType() {
                return periodType;
            }

            public void setPeriodType(String periodType) {
                this.periodType = periodType;
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

            public boolean isIsValid() {
                return isValid;
            }

            public void setIsValid(boolean isValid) {
                this.isValid = isValid;
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

            public String getProductFlag() {
                return productFlag;
            }

            public void setProductFlag(String productFlag) {
                this.productFlag = productFlag;
            }

}
