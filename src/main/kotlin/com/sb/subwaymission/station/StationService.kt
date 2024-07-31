package com.sb.subwaymission.station

import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional
@Service
class StationService(
        private val stationRepository: StationRepository
) {

    @Transactional(readOnly = true)
    fun findAll(page: Int) = stationRepository.findAllByOrderByName(PageRequest.of(page, 10))
            .map { StationResponse(it.id, it.name) }
}
