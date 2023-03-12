package com.prototype.springguide;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sample")
@RequiredArgsConstructor
@Slf4j
public class SampleApi {

    // Log4j Logger
    private final Logger logger = LogManager.getLogger(SampleApi.class);

    /**
     * log4j2 로그 출력 샘플
     * @param request : 요청값
     * @return 결과값 리턴
     */
    @GetMapping("/log")
    public ResponseEntity<String> create(@RequestParam("name") String request) {
        System.out.println("======= start =======");
        logger.info("USE logger.info : Hello. This is LogManager's logger");
        log.info("USE log.info : Hello. This is Lombok logger");
        System.out.println("======= end ========");

        return ResponseEntity.ok(request);
    }

}
