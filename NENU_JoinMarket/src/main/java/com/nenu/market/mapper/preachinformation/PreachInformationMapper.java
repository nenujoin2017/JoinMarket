package com.nenu.market.mapper.preachinformation;

import com.nenu.market.entity.PreachInformation.PreachInformation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: xinlee
 * @Description:
 * @Date: 20:36 2019/7/18
 */
@Mapper
@Repository
public interface PreachInformationMapper {

    public List<PreachInformation> listAll() throws Exception;

    public List<PreachInformation> listByName(@Param("unitName") String unitName) throws Exception;

    public boolean addPreachInformation(@Param("PreachInformation") PreachInformation preachInformation) throws Exception;

    public List<PreachInformation> searchByTime(@Param("presentationTime") String presentationTime) throws Exception;

    public boolean updateAdvocate(@Param("advocate") String advocate, @Param("presentationTime") String presentationTime);

    public boolean updateRecruitmentPosition(@Param("recruitmentPosition") String recruitmentPosition, @Param("presentationTime") String presentationTime);

    public boolean updateSigning(@Param("signing") String signing, @Param("presentationTime") String presentationTime);

    public boolean updatePlace(@Param("place") String place, @Param("presentationTime") String presentationTime);
}
