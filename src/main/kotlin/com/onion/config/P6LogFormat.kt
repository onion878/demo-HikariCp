package com.onion.config

import com.p6spy.engine.common.P6Util
import com.p6spy.engine.spy.appender.SingleLineFormat
import org.hibernate.engine.jdbc.internal.BasicFormatterImpl

class P6LogFormat : SingleLineFormat() {

    private val formatter = BasicFormatterImpl()

    override fun formatMessage(connectionId: Int, now: String?, elapsed: Long, category: String?, prepared: String, sql: String): String {
        val t = Thread.currentThread()
        val log = now + "|" + t.name + "|" +
                "" + elapsed + "|" +
                "" + category + "|connection " +
                "" + connectionId + "|" +
                "\nAfter Prepared SQL:" + formatter.format(P6Util.singleLine(prepared)) +
                "\nBefore Prepared SQL:" + formatter.format(P6Util.singleLine(sql))
        println(log)
        return log
    }

}
