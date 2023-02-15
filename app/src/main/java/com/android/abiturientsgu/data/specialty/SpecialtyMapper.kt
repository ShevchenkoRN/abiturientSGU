import com.android.abiturientsgu.data.specialty.locale.SpecialtyEntity
import com.android.abiturientsgu.data.specialty.remote.SpecialtyDto
import com.android.abiturientsgu.domain.models.Specialty

fun SpecialtyDto.toSpecialty(): Specialty {
    val subjectsList  = subjects.split(";")
    val examsList  = exams.split(";")
    val spheresList  = spheres.split(";")
    val professionsList  = professions.split(";")

    return Specialty(
        id, specialty, code, form, years, description, subjectsList, examsList, spheresList, professionsList
    )
}

fun Specialty.toSpecialityEntity():SpecialtyEntity =
    SpecialtyEntity(
        id, specialty, code, form, years, description, subjects.joinToString(";"),
        exams.joinToString(";"), spheres.joinToString(";"), professions.joinToString(";")
    )

fun SpecialtyEntity.toSpecialty() =
    Specialty(
        id, specialty, code, form, years, description, subjects.split(";"),
        exams.split(";"), spheres.split(";"), professions.split(";")
    )