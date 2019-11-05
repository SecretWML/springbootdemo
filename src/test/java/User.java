import org.springframework.boot.test.context.TestComponent;

import java.io.Serializable;

@TestComponent
public class User implements Serializable {
 private String name;
 private int age;

  public User(){

  }
 public User(String name,int age){
   this.name = name;
   this.age = age;
 }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "User{" + "name='" + name + '\'' + ", age=" + age + '}';
  }
}
