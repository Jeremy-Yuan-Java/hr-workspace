package com.hrbc.business.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hrbc.business.domain.Majors;
import com.hrbc.business.domain.MajorsExample;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;
import com.hrbc.business.domain.enums.DelFlagE;
import com.hrbc.business.mapper.MajorsMapper;
import com.hrbc.business.service.MajorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class MajorsServiceImpl implements MajorsService {
    @Autowired
    private MajorsMapper mapper;

    @Override
    public Majors get(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int save(Majors entity) {

        if (entity != null && !StringUtils.isEmpty(entity.getId())) {
            return mapper.updateByPrimaryKeySelective(entity);
        } else {
            return mapper.insertSelective(entity);

        }
    }

    @Override
    public PageResultDTO loadPage(PageQueryParamDTO params) {

        long count = 0;
        List<Majors> list = null;
        int page = 1;
        int size = 10;
        if (params != null) {
            if (params.getPage() >= 0) {
                page = params.getPage();
            }
            if (params.getSize() >= 0) {
                size = params.getSize();
            }
            Majors dto = null;
            MajorsExample example = new MajorsExample();
            if (!StringUtils.isEmpty(params.getOrderby())) {
                example.setOrderByClause(params.getOrderby());
            }
            if (params.getQuery() != null) {
                dto = JSONObject.toJavaObject(params.getQuery(), Majors.class);
                example.createCriteria();
                if (dto.getDelflag() == null) {
                    example.getOredCriteria().get(0).andDelflagEqualTo(DelFlagE.NO.code);
                }
                if (dto.getDelflag() != null) {
                    example.getOredCriteria().get(0).andDelflagEqualTo(dto.getDelflag());

                }
            }
            count = mapper.countByExample(example);

            if (count > 0) {
                example.setOffset((page - 1) * size);
                example.setLimit(size);
                list = mapper.selectByExample(example);
            }
        }

        // 返回分页数据
        return new PageResultDTO(count, list);
    }

    @Override
    public int remove(Majors dto) {

        Majors delDto = new Majors();
        delDto.setId(dto.getId());
        delDto.setDelflag(DelFlagE.YES.code);

        return mapper.updateByPrimaryKeySelective(delDto);
    }

    @Override
    public int changeState(Majors dto) {

        return mapper.updateByPrimaryKeySelective(dto);
    }

    @Override
    public List<Majors> query(MajorsExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public void generateJSON() {

        MajorsExample example = new MajorsExample();
        List<Majors> list = mapper.selectByExample(example);
        Map<String,List<Majors>> map = list.stream().collect(Collectors.groupingBy(Majors::getParentid));
        JSONArray root = new JSONArray();

        map.get("0").forEach(n-> {
            JSONObject obj = new JSONObject();
            obj.put("value", n.getMarorsdesc());
            obj.put("label", n.getMarorsdesc());
            if(map.containsKey(n.getId().toString())){
                JSONArray subs = new JSONArray();
                map.get(n.getId().toString()).forEach(o->{
                    JSONObject subobj = new JSONObject();
                    subobj.put("value", o.getMarorsdesc());
                    subobj.put("label", o.getMarorsdesc());
                    subs.add(subobj);
                });
                obj.put("children", subs);


            }
            root.add(obj);
        });
        System.out.println(root.toJSONString());
    }
}
