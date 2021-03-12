/*
 * 2011-03-04 caili
 *   对*Format增加同步
 */
package Utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Converter {
  private static SimpleDateFormat sdf_yMdHms = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
  public static int toInt(String s) {
    try {
      return s == null ? 0 : Integer.parseInt(s);
    } catch (Exception e) {
      return 0;
    }
  }

  /** yyyy-MM-dd HH:mm:ss */
  public static String toString(Date date) {
    synchronized (sdf_yMdHms) {
      return date == null ? null : sdf_yMdHms.format(date);
    }
  }

  public static String toString(long n) {
    return Long.toString(n);
  }


  public static java.sql.Timestamp toTimestamp(Date d) {
    if (d == null) {
      return null;
    }
    return new java.sql.Timestamp(d.getTime());
  }


}