package com.atguigu.clients;

import com.atguigu.param.ProductCollectParam;
import com.atguigu.param.ProductIdParam;
import com.atguigu.param.ProductSaveParam;
import com.atguigu.pojo.Product;
import com.atguigu.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * projectName: b2c-store
 * <p>
 * description: Commodity service call client
 */
@FeignClient(value = "product-service")
public interface ProductClient {

    /**
     * Search service calls, all data queries! Used to search database synchronization data!
     * @return
     */
    @GetMapping("/product/list")
    List<Product> allList();

    @PostMapping("/product/collect/list")
    R productIds(@RequestBody ProductCollectParam productCollectParam);

    @PostMapping("/product/cart/detail")
    Product productDetail(@RequestBody ProductIdParam productIdParam);

    @PostMapping("/product/cart/list")
    List<Product> cartList(@RequestBody ProductCollectParam productCollectParam);

    @PostMapping("/product/admin/count")
    Long adminCount(@RequestBody Integer categoryId);

    @PostMapping("/product/admin/save")
    R adminCount(@RequestBody ProductSaveParam productSaveParam);

    @PostMapping("/product/admin/update")
    R adminUpdate(@RequestBody Product product);

    @PostMapping("/product/admin/remove")
    R adminRemove(@RequestBody Integer productId);
}
