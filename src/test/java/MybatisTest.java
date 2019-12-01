import com.ym.demo.Application;
import com.ym.demo.entity.User;
import com.ym.demo.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class MybatisTest {

    @Autowired
    private UserService userService;

    @Test
    public void testFindUserByUsername(){
        User user = userService.findUserByUsername("brucelee");
        Assert.assertEquals(user.getDescription(), "龙的传人");
    }
}
