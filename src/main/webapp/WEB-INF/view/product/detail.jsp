<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ include file="../layout/header.jsp" %>


        <h1>상품상세 페이지</h1>
        <hr />
        <table border="1">
            <tr>
                <th>번호</th>
                <th>상품명</th>
                <th>가격</th>
                <th>재고</th>
                <th>등록일</th>
            </tr>
            <tr>
                <td>${product.id}</td>
                <td><a href="/product/${product.id}">${product.name}</a></td>
                <td>${product.price}</td>
                <td>${product.qty}</td>
                <td>${product.createdAt}</td>
                <!-- id, name, price, qty, created_at -->
            </tr>
        </table>
        <form action="/product/${product.id}/order" method="post">
            <td><input type="number" name="qty_n" size="2"></td>
            <button type="submit">구매하기</button>
        </form>


        <%@ include file="../layout/footer.jsp" %>