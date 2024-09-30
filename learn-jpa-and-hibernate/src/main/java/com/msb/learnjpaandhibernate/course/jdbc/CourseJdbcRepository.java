package com.msb.learnjpaandhibernate.course.jdbc;

import com.msb.learnjpaandhibernate.course.Course;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class CourseJdbcRepository {
    private JdbcTemplate springJdbcTemplate;

    private static final String INSERT_QUERY = """
                insert into COURSE (id, name, author)
                values (?, ?, ?);
            """;


    public void insert(@NonNull Course course) {
        springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
    }

    private static final String DELETE_QUERY = """
                delete from course
                where id = ?;
            """;

    public void deleteById(@NonNull Long id) {
        springJdbcTemplate.update(DELETE_QUERY, id);
    }

    private static final String SELECT_QUERY = """
                SELECT * FROM COURSE
                WHERE id = ?;
            """;

    public Course findById(@NonNull Long id) {
        return springJdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
    }

}
