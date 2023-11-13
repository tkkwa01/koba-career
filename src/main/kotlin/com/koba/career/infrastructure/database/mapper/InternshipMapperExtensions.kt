/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.koba.career.infrastructure.database.mapper

import com.koba.career.infrastructure.database.mapper.InternshipDynamicSqlSupport.Internship
import com.koba.career.infrastructure.database.mapper.InternshipDynamicSqlSupport.Internship.company
import com.koba.career.infrastructure.database.mapper.InternshipDynamicSqlSupport.Internship.contributor
import com.koba.career.infrastructure.database.mapper.InternshipDynamicSqlSupport.Internship.createdAt
import com.koba.career.infrastructure.database.mapper.InternshipDynamicSqlSupport.Internship.deadline
import com.koba.career.infrastructure.database.mapper.InternshipDynamicSqlSupport.Internship.detail
import com.koba.career.infrastructure.database.mapper.InternshipDynamicSqlSupport.Internship.flow
import com.koba.career.infrastructure.database.mapper.InternshipDynamicSqlSupport.Internship.futurejob
import com.koba.career.infrastructure.database.mapper.InternshipDynamicSqlSupport.Internship.id
import com.koba.career.infrastructure.database.mapper.InternshipDynamicSqlSupport.Internship.method
import com.koba.career.infrastructure.database.mapper.InternshipDynamicSqlSupport.Internship.period
import com.koba.career.infrastructure.database.mapper.InternshipDynamicSqlSupport.Internship.salary
import com.koba.career.infrastructure.database.mapper.InternshipDynamicSqlSupport.Internship.selection
import com.koba.career.infrastructure.database.mapper.InternshipDynamicSqlSupport.Internship.title
import com.koba.career.infrastructure.database.mapper.InternshipDynamicSqlSupport.Internship.updatedAt
import com.koba.career.infrastructure.database.record.InternshipRecord
import org.mybatis.dynamic.sql.SqlBuilder.isEqualTo
import org.mybatis.dynamic.sql.util.kotlin.*
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.*

fun InternshipMapper.count(completer: CountCompleter) =
    countFrom(this::count, Internship, completer)

fun InternshipMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, Internship, completer)

fun InternshipMapper.deleteByPrimaryKey(id_: Int) =
    delete {
        where(id, isEqualTo(id_))
    }

fun InternshipMapper.insert(record: InternshipRecord) =
    insert(this::insert, record, Internship) {
        map(id).toProperty("id")
        map(company).toProperty("company")
        map(title).toProperty("title")
        map(salary).toProperty("salary")
        map(period).toProperty("period")
        map(selection).toProperty("selection")
        map(deadline).toProperty("deadline")
        map(contributor).toProperty("contributor")
        map(futurejob).toProperty("futurejob")
        map(method).toProperty("method")
        map(createdAt).toProperty("createdAt")
        map(updatedAt).toProperty("updatedAt")
        map(detail).toProperty("detail")
        map(flow).toProperty("flow")
    }

fun InternshipMapper.insertMultiple(records: Collection<InternshipRecord>) =
    insertMultiple(this::insertMultiple, records, Internship) {
        map(id).toProperty("id")
        map(company).toProperty("company")
        map(title).toProperty("title")
        map(salary).toProperty("salary")
        map(period).toProperty("period")
        map(selection).toProperty("selection")
        map(deadline).toProperty("deadline")
        map(contributor).toProperty("contributor")
        map(futurejob).toProperty("futurejob")
        map(method).toProperty("method")
        map(createdAt).toProperty("createdAt")
        map(updatedAt).toProperty("updatedAt")
        map(detail).toProperty("detail")
        map(flow).toProperty("flow")
    }

fun InternshipMapper.insertMultiple(vararg records: InternshipRecord) =
    insertMultiple(records.toList())

fun InternshipMapper.insertSelective(record: InternshipRecord) =
    insert(this::insert, record, Internship) {
        map(id).toPropertyWhenPresent("id", record::id)
        map(company).toPropertyWhenPresent("company", record::company)
        map(title).toPropertyWhenPresent("title", record::title)
        map(salary).toPropertyWhenPresent("salary", record::salary)
        map(period).toPropertyWhenPresent("period", record::period)
        map(selection).toPropertyWhenPresent("selection", record::selection)
        map(deadline).toPropertyWhenPresent("deadline", record::deadline)
        map(contributor).toPropertyWhenPresent("contributor", record::contributor)
        map(futurejob).toPropertyWhenPresent("futurejob", record::futurejob)
        map(method).toPropertyWhenPresent("method", record::method)
        map(createdAt).toPropertyWhenPresent("createdAt", record::createdAt)
        map(updatedAt).toPropertyWhenPresent("updatedAt", record::updatedAt)
        map(detail).toPropertyWhenPresent("detail", record::detail)
        map(flow).toPropertyWhenPresent("flow", record::flow)
    }

private val columnList = listOf(id, company, title, salary, period, selection, deadline, contributor, futurejob, method, createdAt, updatedAt, detail, flow)

fun InternshipMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, Internship, completer)

fun InternshipMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, Internship, completer)

fun InternshipMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, Internship, completer)

fun InternshipMapper.selectByPrimaryKey(id_: Int) =
    selectOne {
        where(id, isEqualTo(id_))
    }

fun InternshipMapper.update(completer: UpdateCompleter) =
    update(this::update, Internship, completer)

fun KotlinUpdateBuilder.updateAllColumns(record: InternshipRecord) =
    apply {
        set(id).equalTo(record::id)
        set(company).equalTo(record::company)
        set(title).equalTo(record::title)
        set(salary).equalTo(record::salary)
        set(period).equalTo(record::period)
        set(selection).equalTo(record::selection)
        set(deadline).equalTo(record::deadline)
        set(contributor).equalTo(record::contributor)
        set(futurejob).equalTo(record::futurejob)
        set(method).equalTo(record::method)
        set(createdAt).equalTo(record::createdAt)
        set(updatedAt).equalTo(record::updatedAt)
        set(detail).equalTo(record::detail)
        set(flow).equalTo(record::flow)
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(record: InternshipRecord) =
    apply {
        set(id).equalToWhenPresent(record::id)
        set(company).equalToWhenPresent(record::company)
        set(title).equalToWhenPresent(record::title)
        set(salary).equalToWhenPresent(record::salary)
        set(period).equalToWhenPresent(record::period)
        set(selection).equalToWhenPresent(record::selection)
        set(deadline).equalToWhenPresent(record::deadline)
        set(contributor).equalToWhenPresent(record::contributor)
        set(futurejob).equalToWhenPresent(record::futurejob)
        set(method).equalToWhenPresent(record::method)
        set(createdAt).equalToWhenPresent(record::createdAt)
        set(updatedAt).equalToWhenPresent(record::updatedAt)
        set(detail).equalToWhenPresent(record::detail)
        set(flow).equalToWhenPresent(record::flow)
    }

fun InternshipMapper.updateByPrimaryKey(record: InternshipRecord) =
    update {
        set(company).equalTo(record::company)
        set(title).equalTo(record::title)
        set(salary).equalTo(record::salary)
        set(period).equalTo(record::period)
        set(selection).equalTo(record::selection)
        set(deadline).equalTo(record::deadline)
        set(contributor).equalTo(record::contributor)
        set(futurejob).equalTo(record::futurejob)
        set(method).equalTo(record::method)
        set(createdAt).equalTo(record::createdAt)
        set(updatedAt).equalTo(record::updatedAt)
        set(detail).equalTo(record::detail)
        set(flow).equalTo(record::flow)
        where(id, isEqualTo(record::id))
    }

fun InternshipMapper.updateByPrimaryKeySelective(record: InternshipRecord) =
    update {
        set(company).equalToWhenPresent(record::company)
        set(title).equalToWhenPresent(record::title)
        set(salary).equalToWhenPresent(record::salary)
        set(period).equalToWhenPresent(record::period)
        set(selection).equalToWhenPresent(record::selection)
        set(deadline).equalToWhenPresent(record::deadline)
        set(contributor).equalToWhenPresent(record::contributor)
        set(futurejob).equalToWhenPresent(record::futurejob)
        set(method).equalToWhenPresent(record::method)
        set(createdAt).equalToWhenPresent(record::createdAt)
        set(updatedAt).equalToWhenPresent(record::updatedAt)
        set(detail).equalToWhenPresent(record::detail)
        set(flow).equalToWhenPresent(record::flow)
        where(id, isEqualTo(record::id))
    }