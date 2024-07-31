package com.sb.subwaymission.member

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.MappedCollection

class Member(
        @Id
        private val id: Long,
        
        private val deviceId: String,

        @MappedCollection
        private val destinations: Set<Destination>
) {
}
