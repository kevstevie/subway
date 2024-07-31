package com.sb.subwaymission.station

import org.springframework.data.domain.Pageable
import org.springframework.data.repository.CrudRepository

interface StationRepository : CrudRepository<Station, Long> {

    fun findAllByOrderByName(pageable: Pageable): List<Station>
}
