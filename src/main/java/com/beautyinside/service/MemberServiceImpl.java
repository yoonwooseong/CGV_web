package com.beautyinside.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.beautyinside.dao.MemberDAO;
import com.beautyinside.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {
 
    @Inject
    private MemberDAO dao;
    
    @Override
    public List<MemberVO> selectMember() throws Exception {
 
        return dao.selectMember();
    }
 
}
