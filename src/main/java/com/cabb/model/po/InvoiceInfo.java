package com.cabb.model.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @ClassName InvoiceInfo
 * @Description 发票信息
 * @Author Cabbagelye
 * @Date 2023/9/26 9:52
 **/
@TableName("ssm_invoice_info")
public class InvoiceInfo {

    @TableId
    private String id;
    /**
     * 发票名称
     */
    private String invoiceName;
    /**
     * 发票抬头名称
     */
    private String invoiceTitleName;
    /**
     * 机器编号
     */
    private String invoiceMachineCode;
    /**
     * 发票代码
     */
    private String invoiceCode;
    /**
     * 发票号码
     */
    private String invoiceNumber;
    /**
     * 开票日期
     */
    private String invoiceIssuanceDate;
    /**
     * 校验码
     */
    private String invoiceCheckCode;
    /**
     * 购买方名称
     */
    private String invoicePurchaserName;
    /**
     * 购买方纳税人识别号
     */
    private String invoicePurchaserTaxpayerNumber;
    /**
     * 购买方地址、电话
     */
    private String invoicePurchaserAddrTel;
    /**
     * 购买方开户行及账号
     */
    private String invoicePurchaserAccountBankNumber;
    /**
     * 密码区
     */
    private String invoicePasswordArea;
    /**
     * 货物或应税劳务、服务名称
     */
    private String invoiceDetailsName;
    /**
     * 规格型号
     */
    private String invoiceSpecificationsModels;
    /**
     * 单位
     */
    private String invoiceUnitName;
    /**
     * 数量
     */
    private String invoiceQuantity;
    /**
     * 单价
     */
    private String invoiceUnitPrice;
    /**
     * 金额
     */
    private String invoiceAmount;
    /**
     * 税率
     */
    private String invoiceRate;
    /**
     * 税额
     */
    private String invoiceTax;
    /**
     * 金额合计
     */
    private String invoiceDetailsTotalAmount;
    /**
     * 税额合计
     */
    private String invoiceDetailsTotalTax;
    /**
     * 价税合计
     */
    private String invoiceDetailsTotalAmountTax;
    /**
     * 销售方名称
     */
    private String invoiceSellerName;
    /**
     * 销售方纳税人识别号
     */
    private String invoiceSellerTaxpayerNumber;
    /**
     * 销售方地址、电话
     */
    private String invoiceSellerAddrTel;
    /**
     * 销售方开户行及账号
     */
    private String invoiceSellerAccountBankNumber;
    /**
     * 备注
     */
    private String invoiceRemark;
    /**
     * 收款人
     */
    private String invoicePayeeName;
    /**
     * 复核
     */
    private String invoiceRecheckName;
    /**
     * 开票人
     */
    private String invoiceIssuanceName;
    /**
     * 销售方
     */
    private String invoiceSellerOfficialSeal;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInvoiceName() {
        return invoiceName;
    }

    public void setInvoiceName(String invoiceName) {
        this.invoiceName = invoiceName;
    }

    public String getInvoiceTitleName() {
        return invoiceTitleName;
    }

    public void setInvoiceTitleName(String invoiceTitleName) {
        this.invoiceTitleName = invoiceTitleName;
    }

    public String getInvoiceMachineCode() {
        return invoiceMachineCode;
    }

    public void setInvoiceMachineCode(String invoiceMachineCode) {
        this.invoiceMachineCode = invoiceMachineCode;
    }

    public String getInvoiceCode() {
        return invoiceCode;
    }

    public void setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getInvoiceIssuanceDate() {
        return invoiceIssuanceDate;
    }

    public void setInvoiceIssuanceDate(String invoiceIssuanceDate) {
        this.invoiceIssuanceDate = invoiceIssuanceDate;
    }

    public String getInvoiceCheckCode() {
        return invoiceCheckCode;
    }

    public void setInvoiceCheckCode(String invoiceCheckCode) {
        this.invoiceCheckCode = invoiceCheckCode;
    }

    public String getInvoicePurchaserName() {
        return invoicePurchaserName;
    }

    public void setInvoicePurchaserName(String invoicePurchaserName) {
        this.invoicePurchaserName = invoicePurchaserName;
    }

    public String getInvoicePurchaserTaxpayerNumber() {
        return invoicePurchaserTaxpayerNumber;
    }

    public void setInvoicePurchaserTaxpayerNumber(String invoicePurchaserTaxpayerNumber) {
        this.invoicePurchaserTaxpayerNumber = invoicePurchaserTaxpayerNumber;
    }

    public String getInvoicePurchaserAddrTel() {
        return invoicePurchaserAddrTel;
    }

    public void setInvoicePurchaserAddrTel(String invoicePurchaserAddrTel) {
        this.invoicePurchaserAddrTel = invoicePurchaserAddrTel;
    }

    public String getInvoicePurchaserAccountBankNumber() {
        return invoicePurchaserAccountBankNumber;
    }

    public void setInvoicePurchaserAccountBankNumber(String invoicePurchaserAccountBankNumber) {
        this.invoicePurchaserAccountBankNumber = invoicePurchaserAccountBankNumber;
    }

    public String getInvoicePasswordArea() {
        return invoicePasswordArea;
    }

    public void setInvoicePasswordArea(String invoicePasswordArea) {
        this.invoicePasswordArea = invoicePasswordArea;
    }

    public String getInvoiceDetailsName() {
        return invoiceDetailsName;
    }

    public void setInvoiceDetailsName(String invoiceDetailsName) {
        this.invoiceDetailsName = invoiceDetailsName;
    }

    public String getInvoiceSpecificationsModels() {
        return invoiceSpecificationsModels;
    }

    public void setInvoiceSpecificationsModels(String invoiceSpecificationsModels) {
        this.invoiceSpecificationsModels = invoiceSpecificationsModels;
    }

    public String getInvoiceUnitName() {
        return invoiceUnitName;
    }

    public void setInvoiceUnitName(String invoiceUnitName) {
        this.invoiceUnitName = invoiceUnitName;
    }

    public String getInvoiceQuantity() {
        return invoiceQuantity;
    }

    public void setInvoiceQuantity(String invoiceQuantity) {
        this.invoiceQuantity = invoiceQuantity;
    }

    public String getInvoiceUnitPrice() {
        return invoiceUnitPrice;
    }

    public void setInvoiceUnitPrice(String invoiceUnitPrice) {
        this.invoiceUnitPrice = invoiceUnitPrice;
    }

    public String getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(String invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public String getInvoiceRate() {
        return invoiceRate;
    }

    public void setInvoiceRate(String invoiceRate) {
        this.invoiceRate = invoiceRate;
    }

    public String getInvoiceTax() {
        return invoiceTax;
    }

    public void setInvoiceTax(String invoiceTax) {
        this.invoiceTax = invoiceTax;
    }

    public String getInvoiceDetailsTotalAmount() {
        return invoiceDetailsTotalAmount;
    }

    public void setInvoiceDetailsTotalAmount(String invoiceDetailsTotalAmount) {
        this.invoiceDetailsTotalAmount = invoiceDetailsTotalAmount;
    }

    public String getInvoiceDetailsTotalTax() {
        return invoiceDetailsTotalTax;
    }

    public void setInvoiceDetailsTotalTax(String invoiceDetailsTotalTax) {
        this.invoiceDetailsTotalTax = invoiceDetailsTotalTax;
    }

    public String getInvoiceDetailsTotalAmountTax() {
        return invoiceDetailsTotalAmountTax;
    }

    public void setInvoiceDetailsTotalAmountTax(String invoiceDetailsTotalAmountTax) {
        this.invoiceDetailsTotalAmountTax = invoiceDetailsTotalAmountTax;
    }

    public String getInvoiceSellerName() {
        return invoiceSellerName;
    }

    public void setInvoiceSellerName(String invoiceSellerName) {
        this.invoiceSellerName = invoiceSellerName;
    }

    public String getInvoiceSellerTaxpayerNumber() {
        return invoiceSellerTaxpayerNumber;
    }

    public void setInvoiceSellerTaxpayerNumber(String invoiceSellerTaxpayerNumber) {
        this.invoiceSellerTaxpayerNumber = invoiceSellerTaxpayerNumber;
    }

    public String getInvoiceSellerAddrTel() {
        return invoiceSellerAddrTel;
    }

    public void setInvoiceSellerAddrTel(String invoiceSellerAddrTel) {
        this.invoiceSellerAddrTel = invoiceSellerAddrTel;
    }

    public String getInvoiceSellerAccountBankNumber() {
        return invoiceSellerAccountBankNumber;
    }

    public void setInvoiceSellerAccountBankNumber(String invoiceSellerAccountBankNumber) {
        this.invoiceSellerAccountBankNumber = invoiceSellerAccountBankNumber;
    }

    public String getInvoiceRemark() {
        return invoiceRemark;
    }

    public void setInvoiceRemark(String invoiceRemark) {
        this.invoiceRemark = invoiceRemark;
    }

    public String getInvoicePayeeName() {
        return invoicePayeeName;
    }

    public void setInvoicePayeeName(String invoicePayeeName) {
        this.invoicePayeeName = invoicePayeeName;
    }

    public String getInvoiceRecheckName() {
        return invoiceRecheckName;
    }

    public void setInvoiceRecheckName(String invoiceRecheckName) {
        this.invoiceRecheckName = invoiceRecheckName;
    }

    public String getInvoiceIssuanceName() {
        return invoiceIssuanceName;
    }

    public void setInvoiceIssuanceName(String invoiceIssuanceName) {
        this.invoiceIssuanceName = invoiceIssuanceName;
    }

    public String getInvoiceSellerOfficialSeal() {
        return invoiceSellerOfficialSeal;
    }

    public void setInvoiceSellerOfficialSeal(String invoiceSellerOfficialSeal) {
        this.invoiceSellerOfficialSeal = invoiceSellerOfficialSeal;
    }
}
