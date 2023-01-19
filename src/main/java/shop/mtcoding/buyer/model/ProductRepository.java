package shop.mtcoding.buyer.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/*
 * 회원가입, 로그인, 회원탈퇴, 회원수정
 */
@Mapper
public interface ProductRepository { // CRUD
    public int insert(@Param("name") String name, @Param("price") int price, @Param("qty") int qty);

    public List<Product> findAll();

    public Product findById(@Param("id") int id);

    public Product findByQty(@Param("qty") int qty);

    public int updateById(String name, int price, int qty);

    public int deleteById(@Param("id") int id);

    public int updateByQty(@Param("id") int id, @Param("qty_n") int qty_n);
}
