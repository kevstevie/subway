package com.sb.subwaymission.filereader

import com.sb.subwaymission.station.Station
import com.sb.subwaymission.station.StationRepository
import kotlinx.serialization.json.Json
import org.springframework.stereotype.Component
import java.io.File
import java.io.InputStreamReader

@Component
class StationFileReader(private val stationRepository: StationRepository) {

    fun readFile(file: File): String {
        val reader: InputStreamReader = file.inputStream().reader()

        val text = reader.readText()
        reader.close()

        return text
    }

    fun stringToJsonData(text: String): List<StationData> {
        val json = Json { ignoreUnknownKeys = true }

        return json.decodeFromString<SubwayFile>(text).data
    }

    fun save(data: List<StationData>) {

        val stations = data.map { Station(name = it.name, code = it.code, line = it.line) }

        stationRepository.saveAll(stations)
    }
}
