//회원의 정보 : 아이디, 비밀번호, 이름
// Member -> 생성자 함수를 정의
function Member(id, pw, name) {
    this.userid = id;
    this.pw = pw;
    this.username = name;
}
// 객체가 가지는 메소드는 공통으로 사용 -> prototype
Member.prototype.makeHtml = function () {
    return '[id:' + this.userid + ' , pw: ' + this.pw + ' , name: ' + this.username + ' ]'
};

// 회원의 정보를 저장하는 배열
var members = []; // new Array()




$(document).ready(function () {

    // localStorage 저장된 데이터가 있는지 확인
    // localStorage.getItem('members') 없으면 null 반환
    if (localStorage.getItem('members') == null) {
        // 배열 members 를 저장
        localStorage.setItem('members', JSON.stringify(members));
    } else {
        members = JSON.parse(localStorage.getItem('members')); // JSON 문자열 -> 객체로 변환
        console.log(members);
        // 테이블 세팅
        setList();
    }



    // var IdChk=RegExp(/^[a-zA-Z0-9]{4,12}$/); //4글자이상 12미만, 영어대소문자 숫자 -_사용가능
    // var pwChk=RegExp(/^(?=.*[a-zA-Z])((?=.*\d)|(?=.*\W)).{6,20}$/) //6글자이상 20자미만 최소1개숫자 혹은 특수문자 포함
    // var nameChk= RegExp(/^[가-힣]+$/);


    var id = $('#userID');
    var pw = $('#pw');
    var repw = $('#repw');
    var name = $('#userName');


    $("#regForm").submit(function () {


        //아이디 공백확인
        // if(id.trim().length<1){
        if (id.val().trim().length < 1) {
            $('#userID+div.msg').css('display', 'block').html('필수항목입니다.');
            return false;
        }
        // else(!IdChk.test(id)){

        // }

        // //아이디 유효성 검사
        // if(!IdChk.test($('#userID').val())){
        //     $('#userID').focus();
        // }



        if (pw.val().trim().length < 1) {
            $('#pw+div.msg').css('display', 'block').html('필수항목입니다.');
            return false;
        }

        if (repw.val().trim().length < 1) {
            $('#repw+div.msg').css('display', 'block').html('필수항목입니다.');
            return false;
        }

        // 비밀번호 비밀번호 확인 일치 여부 체크
        if (pw.val().trim() != repw.val().trim()) {
            $('#repw+div.msg').css('display', 'block').html('비밀번호가 일치하지않습니다.');
            return false;
        }

        // 사용자 이름 정보
        if (name.val().trim().length < 1) {
            $('#userName+div.msg').css('display', 'block').html('필수항목입니다.');
            return false;
        }



        // 배열에 사용자 정보를 추가
        members.push(new Member(id.val(), pw.val(), name.val()));

        // 저장
        localStorage.setItem('members', JSON.stringify(members));

        alert('등록되었습니다.');
        console.log('회원 리스트', members);
        this.reset(); //form 초기화
        setList();

        return false;
    });

    $(id).focus(function () {
        // $('#userID').on('focus',function(){
        $('#userId+div.msg').css('display', 'none').html('');
    });
    $(pw).focus(function () {
        // $('#pw').on('focus',function(){
        $('#pw+div.msg').css('display', 'none').html('');
    });
    $(repw).focus(function () {
        // $('#repw').on('focus',function(){
        $('#repw+div.msg').css('display', 'none').html('');
        repw.val('');
    });
    $(name).focus(function () {
        // $('#userName').on('focus',function(){
        $('#userName+div.msg').css('display', 'none').html('');
    });


});

// 배열에 있는 요소를 -> table tr 행을 만들어서 출력
function setList() {


    var tbody = '<tr>';
    tbody += '  <th>순번(index)</th>';
    tbody += '  <th>아이디</th>';
    tbody += '  <th>비밀번호</th>';
    tbody += '  <th>이름</th>';
    tbody += '  <th>관리</th>';
    tbody += '</tr>';

    if (members.length < 1) {

        tbody += '<tr>';
        tbody += '<td colspan="5">데이터가 존재하지않습니다.</td>';
        tbody += '</tr>';

    } else {

        for (var i = 0; i < members.length; i++) {

            tbody += '<tr>';
            tbody += '  <td>' + i + '</td>';
            tbody += '  <td>' + members[i].userid + '</td>';
            tbody += '  <td>' + members[i].pw + '</td>';
            tbody += '  <td>' + members[i].username + '</td>';
            tbody += '  <td> <a href="javascript:editMember(' + i + ')">수정</a> |' +
                '<a href="javascript:deleteMember(' + i + ')">삭제</a></td>';
            tbody += '</tr>';
        }
    }
    $('#list').html(tbody);


}


// 배열의 요소 삭제 함수
function deleteMember(index) {
    if (confirm('삭제하시겠습니까?')) {
        members.splice(index, 1);
        alert('삭제되었습니다.');
        // 저장
        localStorage.setItem('members', JSON.stringify(members));
        // 테이블 리스트를 갱신
        setList();
    }
}

// 배열의 요소 수정 함수
function editMember(index) {


    // 수정 폼 영역이 노출되어야 한다!
    $('#editFormArea').css('display', 'block');

    // editForm의 태그들의 value  값을 세팅
    $('#editId').val(members[index].userid);
    $('#editPw').val(members[index].pw);
    $('#editRePw').val(members[index].pw);
    $('#editName').val(members[index].username);
    $('#index').val(index);

    $('#editForm').submit(function () {
        if ($('#editId').val() != $('#editRePw').val()) {
            alert('비밀번호와 비밀번호 확인이 일치하지 않습니다.');
            return false;
        }

        if (!confirm('수정하시겠습니까?')) {
            return false;
        }

        members[$('#editIndex').val()].pw = $('#editPw').val();
        members[$('#editIndex').val()].username = $('#editName').val();



        // 저장
        localStorage.setItem('members', JSON.stringify(members));

        alert('수정되었습니다.');

        // 테이블 세팅
        setList();

        editMemberClose();

        return false


    });

}


//멤버 수정 창 닫기
function editMemberClose() {
    $('#editFormArea').css('display', 'none');
}