package com.itpeige.mfmall.product;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
public class MfmallProductApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void testUpload() throws FileNotFoundException {
        // yourEndpoint填写Bucket所在地域对应的Endpoint。以华东1（杭州）为例，Endpoint填写为https://oss-cn-hangzhou.aliyuncs.com。
        String endpoint = "https://oss-cn-beijing.aliyuncs.com";
        // 阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维，请登录RAM控制台创建RAM用户。。
        String accessKeyId = "LTAI4G9867r9vaFrsyLQ4sLb";
        String accessKeySecret = "m0HG2Xw8xwAIg36nEe10KlSlOinTIn";

        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        // 填写本地文件的完整路径。如果未指定本地路径，则默认从示例程序所属项目对应本地路径中上传文件流。
        InputStream inputStream = new FileInputStream("/Users/likepei/Downloads/mm.png");
        // 填写Bucket名称和Object完整路径。Object完整路径中不能包含Bucket名称。
        ossClient.putObject("mfmall-2021", "mm.png", inputStream);

        // 关闭OSSClient。
        ossClient.shutdown();

        System.out.println("上传成功...");
    }

}
