package com.sb.subwaymission.station

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class StationController(
        private val stationService: StationService
) {

    @GetMapping("/stations")
    fun list(@RequestParam page: Int): ResponseEntity<List<StationResponse>> {
        val response = stationService.findAll(page)

        return ResponseEntity.ok(response)
    }
}
