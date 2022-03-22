package seedu.address.testutil;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.address.model.TaskList;
import seedu.address.model.tag.Tag;
import seedu.address.model.task.Link;
import seedu.address.model.task.Task;


public class TypicalTasks {

    public static final Task BRUSH_TEETH = new Task(
            "Brush my teeth",
            LocalDateTime.of(2022, 12, 15, 21, 0),
            new Tag("Toilet"), new Link(""));
    public static final Task LAUNDRY = new Task(
            "Do the laundry",
            LocalDateTime.of(2022, 6, 2, 15, 0),
            new Tag("Washing Machine"), new Link(""));
    public static final Task CONSULTATION = new Task(
            "Consultation with students", LocalDateTime.of(2022, 8, 3, 14, 0),
            new Tag("Consult"),
            new Link("https://nus-sg.zoom.us/j/86344685271?pwd=Uk5JZUJiRktJbURydHpGVXRNd0lPUT09#success"));
    public static final Task INVIGILATOR_MEETING = new Task(
            "Meeting with exam invigilators", LocalDateTime.of(2022, 2, 5, 14, 30),
            new Tag("Meeting"), new Link(""));

    /**
     * Returns array of 4 test tasks.
     *
     * @return Array of 4 test tasks.
     */
    public static List<Task> getTypicalTasks() {
        return new ArrayList<>(Arrays.asList(BRUSH_TEETH, LAUNDRY, CONSULTATION, INVIGILATOR_MEETING));
    }

    /**
     * Returns a {@code TaskList} with all the typical tasks.
     */
    public static TaskList getTypicalTaskList() {
        TaskList tl = new TaskList();
        for (Task task : getTypicalTasks()) {
            tl.addTask(task);
        }
        return tl;
    }

}
