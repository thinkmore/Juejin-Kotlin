package com.jetictors.futures.common.di

import java.lang.annotation.Documented
import java.lang.annotation.Retention

import javax.inject.Qualifier

import java.lang.annotation.RetentionPolicy.RUNTIME

/**
 * 创建者：邓浩宸
 * 时间 ：2017/3/21 10:52
 * 描述 ：TODO 请描述该类职责
 */
@Qualifier
@Documented
@Retention(RUNTIME)
annotation class ContextLife(val value: String = "Application")
