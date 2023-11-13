/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.koba.career.infrastructure.database.mapper

import java.sql.JDBCType
import java.time.LocalDateTime
import org.mybatis.dynamic.sql.SqlTable

object InternshipDynamicSqlSupport {
    object Internship : SqlTable("Internship") {
        val id = column<Int>("id", JDBCType.INTEGER)

        val company = column<String>("company", JDBCType.VARCHAR)

        val title = column<String>("title", JDBCType.VARCHAR)

        val salary = column<Int>("salary", JDBCType.INTEGER)

        val period = column<String>("period", JDBCType.VARCHAR)

        val selection = column<String>("selection", JDBCType.VARCHAR)

        val deadline = column<String>("deadline", JDBCType.VARCHAR)

        val contributor = column<String>("contributor", JDBCType.VARCHAR)

        val futurejob = column<String>("futureJob", JDBCType.VARCHAR)

        val method = column<String>("method", JDBCType.VARCHAR)

        val createdAt = column<LocalDateTime>("created_at", JDBCType.TIMESTAMP)

        val updatedAt = column<LocalDateTime>("updated_at", JDBCType.TIMESTAMP)

        val detail = column<String>("detail", JDBCType.LONGVARCHAR)

        val flow = column<String>("flow", JDBCType.LONGVARCHAR)
    }
}