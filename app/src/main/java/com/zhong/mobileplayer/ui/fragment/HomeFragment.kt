package com.zhong.mobileplayer.ui.fragment

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.zhong.mobileplayer.R
import com.zhong.mobileplayer.adapter.HomeAdapter
import com.zhong.mobileplayer.base.BaseFragment
import com.zhong.mobileplayer.util.URLProviderUtils
import kotlinx.android.synthetic.main.fragment_home.*
import okhttp3.*
import org.jetbrains.anko.debug
import org.jetbrains.anko.error
import java.io.IOException

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [HomeFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : BaseFragment() {
    override fun initView(): View? {
        return View.inflate(context, R.layout.fragment_home, null)
    }

    override fun initListener() {
        super.initListener()
        home_recycler_view.layoutManager = LinearLayoutManager(context)
        val adapter = HomeAdapter()
        home_recycler_view.adapter = adapter
    }

    override fun initData() {
        super.initData()
        loadDatas()
    }

    private fun loadDatas() {
        val path = URLProviderUtils.getHomeUrl(0, 20)
        val client = OkHttpClient()
        val request = Request.Builder().url(path).get().build()
        log.debug(path)
        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                log.error(e.message)
            }

            override fun onResponse(call: Call, response: Response) {
                log.debug(response.body().toString())
            }
        })
    }

}
