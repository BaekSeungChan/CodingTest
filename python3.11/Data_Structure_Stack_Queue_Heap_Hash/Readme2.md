1. 스택 (Stack)
- 설명: 스택은 LIFO(Last In First Out) 방식으로 작동하는 선형 데이터 구조입니다. 가장 마지막에 추가된 요소가 가장 먼저 제거됩니다.
- 파이썬 구현: 리스트를 사용하여 스택을 구현할 수 있으며, append()와 pop() 메서드로 데이터를 추가하고 제거합니다.
2. 큐 (Queue)
- 설명: 큐는 FIFO(First In First Out) 방식으로 작동하는 선형 데이터 구조입니다. 가장 먼저 추가된 요소가 가장 먼저 제거됩니다.
- 파이썬 구현: queue 모듈을 사용하여 큐를 구현할 수 있습니다. Queue 클래스를 사용하여 FIFO 큐를 구현할 수 있습니다.
3. 힙 (Heap)
- 설명: 힙은 최대값 또는 최소값에 빠르게 접근할 수 있는 트리 기반의 데이터 구조입니다. 최대 힙에서는 최대값이, 최소 힙에서는 최소값이 루트에 위치합니다.
- 파이썬 구현: heapq 모듈을 사용하여 최소 힙을 구현할 수 있습니다. heappush()와 heappop() 메서드로 데이터를 추가하고 제거합니다.
4. 해시 (Hash)
- 설명: 해시는 키-값 쌍을 저장하는 데이터 구조로, 각 키는 해시 함수를 통해 고유한 인덱스로 변환됩니다.
- 파이썬 구현: 파이썬의 딕셔너리(dict)는 내부적으로 해시 테이블을 사용합니다. 키-값 쌍을 저장하고 효율적으로 데이터를 검색할 수 있습니다.

```python
# 파이썬에서 스택, 큐, 힙, 해시의 간단한 구현 예제입니다.

# 스택 구현 예제
stack = []
stack.append(1)  # 스택에 요소 추가
stack.append(2)
stack.append(3)
stack.pop()      # 가장 마지막에 추가된 요소 제거

# 큐 구현 예제
from queue import Queue
queue = Queue()
queue.put(1)     # 큐에 요소 추가
queue.put(2)
queue.put(3)
queue.get()      # 가장 먼저 추가된 요소 제거

# 힙 구현 예제
import heapq
heap = []
heapq.heappush(heap, 3)  # 힙에 요소 추가
heapq.heappush(heap, 1)
heapq.heappush(heap, 2)
heapq.heappop(heap)      # 가장 작은 요소 제거

# 해시 구현 예제 (파이썬 딕셔너리)
hash_table = {}
hash_table['key1'] = 'value1'  # 키-값 쌍 추가
hash_table['key2'] = 'value2'
value = hash_table['key1']     # 키를 사용하여 값 검색

(stack, list(queue.queue), heap, hash_table, value)

```