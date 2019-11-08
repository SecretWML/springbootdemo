import com.demo.TestApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= TestApplication.class)
public class RedisHashTests {

  @Autowired
  private StringRedisTemplate stringRedisTemplate;

  @Test
  public void hashPutResitTest() {
    // map的key值相同，后添加的覆盖原有的
    stringRedisTemplate.opsForHash().put("banks:12600000", "a", "b");
  }

  @Test
  public void hashGetEntiresResitTest() {
    // 获取map对象
    Map<Object, Object> map = stringRedisTemplate.opsForHash().entries("banks:12600000");
    System.out.println("objects:{}" + map);
  }

  @Test
  public void hashGeDeleteResitTest() {
    // 根据map的key删除这个元素
    stringRedisTemplate.opsForHash().delete("banks:12600000", "c");
  }

  @Test
  public void hashGetKeysResitTest() {
    // 获得map的key集合
    Set<Object> objects = stringRedisTemplate.opsForHash().keys("banks:12600000");
    System.out.println("objects:{}" + objects);
  }

  @Test
  public void hashGetValueListResitTest() {
    // 获得map的value列表
    List<Object> objects = stringRedisTemplate.opsForHash().values("banks:12600000");
    System.out.println("objects:{}" + objects);
  }

  @Test
  public void hashSize() { // 获取map对象大小
    long size = stringRedisTemplate.opsForHash().size("banks:12600000");
    System.out.println("size:{}" + size);
  }
}
