package com.sb.subwaymission.station

import org.springframework.data.annotation.Id

class Station(
        @Id
        var id: Long? = null,

        val name: String,

        val code: String,

        val line: String
) {
}
