import com.demo.TestApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= TestApplication.class)
public class RedisListTests {
  @Autowired
  private StringRedisTemplate stringRedisTemplate;

  // list数据类型适合于消息队列的场景:比如12306并发量太高，而同一时间段内只能处理指定数量的数据！必须满足先进先出的原则，其余数据处于等待
  @Test
  public void listPushResitTest() {
    // leftPush依次由右边添加
    stringRedisTemplate.opsForList().rightPush("myList", "1");
    stringRedisTemplate.opsForList().rightPush("myList", "2");
    stringRedisTemplate.opsForList().rightPush("myList", "A");
    stringRedisTemplate.opsForList().rightPush("myList", "B");
    // leftPush依次由左边添加
    stringRedisTemplate.opsForList().leftPush("myList", "0");
  }

  @Test
  public void listGetListResitTest() {
    // 查询类别所有元素
    List<String> listAll = stringRedisTemplate.opsForList().range("myList", 0, -1);
    System.out.println("list all "+ listAll);
    // 查询前3个元素
    List<String> list = stringRedisTemplate.opsForList().range("myList", 0, 3);
    System.out.println("list limit "+ list);
  }

  @Test
  public void listRemoveOneResitTest() {
    // 删除先进入的B元素
    stringRedisTemplate.opsForList().remove("myList", 1, "B");
  }

  @Test
  public void listRemoveAllResitTest() {
    // 删除所有A元素
    stringRedisTemplate.opsForList().remove("myList", 0, "A");
  }
}
