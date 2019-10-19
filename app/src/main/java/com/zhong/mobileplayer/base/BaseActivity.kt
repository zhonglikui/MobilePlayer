package com.zhong.mobileplayer.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.jetbrains.anko.AnkoLogger

/**
 * 所有activity的基类
 */
abstract class BaseActivity : AppCompatActivity(),AnkoLogger {
    val log= AnkoLogger(this.javaClass)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        initListener()
        initData()
    }

    /**
     * 初始化数据
     */
    open protected fun initData() {
    }

    /**
     * 初始化listener
     */
    open protected fun initListener() {
    }

    /**
     * 获取layoutId
     */
    abstract fun getLayoutId(): Int
}