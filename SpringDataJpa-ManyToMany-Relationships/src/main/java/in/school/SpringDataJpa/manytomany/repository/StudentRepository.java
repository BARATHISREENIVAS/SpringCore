package in.school.SpringDataJpa.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.school.SpringDataJpa.manytomany.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, String>{

}
