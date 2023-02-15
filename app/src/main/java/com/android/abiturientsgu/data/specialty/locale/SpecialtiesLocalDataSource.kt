package com.android.abiturientsgu.data.specialty.locale

import com.android.abiturientsgu.data.events.locale.EventEntity
import kotlinx.coroutines.flow.Flow

interface SpecialtiesLocalDataSource {
    fun getAll(): Flow<List<SpecialtyEntity>>
    fun getById(id: Int): Flow<SpecialtyEntity>
    suspend fun insertAll(specialties: List<SpecialtyEntity>)
    suspend fun insert(specialty: SpecialtyEntity)
    suspend fun deleteAll()

}

class SpecialtiesLocalDataSourceImpl(private val specialtyDao:  SpecialtyDao):SpecialtiesLocalDataSource{
    override fun getAll(): Flow<List<SpecialtyEntity>> = specialtyDao.getAllSpecialties()

    override fun getById(id: Int): Flow<SpecialtyEntity> = specialtyDao.getSpecialtyById(id)

    override suspend fun insertAll(specialties: List<SpecialtyEntity>) {
        specialtyDao.insertAll(specialties)
    }

    override suspend fun insert(specialty: SpecialtyEntity) {
        specialtyDao.insert(specialty)
    }

    override suspend fun deleteAll() {
        specialtyDao.deleteAll()
    }

}