package com.yc.boke.bean;

public class Category {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.id
     *
     * @mbg.generated Sat Aug 17 15:19:25 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.name
     *
     * @mbg.generated Sat Aug 17 15:19:25 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.url
     *
     * @mbg.generated Sat Aug 17 15:19:25 CST 2019
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.sort
     *
     * @mbg.generated Sat Aug 17 15:19:25 CST 2019
     */
    private Integer sort;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.introduce
     *
     * @mbg.generated Sat Aug 17 15:19:25 CST 2019
     */
    private String introduce;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.id
     *
     * @return the value of category.id
     *
     * @mbg.generated Sat Aug 17 15:19:25 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.id
     *
     * @param id the value for category.id
     *
     * @mbg.generated Sat Aug 17 15:19:25 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.name
     *
     * @return the value of category.name
     *
     * @mbg.generated Sat Aug 17 15:19:25 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.name
     *
     * @param name the value for category.name
     *
     * @mbg.generated Sat Aug 17 15:19:25 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.url
     *
     * @return the value of category.url
     *
     * @mbg.generated Sat Aug 17 15:19:25 CST 2019
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.url
     *
     * @param url the value for category.url
     *
     * @mbg.generated Sat Aug 17 15:19:25 CST 2019
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.sort
     *
     * @return the value of category.sort
     *
     * @mbg.generated Sat Aug 17 15:19:25 CST 2019
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.sort
     *
     * @param sort the value for category.sort
     *
     * @mbg.generated Sat Aug 17 15:19:25 CST 2019
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.introduce
     *
     * @return the value of category.introduce
     *
     * @mbg.generated Sat Aug 17 15:19:25 CST 2019
     */
    public String getIntroduce() {
        return introduce;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.introduce
     *
     * @param introduce the value for category.introduce
     *
     * @mbg.generated Sat Aug 17 15:19:25 CST 2019
     */
    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }
}