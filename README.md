---------------------------------------------------------
## A. 기능 요구사항
#### 1. 쉼표를 기준으로 자동차 이름(5자 이하) 입력
```
1.1 nameDistinguish() : 쉼표를 기준으로 자동차 이름을 나눠 배열에 저장
1.2 isNameLessThan5() : 각 자동차 이름이 5자 이하인지 확인
1.3 makeCars() : 호출시 자동차 수만큼 객체 배열 생성 후 입력한 자동차 이름으로 객체 생성
```

#### 2. 시도할 횟수 입력
```
2.1 repeat() : 시도 횟수만큼 반복하는 메소드
```

#### 3. 0~9까지 랜덤수 구하는 메소드
```
3.1 randomNum() : 호출시 0~9 까지의 랜덤수 반환
```

#### 4. 랜덤값이 4이상이면 전진하는 메소드
```
4.1 isMoreThan4() : 랜덤값이 4이상일 때 자동차의 객체 포지션을 증가시키는 메소드
4.2 addPosition() : 호출시 자동차 객체의 포지션 1 증가
```

#### 5. 실행결과 출력
```
5.1 printState() : 자동차 객체의 이름과 포지션을 하이픈(-)으로 출력하는 메소드
5.2 getPosition() : 자동차 객체의 현재 position 반환
```

#### 6. 누가 우승했는지 알려줌
```
6.1 maxValue() : 각 포지션을 position배열에 저장 후 가장 큰 포지션 값 구하는 메소드
6.2 result() : maxPosition인 자동차 객체 출력
6.3 printResult() : 다수의 우승자가 나올 경우 쉼표 위치를 설정하는 printResult 메소드
```

#### 7. 변수 설명
```
7.1 LIMIT_NAME_LENGTH : 자동차 이름 최대 가능 길이
7.2 GO_STRAIGHT : 해당값 이상일 때 전진
```

---------------------------------------------------------
## B. 프로그래밍 요구사항
#### 1. Car 객체 활용
```
1.1 여러 자동차 객체를 생성해야하므로 객체 배열을 만든다
```

#### 2. Car 기본생성자 추가 금지
```
2.1 Car 객체 배열 생성시 입력받은 이름으로 생성자 호출
```

#### 3. private 변경 금지
```
3.1 public 멤버함수로의 접근
```

#### 4. setPosition(int position) 추가 금지
```
4.1 position값을 직접 지정하는것이 아닌, 랜덤수에 따라 내부적으로 1씩 증가
```

#### 5. 메소드의 길이가 15라인이 넘지 않을것
```
5.1 하나의 메소드는 하나의 기능만 할것
```

#### 6. else 사용 금지(switch/case도 금지)

---------------------------------------------------------
## C. 기본 프로그래밍 요구사항
#### 1. 자바 코드 컨벤션 지키기

#### 2. indent depth 2까지 허용
```
2.1 메소드로 분리
```

---------------------------------------------------------
## D. 미션 저장소 및 진행 요구사항
#### 1. 기능 구현 전 README.md 파일 추가할것

#### 2. git의 commit 단위는 README.md의 기능 목록 단위로 추가할것
---------------------------------------------------------
