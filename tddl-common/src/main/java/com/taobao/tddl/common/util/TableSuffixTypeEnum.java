package com.taobao.tddl.common.util;

public enum TableSuffixTypeEnum {
    twoColumnForEachDB("twoColumnForEachDB"), dbIndexForEachDB("dbIndexForEachDB"), groovyTableList(
                                                                                                    "groovyTableList"), groovyThroughAllDBTableList(
                                                                                                                                                    "groovyThroughAllDBTableList"), groovyAdjustTableList(
                                                                                                                                                                                                          "groovyAdjustTableList"), throughAllDB(
                                                                                                                                                                                                 "throughAllDB"), resetForEachDB(
                                                                                                                                                                                                                                 "resetForEachDB");
    private String value;

    private TableSuffixTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
