package com.d24hostels.bo.custom;

import com.d24hostels.bo.SuperBo;
import com.d24hostels.dto.StudentDto;

public interface StudentBo extends SuperBo {
    void saveStudent(StudentDto studentDto) throws Exception;
    void updateStudent(StudentDto studentDto) throws Exception;
    void deleteStudent(String stId) throws Exception;
    void getAllStudents() throws Exception;
    StudentDto searchStudents(String stId) throws Exception;
}
