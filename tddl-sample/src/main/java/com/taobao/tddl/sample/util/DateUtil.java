/*(C) 2007-2012 Alibaba Group Holding Limited.	

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Comment for DateUtil
 * <p/>
 * Author By: zhuoxue.yll
 * Created Date: 2012-2-29 ����02:26:02 
 */
public class DateUtil {

	/** yyyy-MM-dd */
	public static final String DATE_FULLHYPHEN = "yyyy-MM-dd";

	/**
	 * ������ת����ָ����ʽ���ַ���
	 *
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static String formatDate(Date date, String pattern) {
		if (date == null) {
			return null;
		}
		if (StringUtils.isBlank(pattern)) {
			return null;
		}
		SimpleDateFormat fmt = new SimpleDateFormat(pattern);
		String convStr = fmt.format(date);
		return convStr;
	}

	/**
	 * �������/���
	 *
	 * @param intervals
	 * @param format
	 * @return
	 */
	public static String getDiffDate(int intervals, String format) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, intervals);
		Date intervalDay = cal.getTime();
		return formatDate(intervalDay, format);
	}

}