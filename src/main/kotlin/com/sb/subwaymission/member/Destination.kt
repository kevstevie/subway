package com.sb.subwaymission.member

import com.sb.subwaymission.station.Station
import org.springframework.data.annotation.Id
import org.springframework.data.jdbc.core.mapping.AggregateReference

class Destination(
        @Id
        private val id: Long,

        private val stationId: AggregateReference<Station, Long>
) {
}
