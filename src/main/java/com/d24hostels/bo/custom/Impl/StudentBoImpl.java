package com.d24hostels.bo.custom.Impl;

import com.d24hostels.bo.custom.StudentBo;
import com.d24hostels.dao.DAOFactory;
import com.d24hostels.dao.custom.StudentDao;
import com.d24hostels.dto.*;
import com.d24hostels.entity.*;

import java.util.ArrayList;
import java.util.List;

public class StudentBoImpl implements StudentBo {
    StudentDao studentDao = (StudentDao) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.STUDENT);

    @Override
    public void saveStudent(StudentDto studentDto) throws Exception {
        studentDao.save(new Student(
                        studentDto.getSid(),
                        studentDto.getName(),
                        studentDto.getNic(),
                        studentDto.getGender(),
                        studentDto.getGuardian(),
                        studentDto.getContact(),
                        studentDto.getEmail(),
                        studentDto.getRegDate(),
                        new University(studentDto.getUniversityDto().getUniName())
                )
        );
    }

    @Override
    public void updateStudent(StudentDto studentDto) throws Exception {
        studentDao.update(new Student(
                        studentDto.getSid(),
                        studentDto.getName(),
                        studentDto.getNic(),
                        studentDto.getGender(),
                        studentDto.getGuardian(),
                        studentDto.getContact(),
                        studentDto.getEmail(),
                        studentDto.getRegDate(),
                        new University(studentDto.getUniversityDto().getUniName())
                )
        );
    }

    @Override
    public void deleteStudent(String stId) throws Exception {
        studentDao.delete(stId);
    }

    @Override
    public List<StudentDto> getAllStudents() throws Exception {
        List<Student> all = studentDao.getAll();
        List<StudentDto> studentDtos = new ArrayList<>();
        for (Student student : all) {
            StudentDto studentDto = new StudentDto(
                    student.getSid(),
                    student.getName(),
                    student.getNic(),
                    student.getGender(),
                    student.getGuardian(),
                    student.getContact(),
                    student.getEmail(),
                    student.getRegDate(),
                    new UniversityDto(student.getUniversity().getUniName())
            );
            studentDtos.add(studentDto);
        }

        return studentDtos;
    }

    @Override
    public StudentDto searchStudents(String stId) throws Exception {
        Student search = studentDao.search(stId);
        StudentDto studentDto = new StudentDto(
                search.getSid(),
                search.getName(),
                search.getNic(),
                search.getGender(),
                search.getGuardian(),
                search.getContact(),
                search.getEmail(),
                search.getRegDate(),
                new UniversityDto(search.getUniversity().getUniName())
        );
        return studentDto;
    }
}
