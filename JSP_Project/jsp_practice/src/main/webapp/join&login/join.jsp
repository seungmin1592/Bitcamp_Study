<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/ncs_naver_join.css">
    <title>NAVER</title>
</head>
<body>
    <div class="wrap">
        <div class="container">
            <div class="logo">
                <img src="img/naver_logo.svg" alt="logo" class="logo">
            </div>
            <div class="join_section">
                <form action="join_result.jsp" class="join" method="post">
                    <label for="id" class="id_form">아이디
                        <span class="form_wrap">
                            <input type="text" id="id" name="id">
                            <span>@naver.com</span>
                        </span>
                    </label>
                    <label for="pw" class="password_form">비밀번호
                        <span class="form_wrap">
                            <input type="password" id="pw" name="pw">
                            <span class="icon_img"><img src="img/lock_icon.png" alt="icon"></span>
                        </span>
                    </label>
                    <label for="pw_re" class="password_re_form">비밀번호 재확인
                        <span class="form_wrap">
                            <input type="password" id="pw_re" name="pw_re">
                            <span class="icon_img"><img src="img/lock_icon.png" alt="icon"></span>
                        </span>
                    </label>
                    <label for="name" class="name_form">이름
                        <span class="form_wrap">
                            <input type="text" id="name" name="name">
                        </span>
                    </label>
                    <label for="birthday" class="birthday_form">생년월일
                        <span class="form_wrap">
                            <input type="text" id="birthday" name="year" placeholder="년(4자)">
                            <select name="month" id="month">
                                <option value="월">월</option>
                                <option value="1">1</option>
                                <option value="2">2</option>
                                <option value="3">3</option>
                                <option value="4">4</option>
                                <option value="5">5</option>
                                <option value="6">6</option>
                                <option value="7">7</option>
                                <option value="8">8</option>
                                <option value="9">9</option>
                                <option value="10">10</option>
                                <option value="11">11</option>
                                <option value="12">12</option>
                            </select>
                            <input type="text" id="birthday" name="day" placeholder="일">
                        </span>
                    </label>
                    <label for="gender" class="gender_form">성별
                        <span class="form_wrap">
                            <select name="gender" id="gender" name="gender">
                                <option value="성별">성별</option>
                                <option value="남자">남자</option>
                                <option value="여자">여자</option>
                                <option value="선택안함">선택안함</option>
                            </select>
                        </span>
                    </label>
                    <label for="email" class="email_form">본인 확인 이메일<span class="sub">(선택)</span>
                        <span class="form_wrap">
                            <input type="text" id="email" placeholder="선택입력" name="email">
                        </span>
                    </label>
                    <label for="phone" class="phone_form">휴대전화
                        <span class="form_wrap">
                            <select name="phone" id="phone" name="phone">
                                <option value="대한민국 +82">대한민국 +82</option>
                                <option value="덴마크 +45">덴마크 +45</option>
                            </select>
                            <div>
                                <input type="text" id="email" placeholder="전화번호 입력" class="write_phone_num" name="phone_2">
                                <a href="#" class="certification_btn">인증번호 받기</a>
                            </div>
                            <input type="text" placeholder="인증번호 입력하세요">
                        </span>
                    </label>
                    <button type="submit" class="join_btn">
                        가입하기
                    </button>
                </form>
            </div>
        </div><!-- container-->
    </div><!-- wrap-->
</body>
</html>