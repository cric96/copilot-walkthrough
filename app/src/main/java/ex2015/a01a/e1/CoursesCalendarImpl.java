package ex2015.a01a.e1;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CoursesCalendarImpl implements CoursesCalendar {
    @Override
    public List<Integer> possibleSlots() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void bookRoom(final Day day, final Room room, final int start, final int duration, final String course) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Set<Pair<Integer, String>> dayRoomSlots(final Day day, final Room room) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Map<Pair<Day, Room>, Set<Integer>> courseSlots(final String course) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
