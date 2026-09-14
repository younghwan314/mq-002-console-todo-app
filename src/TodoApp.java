import java.util.ArrayList;

public class TodoApp {
	private ArrayList<Task> tasks = new ArrayList<>();

	// 할 일 추가
	public void addTask(String title) {
		Task task = new Task(title);
		tasks.add(task);
	}

	// 할 일 목록 조회
	public void showTasks() {
		// 목록이 비어 있으면
		if (tasks.isEmpty()) {
			System.out.println("등록된 할 일이 없습니다.");
			return;
		}

		// 목록이 비어 있지 않으면
		for (int i = 0; i < tasks.size(); i++) {
			Task task = tasks.get(i);
			System.out.println((i + 1) + (task.isCompleted() ? ". [x] " : ". [ ] ") + task.getTitle());
		}
	}

	// 할 일 상태 변경
	public void toggleTask(int taskNumber) {
		tasks.get(taskNumber - 1).toggleCompleted();
	}

	// 할 일 삭제
	public void deleteTask(int taskNumber) {
		tasks.remove(taskNumber - 1);
	}
}
