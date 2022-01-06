package com.company.chap04;

public class IntQueue {

	private int max; //큐의 용량
	private int front; //첫 번째 요소 커서
	private int rear; //마지막 요소 커서
	private int num; //현재 데이터 수
	private int[] que; //큐 본체

	//실행 시 예외 : 큐가 비어 있음
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {
		}
	}

	//실행 시 예외 : 큐가 가득 차 있음
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {
		}
	}

	//생성자
	public IntQueue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max]; //큐 본체용 배열을 생성
		} catch (OutOfMemoryError e) { //생성할 수 없음
			max = 0;
		}
	}

	//큐에 데이터를 인큐
	public int enque(int x) throws OverflowIntQueueException {
		if (num >= max)
			throw new OverflowIntQueueException(); //큐가 가득참
		que[rear++] = x; // x 데이터를 인큐하면 rear의 값을 1 증가시켜줘야 함
		num++; //x 데이터가 추가 되면 데이터 개수도 1 증가함.
		if (rear == max)  // 만약 max가 12인데 데이터를 추가해서 rear값이 1 증가해 rear == max가 된다면 rear를 배열의 처음인 0으로 변경
			rear = 0; // 다음 인큐할 데이터가 que[0]에 위치
		return x;
	}

	// 큐에서 데이터를 디큐
	public int deque() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException(); // 큐가 비어있음.
		int x = que[front++]; //front를 deque 하면 front 값을 1 증가
		num--; // 데이터 갯수는 줄어드니 num을 1 감소
		if (front == max) // 인덱스 초과 문제
			front = 0; // front가 deque되어 front 값이 1 증가 되어 max값과 같아지면 배열의 처음인 0으로 변경
		return x;
	}

	//큐에서 데이터를 피크(프런트 데이터를 들여다봄)
	public int peek() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException(); //큐가 비어있음
		return que[front];
	}

	//큐에서 x를 검색하여 인덱스(찾지 못하면 -1)을 반환
	public int indexOf(int x) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % max; //프론트 부터 선형검색 해주기 위해
			if (que[idx] == x) //검색 성공
				return idx;
		}
		return -1; // 검색 실패
	}

	// 큐를 비움
	public void clear() {
		num = 0;
	}

	// 큐의 용량을 반환
	public int capacity() {
		return max;
	}

	// 큐에 쌓인 데이터 수를 반환
	public int size() {
		return num;
	}

	// 큐가 비어 있는가?
	public boolean isEmpty() {
		return num <= 0;
	}

	// 큐가 가득 찼는가?
	public boolean isFull() {
		return num >= max;
	}

	// 큐 안의 데이터를 머리→꼬리의 차례로 출력함
	public void dump() {
		if (num <= 0)
			System.out.println("큐가 비었습니다.");
		else {
			for (int i = 0; i < num; i++)
				System.out.print(que[i] + " ");
			System.out.println();
		}
	}

	public int search(int x) {
		for (int i = 0; i < num; i++) {
			if (que[(i + front) % max] == x)
				return i + 1;
			return i;
		}
		return 0;
	}
}



