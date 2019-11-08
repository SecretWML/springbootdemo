import com.demo.TestApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= TestApplication.class)
public class RedisValueTests {

  @Autowired
  private StringRedisTemplate stringRedisTemplate;

  @Autowired
  private RedisTemplate redisTemplate;

  @Test
  public void testString() throws Exception {
    // 保存字符串
    stringRedisTemplate.opsForValue().set("aaa", "111");
    Assert.assertEquals("111", stringRedisTemplate.opsForValue().get("aaa"));
  }

  //这一步跟上面使用Spring一样，只需要将POJO类实现Serializable接口就可以了
  @Test
  public void testObject()  throws Exception {
    User user = new User();
    user.setName("zhanglulu");
    user.setAge(21);

    redisTemplate.opsForValue().set("user_1",user);
    User user1 =(User) redisTemplate.opsForValue().get("user_1");
    System.out.println(user1.toString());
  }

  //操作集合(List和Hash) 见其他


//  @Test
//  public void redisTester() {
//    Jedis jedis = new Jedis("localhost", 6379, 100000);
//    int i = 0;
//    try {
//      long start = System.currentTimeMillis();// 开始毫秒数
//      while (true) {
//        long end = System.currentTimeMillis();
//        if (end - start >= 1000) {// 当大于等于1000毫秒（相当于1秒）时，结束操作
//          break;
//        }
//        i++;
//        jedis.set("test" + i, i + "");
//      }
//    } finally {// 关闭连接
//      jedis.close();
//    }
//    // 打印1秒内对Redis的操作次数
//    System.out.println("redis每秒操作：" + i + "次");
//  }
}
