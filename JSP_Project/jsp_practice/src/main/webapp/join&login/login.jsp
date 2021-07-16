<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/ncs_naver_login.css">
    <title>NAVER</title>
</head>
<body>
    <div class="wrap">
        <div class="container">
            <div class="logo">
                <img src="img/naver_logo.svg" alt="logo">
            </div>
            <div class="login_section">
                <form action="login_result.jsp" class="login" method="get">
                    <input type="text" class="id" placeholder="아이디" name="id">
                    <input type="password" class="pw" placeholder="비밀번호" name="pw">
                    <input type="submit" class="login_btn" value="로그인">
                </form>
            </div>
        </div><!--container-->
    </div><!--wrap-->
</body>
</html>