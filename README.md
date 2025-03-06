# 계산기 프로젝트

## 개요
이 프로젝트는 기본적인 사칙연산(+, -, *, /)을 수행하는 계산기를 구현했습니다.
Lv1 패키지에서는 클래스 없이 기능을 구현하고, Lv2 패키지에서는 `Calculator` 클래스를 적용하여 객체 지향적으로 개선하였습니다.

## 실행 방법
1. lv2 패키지의 `Main.java` 파일을 실행합니다.
2. 첫 번째 숫자를 입력합니다.
3. 연산 기호(+, -, *, /)를 입력합니다.
4. 두 번째 숫자를 입력합니다.
5. 계산 결과가 출력됩니다.
6. "remove"를 입력하면 가장 먼저 저장된 연산 결과가 삭제됩니다.
7. "exit"를 입력하면 프로그램이 종료됩니다.

## 기능 설명
### Lv1: 기본적인 연산 수행 (클래스 없이 구현)
- `Scanner`를 이용하여 두 개의 양의 정수를 입력받음
- 사칙연산 기호를 입력받음
- `switch`문을 활용하여 연산 수행
- `exit` 입력 전까지 반복적으로 연산 수행 가능

### Lv2: `Calculator` 클래스를 이용한 연산 수행
- `Calculator` 클래스 구현
  - 연산 수행 및 결과 반환 메서드 포함 (`calculate`)
  - 연산 결과 저장을 위한 `Queue<Integer>` 필드 포함
  - 연산 결과를 조회하는 `getResults()` 메서드 구현
  - 가장 오래된 결과를 삭제하는 `removeResult()` 메서드 구현
    
- `Main` 클래스에서 `Calculator` 객체 활용
  - 연산 수행 후 결과를 저장 및 출력
  - "remove" 입력 시 가장 오래된 결과 삭제
  - "exit" 입력 시 프로그램 종료

## Lv2 패키지 내, 파일 설명
- `Main.java`: 프로그램의 진입점. 사용자 입력을 받아 `Calculator` 클래스를 이용해 연산을 수행하고 결과를 출력함
- `Calculator.java`: 사칙연산을 수행하고 결과를 저장하는 클래스

---

# Calculator Project

## Overview
This project implements a basic calculator that performs arithmetic operations (+, -, *, /). 
In Lv1 package, the functionality is implemented without classes, while in Lv2 package, the `Calculator` class is introduced to improve object-oriented design.

## How to Run
1. Run the `Main.java` file.
2. Enter the first number.
3. Enter an arithmetic operator (+, -, *, /).
4. Enter the second number.
5. The calculation result will be displayed.
6. Type "remove" to delete the oldest stored result.
7. Type "exit" to terminate the program.

## Features
### Lv1: Basic Operations (Without Classes)
- Uses `Scanner` to accept two positive integers.
- Accepts an arithmetic operator.
- Performs operations using `switch` statements.
- Supports repeated calculations until "exit" is entered.

### Lv2: Object-Oriented Implementation with `Calculator` Class
- `Calculator` class:
  - Implements arithmetic operations and returns results (`calculate` method).
  - Stores results using a `Queue<Integer>` field.
  - Provides a `getResults()` method to retrieve stored results.
  - Implements `removeResult()` to delete the oldest record.
 
- `Main` class:
  - Uses a `Calculator` instance to perform operations.
  - Stores and displays results.
  - Supports removing the oldest result upon user input.
  - Terminates when "exit" is entered.

## Files in Lv2 Package
- `Main.java`: Entry point of the program, handles user input and utilizes the `Calculator` class for computations.
- `Calculator.java`: Implements arithmetic operations and result storage.
