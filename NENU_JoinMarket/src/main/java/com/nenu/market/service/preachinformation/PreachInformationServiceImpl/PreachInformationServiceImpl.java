package com.nenu.market.service.preachinformation.PreachInformationServiceImpl;

import com.nenu.market.entity.PreachInformation.PreachInformation;
import com.nenu.market.mapper.preachinformation.PreachInformationMapper;
import com.nenu.market.service.preachinformation.PreachInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: xinlee
 * @Description:
 * @Date: 20:50 2019/7/18
 */
@Service("preachInformationService")
public class PreachInformationServiceImpl implements PreachInformationService {
    @Autowired
    PreachInformationMapper preachInformationMapper;

    @Override
    public List<PreachInformation> listAll() throws Exception {
        List list=preachInformationMapper.listAll();
        return list;
    }

    @Override
    public boolean addUser(PreachInformation preachInformation) throws Exception {
        boolean flag=preachInformationMapper.addPreachInformation(preachInformation);
        return flag;
    }

    @Override
    public List<PreachInformation> searchByTime(String presentationTime) throws Exception {
        List list=preachInformationMapper.searchByTime(presentationTime);
        return list;
    }

    @Override
    public boolean updateAdvocate(String advocate, String presentationTime) throws Exception {
        boolean flag=preachInformationMapper.updateAdvocate(advocate,presentationTime);
        return flag;
    }

    @Override
    public boolean updateRecruitmentPosition(String recruitmentPosition, String presentationTime) throws Exception {
        boolean flag=preachInformationMapper.updateRecruitmentPosition(recruitmentPosition,presentationTime);
        return flag;
    }

    @Override
    public boolean updateSigning(String signing, String presentationTime) throws Exception {
        boolean flag=preachInformationMapper.updateSigning(signing,presentationTime);
        return flag;
    }

    @Override
    public boolean updatePlace(String place, String presentationTime) throws Exception {
        boolean flag=preachInformationMapper.updatePlace(place,presentationTime);
        return flag;
    }

}
