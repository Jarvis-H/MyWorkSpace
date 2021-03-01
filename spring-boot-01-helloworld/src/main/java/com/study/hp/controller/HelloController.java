package com.study.hp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping
    public String hello() {
        String sortKey = "CHARGE_TIME";
        String sort = "desc";
        Map<String, String> map = null;
        for (String key : map.keySet()) {
            if (key.equals("id")) {
                sortKey = "ID";
            } else if (key.equals("billNo")) {
                sortKey = "BILL_NO";
            } else if (key.equals("settleCustomerCode")) {
                sortKey = "SETTLE_CUSTOMER_CODE";
            } else if (key.equals("settleCustomerName")) {
                sortKey = "SETTLE_CUSTOMER_NAME";
            } else if (key.equals("quantity")) {
                sortKey = "QUANTITY";
            } else if (key.equals("chargeWeight")) {
                sortKey = "CHARGE_WEIGHT";
            } else if (key.equals("amount")) {
                sortKey = "AMOUNT";
            } else if (key.equals("surchargeOne")) {
                sortKey = "SURCHARGE_ONE";
            } else if (key.equals("surchargeTwo")) {
                sortKey = "SURCHARGE_TWO";
            } else if (key.equals("totalAmount")) {
                sortKey = "TOTAL_AMOUNT";
            } else if (key.equals("createTime")) {
                sortKey = "CREATE_TIME";
            } else if (key.equals("auditFlag")) {
                sortKey = "AUDIT_FLAG";
            } else if (key.equals("auditTime")) {
                sortKey = "AUDIT_TIME";
            } else if (key.equals("billStartTime")) {
                sortKey = "BILL_START_TIME";
            } else if (key.equals("billEndTime")) {
                sortKey = "BILL_END_TIME";
            } else if (key.equals("billCreateUserCode")) {
                sortKey = "BILL_CREATE_USER_CODE";
            } else if (key.equals("billCreateUserName")) {
                sortKey = "BILL_CREATE_USER_NAME";
            } else if (key.equals("billCreateOrgCode")) {
                sortKey = "BILL_CREATE_ORG_CODE";
            } else if (key.equals("billCreateOrgName")) {
                sortKey = "BILL_CREATE_ORG_NAME";
            } else if (key.equals("auditUserCode")) {
                sortKey = "AUDIT_USER_CODE";
            } else if (key.equals("auditOrgCode")) {
                sortKey = "AUDIT_ORG_CODE";
            } else if (key.equals("auditUserName")) {
                sortKey = "AUDIT_USER_NAME";
            } else if (key.equals("auditOrgName")) {
                sortKey = "AUDIT_ORG_NAME";
            } else if (key.equals("settleOrgName")) {
                sortKey = "SETTLE_ORG_NAME";
            } else if (key.equals("settleOrgCode")) {
                sortKey = "SETTLE_ORG_CODE";
            }


            sort = map.get(key);
            break;
        }
        return "";
    }
}
