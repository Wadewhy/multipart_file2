package xyz.wadewhy.multipart_file2;

import cn.hutool.http.HttpRequest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.wadewhy.multipart_file2.utils.WebUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLDecoder;

@SpringBootTest
class MultipartFile2ApplicationTests {

    @Test
    void contextLoads() {
    }

    /**
     * 获取可见获取的是编译后的classes目录中的包名的文件夹的路径
     * target
     * 例如：
     * localPath = /F:/MyIdeaProgram/项目经验/图片上传/multipart_file2/target/test-classes/xyz/wadewhy/multipart_file2/
     */
    @Test
    void test01() throws UnsupportedEncodingException {
        //获取当前文件所在的路径
        String localPath = this.getClass().getResource("").getPath();
        System.err.println("localPath = " + URLDecoder.decode(localPath, "UTF-8"));
    }
    @Test
    void test02() throws IOException {
        File file = new File("A");
        //A
        System.err.println(file.getPath());
        //绝对路径
        //F:\MyIdeaProgram\项目经验\图片上传\multipart_file2\A
        System.err.println(file.getAbsolutePath());
        //规范化路径
        //F:\MyIdeaProgram\项目经验\图片上传\multipart_file2
        File file1 = new File("");
        System.err.println(file1.getCanonicalPath());
    }

    /**
     *  F:\MyIdeaProgram\项目经验\图片上传\multipart_file2\src\main\webapp
     * @throws IOException
     */
    @Test
    void test03() {
        HttpServletRequest request = WebUtils.getRequest();
        //F:\MyIdeaProgram\项目经验\图片上传\multipart_file2\src\main\webapp
        String path1 = request.getSession().getServletContext().getRealPath("/");
        System.err.println("path:----------->"+path1);
    }
    @Test
    void test04(){
        HttpServletRequest request = WebUtils.getRequest();
        //F:\MyIdeaProgram\项目经验\图片上传\multipart_file2\src\main\webapp
        String path1 = request.getSession().getServletContext().getRealPath("multipart_file2");
        System.err.println("path:----------->"+path1);
    }


}
