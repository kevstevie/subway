package com.sb.subwaymission.filereader

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestConstructor

@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
@SpringBootTest
class StationFileReaderTest(private val stationFileReader: StationFileReader) {

    @Test
    fun json_파싱_테스트() {
        val json = stationFileReader.stringToJsonData("""
            {
            "DESCRIPTION" : {"STATION_NM":"전철역명","STATION_CD":"전철역코드","STATION_NM_CHN":"전철명명(중문)","LINE_NUM":"호선","FR_CODE":"외부코드","STATION_NM_JPN":"전철명명(일문)","STATION_NM_ENG":"전철명명(영문)"},
            "DATA" : [
            {"line_num":"01호선","station_nm_chn":"望月寺","station_cd":"1904","station_nm_jpn":"マンウォルサ","station_nm_eng":"Mangwolsa","station_nm":"망월사","fr_code":"112"},
            {"line_num":"01호선","station_nm_chn":"新道林","station_cd":"1007","station_nm_jpn":"シンドリム","station_nm_eng":"Sindorim","station_nm":"신도림","fr_code":"140"},
            {"line_num":"01호선","station_nm_chn":"衿井","station_cd":"1708","station_nm_jpn":"クムジョン","station_nm_eng":"Geumjeong","station_nm":"금정","fr_code":"P149"},
            {"line_num":"01호선","station_nm_chn":"保山","station_cd":"1914","station_nm_jpn":"ポサン","station_nm_eng":"Bosan","station_nm":"보산","fr_code":"102"}
            ]
            }
        """.trimIndent())

        assertThat(json).hasSize(3)
    }
}

