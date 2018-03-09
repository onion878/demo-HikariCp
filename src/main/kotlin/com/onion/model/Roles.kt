package com.onion.model

import org.hibernate.annotations.DynamicUpdate
import javax.persistence.*


@Entity
@DynamicUpdate
data class Roles(
        var name: String ?= null,
//        @ManyToOne(fetch = FetchType.LAZY)
//        @JoinColumn(name="user_id", nullable=false)
//        var users: Users ?= null,
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long = 0
)