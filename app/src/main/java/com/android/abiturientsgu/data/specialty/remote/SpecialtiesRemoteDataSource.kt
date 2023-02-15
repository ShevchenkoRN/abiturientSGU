package com.android.abiturientsgu.data.specialty.remote

import com.android.abiturientsgu.data.core.network.RetrofitServices
import com.android.abiturientsgu.domain.models.Specialty
import toSpecialty

interface SpecialtiesRemoteDataSource {
    suspend fun getSpecialities(): Result<List<Specialty>>
    suspend fun getSpeciality(id:Int): Result<Specialty>
}

class SpecialtiesRemoteDataSourceImpl(private val rService: RetrofitServices) :
    SpecialtiesRemoteDataSource {

    override suspend fun getSpecialities(): Result<List<Specialty>> =
        try {
            Result.success(rService.GetSpecialties().map { it.toSpecialty() })
        } catch (e: Exception) {
            Result.failure(e)
        }

    override suspend fun getSpeciality(id: Int): Result<Specialty> =
        try {
            Result.success(rService.GetSpecialtyInfo(id).toSpecialty())
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

