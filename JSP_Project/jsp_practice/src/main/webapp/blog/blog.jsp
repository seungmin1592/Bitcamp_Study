<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="Web_Test1.css">
    <title>Document</title>
</head>
<body>
    <div class="wrap">
       <%@include file="../include/header.jsp" %>
       <%@include file="../include/nav.jsp" %>
       
        <!-- section1 -->
        <section class="section section_1">
            <div class="container">
                <div class="content">
                    <h2 class="content_title">
                        HTML5 개요와 활용
                    </h2>
                    <P class="content_day">
                        2013년 02월 14일
                    </P>
                    <img src="img.png" alt="img">
                    <p class="content_info">
                        Lorem ipsum dolor sit amet consectetur adipisicing elit. Ea doloremque quidem incidunt, quam magni debitis qui nulla earum porro omnis laboriosam dolore, beatae velit ducimus. Nesciunt cupiditate possimus cumque distinctio?
                        Lorem ipsum, dolor sit amet consectetur adipisicing elit. Fugit eligendi velit quasi exercitationem iste impedit voluptas ipsa recusandae incidunt! Ipsum, atque fugit ab iure saepe ex eaque facilis nobis. Eius.
                        Lorem ipsum dolor sit amet consectetur adipisicing elit. Porro at sed, tempora blanditiis eaque adipisci nostrum inventore sint expedita, consequatur officiis nemo vero quia aut. Unde aut voluptas exercitationem est.
                        Lorem ipsum dolor sit amet consectetur adipisicing elit. Cum quisquam obcaecati minima voluptate voluptatem nemo voluptatibus architecto minus officia quia error, aperiam laborum quibusdam ad doloremque, optio fuga sed laboriosam.
                        Lorem, ipsum dolor sit amet consectetur adipisicing elit. Nobis dolores eum tempore ipsa, adipisci, similique minima dolore quaerat voluptas quia quo sequi, rerum magni ea consequatur autem id sunt aliquam.
                    </p>
                </div>
            </div>
            <%@include file="../include/sub_nav.jsp" %>
        </section>
        <!--section1 end-->
        <!-- section2 -->
        <section class="section section_2">
            <div class="container">
                <div class="content">
                    <h2 class="content_title">
                        HTML5 응용과 실습
                    </h2>
                    <P class="content_day">
                        2013년 02월 17일
                    </P>
                    <img src="img.png" alt="img">
                    <p class="content_info">
                        Lorem ipsum dolor sit amet consectetur adipisicing elit. Ea doloremque quidem incidunt, quam magni debitis qui nulla earum porro omnis laboriosam dolore, beatae velit ducimus. Nesciunt cupiditate possimus cumque distinctio?
                        Lorem ipsum, dolor sit amet consectetur adipisicing elit. Fugit eligendi velit quasi exercitationem iste impedit voluptas ipsa recusandae incidunt! Ipsum, atque fugit ab iure saepe ex eaque facilis nobis. Eius.
                        Lorem ipsum dolor sit amet consectetur adipisicing elit. Porro at sed, tempora blanditiis eaque adipisci nostrum inventore sint expedita, consequatur officiis nemo vero quia aut. Unde aut voluptas exercitationem est.
                        Lorem ipsum dolor sit amet consectetur adipisicing elit. Cum quisquam obcaecati minima voluptate voluptatem nemo voluptatibus architecto minus officia quia error, aperiam laborum quibusdam ad doloremque, optio fuga sed laboriosam.
                        Lorem, ipsum dolor sit amet consectetur adipisicing elit. Nobis dolores eum tempore ipsa, adipisci, similique minima dolore quaerat voluptas quia quo sequi, rerum magni ea consequatur autem id sunt aliquam.
                    </p>
                </div>
            </div>
        </section>
        <!--section2 end-->
        <%@include file="../include/footer.jsp" %>
    </div><!-- wrap -->
</body>
</html>