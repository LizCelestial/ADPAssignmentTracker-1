package org.assignmentTracker.factory;

import org.assignmentTracker.entity.Task;
import org.assignmentTracker.util.Helper;

/**
 *
 * @author: Caleb Ruiters
 * student number: 215169751
 * */

public class TaskFactory {
    public static Task newTask(int assignmentId, long studentNumber, int memberId) {
        int taskId = Helper.generateID();
        Task task = new Task.Builder()
                .setTaskId(taskId)
                .setAssignmentId(assignmentId)
                .setMemberId(memberId)
                .setStudents(studentNumber)
                .build();
        return task;
    }
}
