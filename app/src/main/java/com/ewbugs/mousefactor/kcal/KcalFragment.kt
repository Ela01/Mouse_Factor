package com.ewbugs.mousefactor.kcal

//import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ewbugs.mousefactor.databinding.FragmentKcalBinding

class KcalFragment : Fragment() {


    private lateinit var binding: FragmentKcalBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentKcalBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpClickListeners()




    }
    private fun setUpClickListeners(){

//        binding.containerTime1.setOnClickListener { launchTimeRecordScreen("seconds") }
//        binding.containerTime2.setOnClickListener { launchTimeRecordScreen("hours") }
//        binding.containerTime3.setOnClickListener { launchTimeRecordScreen("days") }
//        binding.containerTime4.setOnClickListener { launchTimeRecordScreen("weeks") }
//        binding.containerTime5.setOnClickListener { launchTimeRecordScreen("years") }


    }




}