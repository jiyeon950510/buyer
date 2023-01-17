package shop.mtcoding.buyer.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

/*
 * 회원가입, 로그인, 회원탈퇴, 회원수정
 */
@Mapper
public interface ProductRepository { // CRUD
    public int insert(String name, int price, int qty);

    public List<Product> findAll();

    public Product findById(int id);

    public int updateById(String name, int price, int qty);

    public int deleteById(int id);
}
