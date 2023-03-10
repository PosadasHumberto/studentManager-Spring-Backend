package org.humberto.studentmanagerspringbackend.repositories;

import org.humberto.studentmanagerspringbackend.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

    /*
    * This interface manage the basic methods to get a basic CRUD
    * to our Database
    * */

}
