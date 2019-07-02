package com.hrbc.business.domain.enums;

/**
 * 数据有效状态的枚举类
 * 不要轻易改 因为很多逻辑条件要和数据库表一起操作
 *
 * @author huangyongchao
 */
public enum StaffStateE {
    /**
     * 0 在职 1 休假 2 离职
     */
    ACTIVATE("在职", 0), VACATION("休假", 1), INACTIVATE("离职", 2);
    public String name;
    public int code;

    private StaffStateE(String name, int code) {
        this.name = name;
        this.code = code;
    }
}
