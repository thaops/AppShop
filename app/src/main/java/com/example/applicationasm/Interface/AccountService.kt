package com.example.applicationasm.Interface

import com.example.applicationasm.Data.RegisterReq
import com.example.applicationasm.Data.RegisterRes
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface AccountService{
    @POST("account/register")
    suspend fun register(@Body registerReq :RegisterReq) :Response<RegisterRes>
}