package com.basicfu.sip.api.common

enum class Enum(val value: Int, val msg: String) {
    NOT_FOUND_DATA(8, "要操作的数据不存在"),
    EXIST_PROJECT_NAME(4000, "项目名已存在"),
    EXIST_PROJECT_CATEGORY_NAME(4001, "项目分类名已存在"),
    EXIST_INTERFACE_NAME(4002, "接口名已存在");

    enum class ProjectCategoryType {
        DIRECTORY,
        INTERFACE
    }

    enum class RequestMethod {
        GET,
        POST,
        PUT,
        PATCH,
        DELETE,
        HEAD,
        OPTIONS,
    }

    enum class ReqBodyType {
        FORM,
        JSON,
        FILE,
        RAW,
    }

    enum class InterfaceHistoryType {
        SAVE,
        REQUEST,
    }
}
