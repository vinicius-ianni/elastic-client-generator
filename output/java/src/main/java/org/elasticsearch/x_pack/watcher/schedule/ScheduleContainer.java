
package org.elasticsearch.x_pack.watcher.schedule;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.x_pack.watcher.schedule.*;

public class ScheduleContainer  {
  
  private CronExpression _cron;
  public CronExpression getCron() { return this._cron; }
  public ScheduleContainer setCron(CronExpression val) { this._cron = val; return this; }


  private DailySchedule _daily;
  public DailySchedule getDaily() { return this._daily; }
  public ScheduleContainer setDaily(DailySchedule val) { this._daily = val; return this; }


  private HourlySchedule _hourly;
  public HourlySchedule getHourly() { return this._hourly; }
  public ScheduleContainer setHourly(HourlySchedule val) { this._hourly = val; return this; }


  private Interval _interval;
  public Interval getInterval() { return this._interval; }
  public ScheduleContainer setInterval(Interval val) { this._interval = val; return this; }


  private TimeOfMonth[] _monthly;
  public TimeOfMonth[] getMonthly() { return this._monthly; }
  public ScheduleContainer setMonthly(TimeOfMonth[] val) { this._monthly = val; return this; }


  private TimeOfWeek[] _weekly;
  public TimeOfWeek[] getWeekly() { return this._weekly; }
  public ScheduleContainer setWeekly(TimeOfWeek[] val) { this._weekly = val; return this; }


  private TimeOfYear[] _yearly;
  public TimeOfYear[] getYearly() { return this._yearly; }
  public ScheduleContainer setYearly(TimeOfYear[] val) { this._yearly = val; return this; }

}
