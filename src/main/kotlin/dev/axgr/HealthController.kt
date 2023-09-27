package dev.axgr

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthController {

  companion object {
    private val log = LoggerFactory.getLogger(HealthController::class.java)
  }

  @GetMapping("/health")
  fun health(@RequestHeader("API-KEY", required = true) key: String): String {
    log.info("Received request with API-KEY: $key")
    return "Alive!"
  }
}
