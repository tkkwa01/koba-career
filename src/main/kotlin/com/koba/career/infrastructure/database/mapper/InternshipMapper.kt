/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.koba.career.infrastructure.database.mapper

import com.koba.career.infrastructure.database.record.InternshipRecord
import org.apache.ibatis.annotations.DeleteProvider
import org.apache.ibatis.annotations.InsertProvider
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Result
import org.apache.ibatis.annotations.ResultMap
import org.apache.ibatis.annotations.Results
import org.apache.ibatis.annotations.SelectProvider
import org.apache.ibatis.annotations.UpdateProvider
import org.apache.ibatis.type.JdbcType
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider
import org.mybatis.dynamic.sql.util.SqlProviderAdapter

@Mapper
interface InternshipMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    fun count(selectStatement: SelectStatementProvider): Long

    @DeleteProvider(type=SqlProviderAdapter::class, method="delete")
    fun delete(deleteStatement: DeleteStatementProvider): Int

    @InsertProvider(type=SqlProviderAdapter::class, method="insert")
    fun insert(insertStatement: InsertStatementProvider<InternshipRecord>): Int

    @InsertProvider(type=SqlProviderAdapter::class, method="insertMultiple")
    fun insertMultiple(multipleInsertStatement: MultiRowInsertStatementProvider<InternshipRecord>): Int

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("InternshipRecordResult")
    fun selectOne(selectStatement: SelectStatementProvider): InternshipRecord?

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="InternshipRecordResult", value = [
        Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        Result(column="company", property="company", jdbcType=JdbcType.VARCHAR),
        Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        Result(column="salary", property="salary", jdbcType=JdbcType.INTEGER),
        Result(column="period", property="period", jdbcType=JdbcType.VARCHAR),
        Result(column="selection", property="selection", jdbcType=JdbcType.VARCHAR),
        Result(column="deadline", property="deadline", jdbcType=JdbcType.VARCHAR),
        Result(column="contributor", property="contributor", jdbcType=JdbcType.VARCHAR),
        Result(column="futureJob", property="futurejob", jdbcType=JdbcType.VARCHAR),
        Result(column="method", property="method", jdbcType=JdbcType.VARCHAR),
        Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        Result(column="detail", property="detail", jdbcType=JdbcType.LONGVARCHAR),
        Result(column="flow", property="flow", jdbcType=JdbcType.LONGVARCHAR)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<InternshipRecord>

    @UpdateProvider(type=SqlProviderAdapter::class, method="update")
    fun update(updateStatement: UpdateStatementProvider): Int
}