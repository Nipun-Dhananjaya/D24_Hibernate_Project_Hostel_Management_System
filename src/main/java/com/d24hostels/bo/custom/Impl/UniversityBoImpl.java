package com.d24hostels.bo.custom.Impl;

import com.d24hostels.bo.custom.UniversityBo;
import com.d24hostels.dao.DAOFactory;
import com.d24hostels.dao.custom.UniversityDao;
import com.d24hostels.dto.UniversityDto;
import com.d24hostels.entity.University;

import java.util.ArrayList;
import java.util.List;

public class UniversityBoImpl implements UniversityBo {
    UniversityDao universityDao= (UniversityDao) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.UNIVERSITY);
    @Override
    public void saveUniversity(UniversityDto universityDto) throws Exception {
        universityDao.save(new University(universityDto.getUniName()));
    }

    @Override
    public List<UniversityDto> getAllUniversities() throws Exception {
        List<University> universities=universityDao.getAll();
        List<UniversityDto> universityDtos=new ArrayList<>();

        for (University university : universities) {
            universityDtos.add(new UniversityDto(
                    university.getUniName()
                    )
            );
        }

        return universityDtos;
    }
}
