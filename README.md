# DAJOBA-project

## 수행프로젝트 개요 ## 

- #### 프로젝트명
   * DAJOBA 채용 web project
   
- #### 개발인원 및 참여기여도
   * 인원 : 6명 , 참여기여도 : 30%

- #### 수행기간
   * 2020.10.05 ~ 2020.10.16
   
- #### 프로젝트 목표
   * 2안 1조로 주어진 기능 구현
   * 기존에 학습한 내용을 최대한 다양하게 활용하여 기능을 구현
   * Back-end 기능을 모두 구현
   * Front-end 학습하고 구현
   * Bootstrab 활용해보기
   
- #### 개발 환경 및 개발 언어
   * 개발환경  : Eclipse IDE
   * Front-end : HTML / Javascript / CSS / Bootstrab / Ajax
   * Back-end  : JAVA / Spring Framework / Mybatis
   * Database  : MariaDB
   * Server    : Apache tomcat
   
- #### 담당역할
   * 2인 1조 채용공고 페이지 및 기능 구현
   * 마이페이지 이력서 작성페이지 및 기능 구현
   * 지원 이력서 작성페이지 및 기능 구현

- #### 오류발생 및 해결 내역
   * Ajax처리를 하는 과정에서 controller에서 각각의 테이블 정보들을 리스트로 받아와서 하나의 리스트로 만들어 Map타입으로 반환하는 과정에서 view에서 받아온 정보들을 꺼내서 처리하는데 많은 에러가 발생했습니다. 이를 해결하기 위해서 검색을 통하여 자료구조와 Ajax에 대해서 학습하고 이를 토대로 변수를 통하여 리스트 내부 리스트를 나눠주고 변수를 사용하여 각각의 리스트에 데이터들을 사용하는 방식으로 문제를 해결했습니다.   
   
- #### 프로젝스소감 및 향후 발전 방향
   * 2주라는 주어진 시간동안 실제 팀 단위로 협업하여 프로젝트를 진행해보면서 초기에는 의견 조율이 어려웠지만 서로 양보하고 능동적인 자세로 맡은 기능을 구현 해 나가면서 협업에 어려운 점과 팀에 일원으로 어떠한 태도로 실무에서 임할 것인지에 대해서 생각해본 계기가 되었습니다. 
 또한 계획한 것과 실제 구현 시 결과물에 대해서 다르게 나타나는 경우들이 있었고, 실제 구현 단계에서 기술적 부족으로 검색을 통하여 해결 해 나가면서 어느 부분을 채워야 할지도 확인해볼 수 있는 시간이 되었습니다.
     
## 프로젝트 상세내역  ##  
**[메인 page/ login page/ 비밀번호 찾기]**  
- #### 구현기능설명
  * 메인 페이지에서 6개의 취업 트랜드 관련 영상 제공
  * 하단에 8개씩 이동하며 기업 배너를 제공하고 클릭 시 기업정보로 이동
  * 우측에 현재 인기 공고/ 기업 정보를 제공
  * 로그인 버튼을 통하여 로그인 페이지로 이동
  * 비밀번호 이메일/ 전화번호로 찾기 제공(하나의 영역에 값을 입력 시 다른 영역은 잠김)
<div>
  <img src="https://user-images.githubusercontent.com/72076023/101980288-ad527780-3ca7-11eb-9ae9-0880797e633f.png" width="30%"> </img>
  <img src="https://user-images.githubusercontent.com/72076023/101980294-afb4d180-3ca7-11eb-882e-3fe98562d137.png" width="30%"> </img>
  <img src="https://user-images.githubusercontent.com/72076023/101980287-ad527780-3ca7-11eb-8e2c-648458e7f3c0.png" width="30%"> </img>
</div>


--------------------------
**[기업 Page]**  
- #### 구현기능설명
  * 기업 메인 페이지에서 추천 채용 제공
  * 우측에 직군 별 카테고리 검색기능
  * 상세 페이지에서 기업소개 / 채용공고 / 현직자 인터뷰 / 면접후기 / 합격자소서 제공
  * 현직자 인터뷰에서 별점 부여 기능
  * 한 글자 이상 입력 시 관련 기업 조회
<div>
  <img src="https://user-images.githubusercontent.com/72076023/101980290-ae83a480-3ca7-11eb-9dd3-07ff6e0dc5c5.png" width="30%"> </img>
  <img src="https://user-images.githubusercontent.com/72076023/101980292-af1c3b00-3ca7-11eb-949b-65383dbab86a.png" width="30%"> </img>
  <img src="https://user-images.githubusercontent.com/72076023/101980291-af1c3b00-3ca7-11eb-986d-962f2070b492.png" width="30%"> </img>
</div>

--------------------------
**[채용공고 Page]**  
- #### 구현기능설명
  * 채용공고 메인에서 조회수 상위 6개 추천
  * 채용공고 바로가기 클릭 시 조회수 1씩 증가
  * 바로가기 페이지에서 지원하기 가능/ 로그인 하지 않았을 시 로그인 페이지로 이동
  * Ajax : Ajax를 활용하여 세션 정보를 통한 개인 이력서를 받아와서 pop-up창으로 처리
  * 한 글자 이상 입력 시 관련 기업 공고 조회
<div>
  <img src="https://user-images.githubusercontent.com/72076023/101980298-b0e5fe80-3ca7-11eb-8b15-7608fc2418ca.png" width="30%"> </img>
  <img src="https://user-images.githubusercontent.com/72076023/101980286-acb9e100-3ca7-11eb-9555-73a80eb52da7.png" width="30%"> </img>
  <img src="https://user-images.githubusercontent.com/72076023/101980285-acb9e100-3ca7-11eb-9266-35f33e980216.png" width="30%"> </img>
</div>

--------------------------
**[마이페이지 – 정보수정/이력서작성/지원현황]**  
- #### 구현기능설명
  * 개인 정보 수정 시 비밀번호 일치여부 확인 시 항목 변경 가능
  * 이력서 작성 시 이미지 업로드 바로 확인가능
  * 추가 버튼을 통하여 다수항목 추가 / 삭제버튼으로 항목 삭제 가능
  * 항목이 비어 있는 상태에서 작성완료 시 미 기재 항목을 알려줌
  * 작성 된 이력서 현황 페이지에서 작성된 이력서 확인 가능
  * 지원현황 페이지에서 채공공고 지원 시 사용한 이력서명 / 지원공고명/ 지원기업 확인 가능
<div>
    <img src="https://user-images.githubusercontent.com/72076023/101980293-afb4d180-3ca7-11eb-8c0e-754b8d9ea62d.png" width="30%"> </img>
    <img src="https://user-images.githubusercontent.com/72076023/101980295-b04d6800-3ca7-11eb-98b0-0f8fba92e8c1.png" width="30%"> </img>
    <img src="https://user-images.githubusercontent.com/72076023/101980297-b0e5fe80-3ca7-11eb-813c-3d5545c400fc.png" width="30%"> </img>
</div>
<div>
  <img src="https://user-images.githubusercontent.com/72076023/101980283-ab88b400-3ca7-11eb-8a3e-0c45f86725a8.png" width="45%" height="400px"> </img>
  <img src="https://user-images.githubusercontent.com/72076023/101980284-ac214a80-3ca7-11eb-957b-956cb4275631.png" width="45%" height="400px"> </img>
</div>
  

--------------------------
**[커뮤니티 page]**  
- #### 구현기능설명
  * 제목을 통하여 상세 내역보기
  * 상세내역을 볼 시 조회수 1씩 증가
  * 게시글 수정/ 삭제 시 세션 정보를 통하여 본인 확인
  * 로그인 시 댓글 작성 가능
  
<div>
  <img src="https://user-images.githubusercontent.com/72076023/101980289-adeb0e00-3ca7-11eb-8608-2942283bf7d7.png"> </img>
</div>
