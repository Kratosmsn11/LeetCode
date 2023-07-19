class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        // comparing end time of the 1st event with the start time of the 2nd event.
        int endTime1StartTime2 = event2[0].compareTo(event1[1]);
        // comparing the start time of the 1st event with the end time of the 2nd event.
        int startTime1EndTime2 = event2[1].compareTo(event1[0]);

        return (endTime1StartTime2 <= 0) && (startTime1EndTime2 >= 0);
    }
}
