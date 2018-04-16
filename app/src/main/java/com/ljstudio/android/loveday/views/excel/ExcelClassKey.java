package com.ljstudio.android.loveday.views.excel;

/**
 * Excel里标题和实体类里面字段的对应键值对
 */
public class ExcelClassKey {

    /**
     * excel中对应的title
     */
    private String Title;
    /**
     * 类实体的变量名字
     */
    private String FieldName;

    public ExcelClassKey(String title, String fieldName) {
        Title = title;
        FieldName = fieldName;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public String getFieldName() {
        return FieldName;
    }

    public void setFieldName(String fieldName) {
        this.FieldName = fieldName;
    }

}
