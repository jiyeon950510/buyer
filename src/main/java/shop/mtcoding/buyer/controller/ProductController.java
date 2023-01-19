package shop.mtcoding.buyer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import shop.mtcoding.buyer.model.Product;
import shop.mtcoding.buyer.model.ProductRepository;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping({ "/", "/product" })
    public String home(Model model) {
        List<Product> produtList = productRepository.findAll();
        model.addAttribute("productList", produtList);
        return "product/list";
    }

    @GetMapping("/product/{id}")
    public String detailProduct(@PathVariable int id, Model model) {
        Product product = productRepository.findById(id);
        model.addAttribute("product", product);
        return "product/detail";
    }

    @PostMapping("/product/{id}/order")
    public String result(@PathVariable int id, int qty_n) {
        int result = productRepository.updateByQty(id, qty_n);
        if (result == 1) {
            return "redirect:/product/";
        } else {
            return "redirect:/product/detail";
        }
    }
}
