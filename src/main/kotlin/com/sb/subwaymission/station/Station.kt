package com.sb.subwaymission.station

import org.springframework.data.annotation.Id

class Station(
        @Id
        val id: Long,

        val name: String
) {
}
