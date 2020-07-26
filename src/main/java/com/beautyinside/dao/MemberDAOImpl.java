package com.beautyinside.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.beautyinside.vo.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{
	@Inject
    private SqlSession sqlSession;
    
    private static final String Namespace = "com.beautyinside.mapper.memberMapper";
    
    @Override
    public List<MemberVO> selectMember() throws Exception {
 
        return sqlSession.selectList(Namespace+".selectMember");
    }
 
}
