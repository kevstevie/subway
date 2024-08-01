package com.sb.subwaymission.filereader

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class StationData(
        @SerialName("line_num") val line: String,
        @SerialName("station_cd") val code: String,
        @SerialName("station_nm") val name: String
)
