package com.nurbk.ps.projectm.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.nurbk.ps.projectm.repository.IncomingCallRepository

class IncomingCallViewModel(application: Application) : AndroidViewModel(application) {

    val incomingRepository = IncomingCallRepository(application.applicationContext)

    fun getCall() = incomingRepository.getIncomingCall();
}