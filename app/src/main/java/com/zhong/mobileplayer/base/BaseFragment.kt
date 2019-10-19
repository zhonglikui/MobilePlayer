package com.zhong.mobileplayer.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.jetbrains.anko.AnkoLogger

/**
 * 所有fragment的基类
 */
abstract class BaseFragment : Fragment(),AnkoLogger {
    val log= AnkoLogger(this.javaClass)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    /**
     * fragment初始化
     */
    private fun init() {
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return initView()
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListener()
        initData()
    }

    /**
     * 数据初始化
     */
   open protected fun initData() {

    }

    /**
     * adapter及listener相关方法
     */
   open protected fun initListener() {

    }

    /**
     * 获取布局id
     */
    abstract fun initView(): View?
}