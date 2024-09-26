/*
 Question Summary
The task is to implement a MyCalendar class that allows booking events without causing double bookings. Each event is represented by a start and end time, and the goal is to ensure that no two events overlap.

Answer
To implement the MyCalendar class, we can utilize a list to store the booked events and check for overlaps when a new event is added. The book method will iterate through the existing events to ensure that the new event does not intersect with any of them. If it can be added without conflict, it will be stored in the list.

Explanation:
The MyCalendar constructor initializes an empty list of events.
The book method checks each existing event to see if the new event overlaps with any. If it does, it returns false. If not, it adds the new event and returns true.
This implementation efficiently handles the booking process while ensuring no double bookings occur.
 */

import java.util.ArrayList;
import java.util.List;

public class MyCalendarI729 {

    private List<int[]> events;

    public MyCalendarI729() {
        events = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        for (int[] event : events) {
            // Check for overlap
            if (start < event[1] && end > event[0]) {
                return false; // Overlap detected
            }
        }
        events.add(new int[]{start, end}); // No overlap, add the event
        return true;
    }

    public static void main(String[] args) {
        MyCalendarI729 calendar = new MyCalendarI729();

        // Test cases
        System.out.println(calendar.book(10, 20)); // true, event added
        System.out.println(calendar.book(15, 25)); // false, overlap with previous event
        System.out.println(calendar.book(20, 30)); // true, no overlap, event added
    }
}
