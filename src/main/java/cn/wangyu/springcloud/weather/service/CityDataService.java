package cn.wangyu.springcloud.weather.service;

import cn.wangyu.springcloud.weather.model.City;
import java.util.List;

/**
 * @Author wangyu
 * @Date 2019/10/12 14:20
 * @Version 1.0
 */
public interface CityDataService {

  /**
   * 获取城市列表
   */
  List<City> listCity();
}
