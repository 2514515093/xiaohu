package com.itcast.domain.export;

import java.math.BigDecimal;

public class ExportProduct {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_export_product.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_export_product.export_id
     *
     * @mbg.generated
     */
    private String exportId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_export_product.factory_id
     *
     * @mbg.generated
     */
    private String factoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_export_product.product_no
     *
     * @mbg.generated
     */
    private String productNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_export_product.packing_unit
     *
     * @mbg.generated
     */
    private String packingUnit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_export_product.cnumber
     *
     * @mbg.generated
     */
    private Long cnumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_export_product.box_num
     *
     * @mbg.generated
     */
    private Long boxNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_export_product.gross_weight
     *
     * @mbg.generated
     */
    private BigDecimal grossWeight;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_export_product.net_weight
     *
     * @mbg.generated
     */
    private BigDecimal netWeight;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_export_product.size_length
     *
     * @mbg.generated
     */
    private BigDecimal sizeLength;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_export_product.size_width
     *
     * @mbg.generated
     */
    private BigDecimal sizeWidth;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_export_product.size_height
     *
     * @mbg.generated
     */
    private BigDecimal sizeHeight;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_export_product.ex_price
     *
     * @mbg.generated
     */
    private BigDecimal exPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_export_product.price
     *
     * @mbg.generated
     */
    private BigDecimal price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_export_product.tax
     *
     * @mbg.generated
     */
    private BigDecimal tax;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_export_product.order_no
     *
     * @mbg.generated
     */
    private Long orderNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_export_product.company_id
     *
     * @mbg.generated
     */
    private String companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_export_product.company_name
     *
     * @mbg.generated
     */
    private String companyName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_export_product.id
     *
     * @return the value of co_export_product.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_export_product.id
     *
     * @param id the value for co_export_product.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_export_product.export_id
     *
     * @return the value of co_export_product.export_id
     *
     * @mbg.generated
     */
    public String getExportId() {
        return exportId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_export_product.export_id
     *
     * @param exportId the value for co_export_product.export_id
     *
     * @mbg.generated
     */
    public void setExportId(String exportId) {
        this.exportId = exportId == null ? null : exportId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_export_product.factory_id
     *
     * @return the value of co_export_product.factory_id
     *
     * @mbg.generated
     */
    public String getFactoryId() {
        return factoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_export_product.factory_id
     *
     * @param factoryId the value for co_export_product.factory_id
     *
     * @mbg.generated
     */
    public void setFactoryId(String factoryId) {
        this.factoryId = factoryId == null ? null : factoryId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_export_product.product_no
     *
     * @return the value of co_export_product.product_no
     *
     * @mbg.generated
     */
    public String getProductNo() {
        return productNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_export_product.product_no
     *
     * @param productNo the value for co_export_product.product_no
     *
     * @mbg.generated
     */
    public void setProductNo(String productNo) {
        this.productNo = productNo == null ? null : productNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_export_product.packing_unit
     *
     * @return the value of co_export_product.packing_unit
     *
     * @mbg.generated
     */
    public String getPackingUnit() {
        return packingUnit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_export_product.packing_unit
     *
     * @param packingUnit the value for co_export_product.packing_unit
     *
     * @mbg.generated
     */
    public void setPackingUnit(String packingUnit) {
        this.packingUnit = packingUnit == null ? null : packingUnit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_export_product.cnumber
     *
     * @return the value of co_export_product.cnumber
     *
     * @mbg.generated
     */
    public Long getCnumber() {
        return cnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_export_product.cnumber
     *
     * @param cnumber the value for co_export_product.cnumber
     *
     * @mbg.generated
     */
    public void setCnumber(Long cnumber) {
        this.cnumber = cnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_export_product.box_num
     *
     * @return the value of co_export_product.box_num
     *
     * @mbg.generated
     */
    public Long getBoxNum() {
        return boxNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_export_product.box_num
     *
     * @param boxNum the value for co_export_product.box_num
     *
     * @mbg.generated
     */
    public void setBoxNum(Long boxNum) {
        this.boxNum = boxNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_export_product.gross_weight
     *
     * @return the value of co_export_product.gross_weight
     *
     * @mbg.generated
     */
    public BigDecimal getGrossWeight() {
        return grossWeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_export_product.gross_weight
     *
     * @param grossWeight the value for co_export_product.gross_weight
     *
     * @mbg.generated
     */
    public void setGrossWeight(BigDecimal grossWeight) {
        this.grossWeight = grossWeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_export_product.net_weight
     *
     * @return the value of co_export_product.net_weight
     *
     * @mbg.generated
     */
    public BigDecimal getNetWeight() {
        return netWeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_export_product.net_weight
     *
     * @param netWeight the value for co_export_product.net_weight
     *
     * @mbg.generated
     */
    public void setNetWeight(BigDecimal netWeight) {
        this.netWeight = netWeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_export_product.size_length
     *
     * @return the value of co_export_product.size_length
     *
     * @mbg.generated
     */
    public BigDecimal getSizeLength() {
        return sizeLength;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_export_product.size_length
     *
     * @param sizeLength the value for co_export_product.size_length
     *
     * @mbg.generated
     */
    public void setSizeLength(BigDecimal sizeLength) {
        this.sizeLength = sizeLength;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_export_product.size_width
     *
     * @return the value of co_export_product.size_width
     *
     * @mbg.generated
     */
    public BigDecimal getSizeWidth() {
        return sizeWidth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_export_product.size_width
     *
     * @param sizeWidth the value for co_export_product.size_width
     *
     * @mbg.generated
     */
    public void setSizeWidth(BigDecimal sizeWidth) {
        this.sizeWidth = sizeWidth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_export_product.size_height
     *
     * @return the value of co_export_product.size_height
     *
     * @mbg.generated
     */
    public BigDecimal getSizeHeight() {
        return sizeHeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_export_product.size_height
     *
     * @param sizeHeight the value for co_export_product.size_height
     *
     * @mbg.generated
     */
    public void setSizeHeight(BigDecimal sizeHeight) {
        this.sizeHeight = sizeHeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_export_product.ex_price
     *
     * @return the value of co_export_product.ex_price
     *
     * @mbg.generated
     */
    public BigDecimal getExPrice() {
        return exPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_export_product.ex_price
     *
     * @param exPrice the value for co_export_product.ex_price
     *
     * @mbg.generated
     */
    public void setExPrice(BigDecimal exPrice) {
        this.exPrice = exPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_export_product.price
     *
     * @return the value of co_export_product.price
     *
     * @mbg.generated
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_export_product.price
     *
     * @param price the value for co_export_product.price
     *
     * @mbg.generated
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_export_product.tax
     *
     * @return the value of co_export_product.tax
     *
     * @mbg.generated
     */
    public BigDecimal getTax() {
        return tax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_export_product.tax
     *
     * @param tax the value for co_export_product.tax
     *
     * @mbg.generated
     */
    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_export_product.order_no
     *
     * @return the value of co_export_product.order_no
     *
     * @mbg.generated
     */
    public Long getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_export_product.order_no
     *
     * @param orderNo the value for co_export_product.order_no
     *
     * @mbg.generated
     */
    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_export_product.company_id
     *
     * @return the value of co_export_product.company_id
     *
     * @mbg.generated
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_export_product.company_id
     *
     * @param companyId the value for co_export_product.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_export_product.company_name
     *
     * @return the value of co_export_product.company_name
     *
     * @mbg.generated
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_export_product.company_name
     *
     * @param companyName the value for co_export_product.company_name
     *
     * @mbg.generated
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }
}