package com.onion.model

import org.hibernate.annotations.DynamicUpdate
import javax.persistence.*


@Entity
@DynamicUpdate
data class Users (
        var name: String ?= null,
        var salary: Int = 20,
//        @OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
//        var roles:Set<Roles> ?= null,
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name="role_id", nullable=false)
        var roles: Roles ?= null,
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long = 0
)