package cn.cjc.springboot.test;

import cn.cjc.springboot.domain.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.nio.charset.Charset;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void addUser() throws Exception {
        User user = new User(1, "debo", "杭州市");
        mvc.perform(MockMvcRequestBuilders.post("/user/add")
                .content(new ObjectMapper().writeValueAsString(user))
                .contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo((result) -> {
                    MockHttpServletResponse response = result.getResponse();
                    String content = response.getContentAsString(Charset.defaultCharset());
                    System.out.println("响应结果：" + content);
                });
    }

    @Test
    public void findAll() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/user/findAll").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo((result -> {
                    MockHttpServletResponse response = result.getResponse();
                    String content = response.getContentAsString(Charset.defaultCharset());
                    System.out.println("响应结果：" + content);
                }));
    }
}