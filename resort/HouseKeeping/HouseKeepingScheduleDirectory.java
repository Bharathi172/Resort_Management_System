package resort.HouseKeeping;

import java.util.ArrayList;

/**
 *
 * @author arvin
 */
public class HouseKeepingScheduleDirectory {
    
    ArrayList<HouseKeepingSchedule> HouseKeepingScheduleDirectory;

    public HouseKeepingScheduleDirectory() {
        this.HouseKeepingScheduleDirectory = new ArrayList<HouseKeepingSchedule>();
    }
    
    public ArrayList<HouseKeepingSchedule> getHouseKeepingScheduleDirectory() {
        return HouseKeepingScheduleDirectory;
    }

    public void setHouseKeepingScheduleDirectory(ArrayList<HouseKeepingSchedule> HouseKeepingScheduleDirectory) {
        this.HouseKeepingScheduleDirectory = HouseKeepingScheduleDirectory;
    }

    public HouseKeepingSchedule getScheduleById(String scheduleId) {
        
        HouseKeepingSchedule selectedSchedule = new HouseKeepingSchedule();
        for(HouseKeepingSchedule schedule : HouseKeepingScheduleDirectory) {
            if(schedule.getTaskID().equals(scheduleId)) {
                selectedSchedule = schedule;
                break;
            }
        }
        return selectedSchedule;
    }
    
    public void updateSchedule (HouseKeepingSchedule schedule) {
        HouseKeepingSchedule newSchedule = new HouseKeepingSchedule();
        
        int position = 0;
        for (int iter = 0; iter < HouseKeepingScheduleDirectory.size(); iter++) {
            if((HouseKeepingScheduleDirectory.get(iter).getTaskID()).equals(schedule.getTaskID())) {
                position = iter;
                break;
            }
        }

        newSchedule.setTaskID(schedule.getTaskID());        
        newSchedule.setScheduledDate(schedule.getScheduledDate());
        newSchedule.setAssignedRoom(schedule.getAssignedRoom());
        newSchedule.setScheduledTime(schedule.getScheduledTime());
        newSchedule.setTaskStatus(schedule.getTaskStatus());
        newSchedule.setAssignedUser(schedule.getAssignedUser());
        
        HouseKeepingScheduleDirectory.set(position, newSchedule);
    }
    
    public void removeScheduleById(String scheduleId) {
        HouseKeepingSchedule scheduleToRemove = getScheduleById(scheduleId);
        if (scheduleToRemove != null) {
            HouseKeepingScheduleDirectory.remove(scheduleToRemove);
        }
    }
}
