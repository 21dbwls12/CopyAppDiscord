# CopyApp - Discord
디스코드 카피앱

### 목차  
- [프로젝트 구현 과정](#-프로젝트-구현-과정)
  - [1회차](#-93)
  - [2회차](#-923)
  - [3회차](#-924)
  - [4회차](#-929)
  - [5회차](#-930)
  - [6회차](#-101)

ㅇ  
ㅇ  
ㅇ  
ㅇ  
ㅇ  
ㅇ  
ㅇ  
ㅇ  
ㅇ  
ㅇ  
ㅇ  














## ⏭️ 프로젝트 구현 과정
### 📌 9/3
#### 1. 앱 아이콘 변경

|<img src="https://github.com/user-attachments/assets/2bb08a21-15f1-4eb3-a66f-bcb23de2ff92" width="50" height="40"/>|<img src="https://github.com/user-attachments/assets/f5664cd9-63b8-479a-9d59-385dd5156ce1" width="200" height="250"/>|
|---|---|
|디스코드 로고|실제 적용된 앱 아이콘|

로고 출처: [Discord 공식 Brand 페이지](https://discord.com/branding)

#### 2. navigation 설정

경로 설정
- enum class
  - 인수가 없을 때
  - R 리소스 ID와 네비게이션 경로와 함께 사용
    - UI와 네비게이션 로직을 한 곳에서 관리 가능
    - 확장성
    - 타입 안전성
- sealed class
  - 인수가 있을 때
    
-> 이후에 인수를 전달하는 코드를 작성할 예정이라 sealed class로 설정 

#### 3. 앱 열때 앱 아이콘이 나오는 화면 다르게 구현

- 직접 구현한 화면으로 navigation을 통해 이동
- 근데 처음 앱 아이콘이 나오는 화면이 계속 나타나서 검색한 후 SplashScreen 확인

#### 4. SplashScreen 구현

|![SplashScreenDiscord](https://github.com/user-attachments/assets/043405da-ac32-488e-8f8f-f0b785a1a23b)|![SplashScreen](https://github.com/user-attachments/assets/3d640e21-cc55-4faf-b798-31a15d470e5c)|
|---|---|
|Discord SplashScreen|내 카피앱 SplashScreen|
- 색깔이 다른 것은 테마별로 달라지는 것 같아서 잠깐 놔둠
- 정확하게 확인된 후 수정할 예정

##### [2가지 오류 발생](https://github.com/21dbwls12/CopyAppDiscord/commit/3173bfe4d2fe3cc10ebc1ae7e4dfe372058e11b6)

오류1. 화면이 멈춰서 일정시간 이후 다음 화면으로 넘어가지 않음
- 왜 그런지 모르겠음
  
오류2. 아이콘 비율이 이상함
- 추가한 아이콘이 여백이 없어서 중앙이 엄청 확대되서 나오는 듯
- 비율을 수정하는 코드 추가해봤는데 변화가 없음
- 물리적으로 화질이 괜찮게 여백을 추가하려면 툴이 있어야하는데 필요한 툴이 안깔려있어서 이유만 확인하고 수정은 못함

### 📌 9/23
#### 1. 오류 수정
- ```splashScreen.setKeepOnScreenCondition { true }```
- 해당 코드 때문에 다음 화면으로 안 넘어가던 것

### 📌 9/24
#### 1. 시작화면
- 디스코드 로고 추가
- 환영 타이틀 문구 작성
- 앱 이름이 적힌 상단바가 계속 있어서 수정 방법 검색
  - 못 찾음

### 📌 9/29
#### 1. 시작화면 계속 진행
- 상단바가 계속 표시되는 것에 대한 이유 확인
  - SplashScreen때문에 themes.xml을 건드린 것에서 문제 발생
  - MainActivity에 ```actionBar?.hide()``` 추가해서 해결
- 환영 타이틀 문구 코드 수정
  - buildAnnotatedString 사용하여 한 문장에 두가지 스타일 추가
- 버튼 추가
- 수정해야할 부분
  - 폰트가 안드로이드 기기의 설정에 따라서 설정되게끔 하고 싶은데 아직 못 찾았서 잠시 미뤄둠

|![welcomeScreenDiscord](https://github.com/user-attachments/assets/078c0013-f42a-4626-abf2-3f45cbe5daa2)|![welcomeScreen](https://github.com/user-attachments/assets/a2cd8e4a-1e37-4455-b56e-f8ce92f2d4ae)|
|---|---|
|Discord welcomeScreen|내 카피앱 welcomeScreen|

배경 출처: [KREA AI 이미지 생성 페이지](https://www.krea.ai/apps/image/flux)

### 📌 9/30
#### 1. 데이터베이스 연동
- 사용해 보지 못했던 supabase로 결정
  - [공식 문서 따라가다 보니 ktor, hilt 추가에 관한 부분도 있어서 추가](https://github.com/21dbwls12/CopyAppDiscord/commit/1798abdf3ffdaf27b9e4245e2e79fe802712b883)

### 📌 10/1
#### 1. supabase 기본 틀 생성
- supabase 공식 문서 보고 따라하기
  - 하다가 공식 문서에는 SupabaseClient 클래스가 있는데 안스에서는 없다고 에러가 계속 발생
  - 검색해도 안나와서 막혔음



