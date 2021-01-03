package com.nurbk.ps.projectm.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class CallingData(
    val type: String = "",
    val invitation: String = "",
    val meetingType: String = "",
    val inviterToken: String = "",
    val data: String = "",
    val registration_ids: String = "",
    val name: String = "",
    val email: String = ""
) : Parcelable

