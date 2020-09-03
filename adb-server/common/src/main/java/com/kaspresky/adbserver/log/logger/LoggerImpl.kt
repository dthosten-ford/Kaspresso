package com.kaspresky.adbserver.log.logger

import com.kaspresky.adbserver.log.fulllogger.FullLogger
import java.lang.Exception

internal class LoggerImpl(
    private val tag: String?,
    private val deviceName: String? = null,
    private val fullLogger: FullLogger
) : Logger {

    override fun i(text: String) {
        fullLogger.log(
            logLevel = FullLogger.LogLevel.INFO,
            deviceName = deviceName,
            tag = tag,
            text = text
        )
    }

    override fun d(text: String) {
        fullLogger.log(
            logLevel = FullLogger.LogLevel.DEBUG,
            deviceName = deviceName,
            tag = tag,
            text = text
        )
    }

    override fun d(method: String, text: String) {
        fullLogger.log(
            logLevel = FullLogger.LogLevel.DEBUG,
            deviceName = deviceName,
            tag = tag,
            method = method,
            text = text
        )
    }

    override fun e(exception: Exception) {
        fullLogger.log(
            logLevel = FullLogger.LogLevel.ERROR,
            deviceName = deviceName,
            tag = tag,
            text = exception.toString()
        )
    }

    override fun e(text: String) {
        fullLogger.log(
            logLevel = FullLogger.LogLevel.ERROR,
            deviceName = deviceName,
            tag = tag,
            text = text
        )
    }

    override fun e(method: String, exception: Exception) {
        fullLogger.log(
            logLevel = FullLogger.LogLevel.ERROR,
            deviceName = deviceName,
            tag = tag,
            method = method,
            text = exception.toString()
        )
    }

    override fun e(method: String, text: String) {
        fullLogger.log(
            logLevel = FullLogger.LogLevel.ERROR,
            deviceName = deviceName,
            tag = tag,
            method = method,
            text = text
        )
    }
}
