package com.d24hostels.bo.custom;

import com.d24hostels.bo.SuperBo;
import com.d24hostels.dto.UniversityDto;

public interface UniversityBo extends SuperBo {
    void saveUniversity(UniversityDto universityDto) throws Exception;
}
