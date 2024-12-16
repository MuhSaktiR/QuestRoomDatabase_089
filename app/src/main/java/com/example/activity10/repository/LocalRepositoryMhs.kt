package com.example.activity10.repository

import com.example.activity10.data.dao.MahasiswaDao
import com.example.activity10.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

class LocalRepositoryMhs (
    private val mahasiswaDao: MahasiswaDao
    ) : RepositoryMhs {
    override suspend fun insertMhs(mahasiswa: Mahasiswa) {
        mahasiswaDao.insertMahasiswa(mahasiswa)
    }

    //Dari sini
    override fun getAllMhs(): Flow<List<Mahasiswa>> {
        return mahasiswaDao.getAllMahasiswa()
    }

    override fun getMhs(nim: String): Flow<Mahasiswa> {
        return mahasiswaDao.getMahasiswa(nim)
    }

    override suspend fun deleteMhs(mahasiswa: Mahasiswa) {
        mahasiswaDao.deleteMahasiswa(mahasiswa)
    }

    override suspend fun updateMhs(mahasiswa: Mahasiswa) {
        mahasiswaDao.updateMahasiswa(mahasiswa)
    }
}