package util;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class LocalDateTimeUtil {
    /**
     * 获取传入时间所在月的第一秒和最后一秒
     * @param current
     * @return List<LocalDateTime> 第一个元素为第一秒，第二个元素为最后一秒
     */
    public static List<LocalDateTime> getSatartAndEndOfMonth(LocalDateTime current) {
        List<LocalDateTime> localDateTimes = new ArrayList<>();
        if(current != null) {
            int year = current.getYear();
            Month month = current.getMonth();
            LocalDateTime startMonth = LocalDateTime.of(year,month,1,0,0,0);
            LocalDateTime endMonth = LocalDateTime.of(year,month.plus(1),1,0,0,0).minusSeconds(1);
            localDateTimes.add(startMonth);
            localDateTimes.add(endMonth);
        }
        return localDateTimes;
    }
}