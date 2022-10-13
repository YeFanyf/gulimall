package com.yf.gulimall.product;

import com.yf.common.utils.PageUtils;
import com.yf.gulimall.product.entity.BrandEntity;
import com.yf.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();

        brandEntity.setName("yefan");
        brandService.save(brandEntity);
        System.out.println("====");
    }

}
