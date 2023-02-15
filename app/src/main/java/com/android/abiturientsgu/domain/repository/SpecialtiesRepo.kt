package com.android.abiturientsgu.domain.repository

import com.android.abiturientsgu.domain.models.Specialty
import kotlinx.coroutines.flow.Flow

interface SpecialtiesRepo {
    suspend fun fetchSpecialties(): Flow<List<Specialty>>
    suspend fun fetchSpecialty(id:Int):Flow<Specialty>

}