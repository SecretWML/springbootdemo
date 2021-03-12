/*
 * Created on 2005-3-3
 */
package Utils;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author caili
 */
public class StringUtil {
  /**
   * 将d的field部分添加amount. 如果d==null, 返回null. field取值为Calendar中定义的值.
   *
   * @param d
   * @param field
   * @param amount
   * @return 日期
   */
  public static Date addDate(Date d, int field, int amount) {
    if (d == null) {
      return null;
    }
    Calendar c = new GregorianCalendar();
    c.setTime(d);
    c.add(field, amount);
    return c.getTime();
  }

  /**
   * 将date截取到日
   *
   * @param date
   * @return 日期
   */
  public static Date truncateToDate(Date date) {
    if (date == null) {
      return null;
    }
    Calendar c = new GregorianCalendar();
    c.setTime(date);
    int y = c.get(Calendar.YEAR), m = c.get(Calendar.MONTH), d = c.get(Calendar.DAY_OF_MONTH);
    c.clear();
    c.set(y, m, d);
    return c.getTime();
  }
}