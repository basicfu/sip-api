package com.basicfu.sip.api.model.po

import javax.persistence.*

@Table(name = "project_category")
class ProjectCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
    @Column(name = "project_id")
    var projectId: Long? = null
    var pid: Long? = null
    var name: String? = null
    var sort: Int? = null
    var cdate: Int? = null
    var udate: Int? = null
    var cuid: Long? = null
}
