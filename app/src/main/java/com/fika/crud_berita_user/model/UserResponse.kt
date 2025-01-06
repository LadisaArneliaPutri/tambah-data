package com.fika.crud_berita_user.model

data class UserResponse(
    val success: Boolean,
    val data: List<ModelUser>
)
