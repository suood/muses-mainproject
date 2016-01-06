package com.muses.data.model;

public class AdminOperationLogRecord {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column suood_admin_log.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column suood_admin_log.content
     *
     * @mbggenerated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column suood_admin_log.create_time
     *
     * @mbggenerated
     */
    private Integer createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column suood_admin_log.admin_name
     *
     * @mbggenerated
     */
    private String adminName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column suood_admin_log.admin_id
     *
     * @mbggenerated
     */
    private Integer adminId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column suood_admin_log.ip
     *
     * @mbggenerated
     */
    private String ip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column suood_admin_log.url
     *
     * @mbggenerated
     */
    private String url;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column suood_admin_log.id
     *
     * @return the value of suood_admin_log.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column suood_admin_log.id
     *
     * @param id the value for suood_admin_log.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column suood_admin_log.content
     *
     * @return the value of suood_admin_log.content
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column suood_admin_log.content
     *
     * @param content the value for suood_admin_log.content
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column suood_admin_log.create_time
     *
     * @return the value of suood_admin_log.create_time
     *
     * @mbggenerated
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column suood_admin_log.create_time
     *
     * @param createTime the value for suood_admin_log.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column suood_admin_log.admin_name
     *
     * @return the value of suood_admin_log.admin_name
     *
     * @mbggenerated
     */
    public String getAdminName() {
        return adminName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column suood_admin_log.admin_name
     *
     * @param adminName the value for suood_admin_log.admin_name
     *
     * @mbggenerated
     */
    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column suood_admin_log.admin_id
     *
     * @return the value of suood_admin_log.admin_id
     *
     * @mbggenerated
     */
    public Integer getAdminId() {
        return adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column suood_admin_log.admin_id
     *
     * @param adminId the value for suood_admin_log.admin_id
     *
     * @mbggenerated
     */
    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column suood_admin_log.ip
     *
     * @return the value of suood_admin_log.ip
     *
     * @mbggenerated
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column suood_admin_log.ip
     *
     * @param ip the value for suood_admin_log.ip
     *
     * @mbggenerated
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column suood_admin_log.url
     *
     * @return the value of suood_admin_log.url
     *
     * @mbggenerated
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column suood_admin_log.url
     *
     * @param url the value for suood_admin_log.url
     *
     * @mbggenerated
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}