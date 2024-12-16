package com.example.activity10.repository

import com.example.activity10.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)

    //Dari sini
    fun getAllMhs(): Flow<List<Mahasiswa>>

}