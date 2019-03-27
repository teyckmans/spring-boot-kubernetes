package spring.boot.kubernetes.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Service
@Transactional
public class BasicsService {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public BasicsService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public LocalDateTime time() {
        final Timestamp timestamp = this.jdbcTemplate.queryForObject(
                "select current_timestamp",
                Timestamp.class);

        return timestamp.toLocalDateTime();
    }
}
