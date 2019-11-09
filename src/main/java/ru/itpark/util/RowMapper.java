package ru.itpark.util;

import java.sql.ResultSet;

public interface RowMapper<T> {
    T map(ResultSet resultSet);
}
