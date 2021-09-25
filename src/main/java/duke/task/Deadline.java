package duke.task;

import java.time.LocalDateTime;

public class Deadline extends Task{

    private LocalDateTime deadline;

    public Deadline(String description, LocalDateTime deadline) {
        super(description);
        this.deadline = deadline;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + "(by:" + deadline + ")";
    }
}
