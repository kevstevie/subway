package com.sb.subwaymission.filereader

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SubwayFile(@SerialName("DATA") val data: List<StationData>)
