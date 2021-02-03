package com.example.android.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.android.navigation.databinding.FragmentTitleBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

/**
 * A simple [Fragment] subclass.
 * Use the [TitleFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TitleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding: FragmentTitleBinding = DataBindingUtil.inflate(inflater,
        R.layout.fragment_title, container, false)
        //The complete onClickListener with Navigation using createNavigateOnClickListener
        binding.playButton.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_gameFragment3))
        return binding.root
    }


}