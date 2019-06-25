package br.com.leonardomiyagi.draglayouttest

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

/**
 * Created by lmiyagi on 25/06/19.
 */
class PagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment {
        return TestFragment.newInstance()
    }

    override fun getCount(): Int = 3
}