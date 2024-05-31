package com.example.applicationasm.Data

import com.google.gson.annotations.SerializedName

data class RegisterReq (
    @SerializedName("name") val name : String,
    @SerializedName("email") val email: String,
    @SerializedName("pass") val pass : String
)
data class RegisterRes(
    @SerializedName("success") val success: Boolean,
    @SerializedName("msg") val msg : String
)