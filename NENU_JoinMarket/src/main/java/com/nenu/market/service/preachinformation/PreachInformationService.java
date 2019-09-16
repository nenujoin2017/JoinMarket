package com.nenu.market.service.preachinformation;

import com.nenu.market.entity.PreachInformation.PreachInformation;

import java.util.List;

/**
 * @Author: xinlee
 * @Description:
 * @Date: 20:49 2019/7/18
 */
public interface PreachInformationService {

    public List<PreachInformation> listAll() throws Exception;

    public List<PreachInformation> listByName(String unitName) throws Exception;

    public boolean addUser(PreachInformation preachInformation) throws Exception;

    public List<PreachInformation> searchByTime(String presentationTime) throws Exception;

    public boolean updateAdvocate(String advocate, String presentationTime) throws Exception;

    public boolean updateRecruitmentPosition(String recruitmentPosition, String presentationTime) throws Exception;

    public boolean updateSigning(String signing, String presentationTime) throws Exception;

    public boolean updatePlace(String place, String presentationTime) throws Exception;
}