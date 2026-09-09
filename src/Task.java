public class Task {
	// 필드
	private String title;
	private boolean completed;

	// 생성자
	public Task(String title) {
		this.title = title;
		this.completed = false;
	}

	// 제목을 반환하는 메서드
	public String getTitle() {
		return title;
	}

	// 완료 여부를 반환하는 메서드
	public boolean isCompleted() {
		return completed;
	}

	// 완료 여부를 전환하는 메서드
	public void toggleCompleted() {
		completed = !completed;
	}
}

