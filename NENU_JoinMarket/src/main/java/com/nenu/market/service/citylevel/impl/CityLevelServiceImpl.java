package com.nenu.market.service.citylevel.impl;

import com.nenu.market.entity.citylevel.CityLevel;
import com.nenu.market.mapper.citylevel.CityLevelMapper;
import com.nenu.market.service.citylevel.CityLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service("CityLevelService")
public class CityLevelServiceImpl implements CityLevelService {
    @Autowired
    CityLevelMapper cityLevelMapper;

    @Override
    public List<CityLevel> listAllCityLevel() throws Exception{
        List<CityLevel> cityLevelList = Collections.emptyList();
        try{
            cityLevelList = cityLevelMapper.listAllCityLevel();
            for(int i=0;i<cityLevelList.size();i++){
                if(cityLevelList.get(i).getCityRank().equals("一线城市")){
                    cityLevelList.get(i).setCityGrading("A");
                    System.out.println("yes");
                }
                else if(cityLevelList.get(i).getCityRank().equals("新一线城市")){
                    cityLevelList.get(i).setCityGrading("B");
                }
                else if(cityLevelList.get(i).getCityRank().equals("二线城市")){
                    cityLevelList.get(i).setCityGrading("C");
                }
                else if(cityLevelList.get(i).getCityRank().equals("三线城市")){
                    cityLevelList.get(i).setCityGrading("D");
                }
                else if(cityLevelList.get(i).getCityRank().equals("四线城市")){
                    cityLevelList.get(i).setCityGrading("E");
                    System.out.println(cityLevelList.get(i).getCityGrading());
                }
                else if(cityLevelList.get(i).getCityRank().equals("其他情况")){
                    cityLevelList.get(i).setCityGrading("F");
                }
            }
        }catch (Exception e){
            System.out.println("列出所有城市分级出错");
            e.printStackTrace();
        }
        return cityLevelList;
    }

    @Override
    public void addCityLevel(CityLevel cityLevel) throws Exception{
        try{
            cityLevelMapper.addCityLevel(cityLevel);
        }catch (Exception e){
            System.out.println("增加城市分级出错");
        }
    }

    @Override
    public boolean deleteCityLevel(int id) throws Exception{
        return cityLevelMapper.deleteCityLevel(id);
    }

    @Override
    public void updateCityLevel(CityLevel cityLevel) throws Exception{
        try{
            cityLevelMapper.updateCityLevel(cityLevel);
        }catch (Exception e){
            System.out.println("增加城市分级出错");
        }
    }

    @Override
    public CityLevel searchCityLevelById(int id) throws Exception{
        return cityLevelMapper.searchCityLevelById(id);
    }

    @Override
    public List<CityLevel> searchCityLevel(String key) throws Exception{
        List<CityLevel> cityLevelList=cityLevelMapper.searchCityLevel(key);
        for(int i=0;i<cityLevelList.size();i++){
            if(cityLevelList.get(i).getCityRank().equals("一线城市")){
                cityLevelList.get(i).setCityGrading("A");
                System.out.println("yes");
            }
            else if(cityLevelList.get(i).getCityRank().equals("新一线城市")){
                cityLevelList.get(i).setCityGrading("B");
            }
            else if(cityLevelList.get(i).getCityRank().equals("二线城市")){
                cityLevelList.get(i).setCityGrading("C");
            }
            else if(cityLevelList.get(i).getCityRank().equals("三线城市")){
                cityLevelList.get(i).setCityGrading("D");
            }
            else if(cityLevelList.get(i).getCityRank().equals("四线城市")){
                cityLevelList.get(i).setCityGrading("E");
                System.out.println(cityLevelList.get(i).getCityGrading());
            }
            else if(cityLevelList.get(i).getCityRank().equals("其他情况")){
                cityLevelList.get(i).setCityGrading("F");
            }
        }
        return cityLevelList;
    }
}

