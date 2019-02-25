package com.basicfu.sip.api

import com.basicfu.sip.core.annotation.EnableSipCore
import org.springframework.boot.runApplication
import org.springframework.cloud.client.SpringCloudApplication
import org.springframework.cloud.openfeign.EnableFeignClients
import tk.mybatis.spring.annotation.MapperScan

@MapperScan(basePackages = ["com.basicfu.sip.api.mapper"])
@EnableFeignClients
@EnableSipCore
@SpringCloudApplication
class SipApiApplication

fun main(args: Array<String>) {
    runApplication<SipApiApplication>(*args)
}
