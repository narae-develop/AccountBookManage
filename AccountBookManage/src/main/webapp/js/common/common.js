/**
 * 공통
 */

//로그인
function sessionLogin() {
	location.href = "../user/userLogin.do";
}

//로그아웃
function sessionLogout() {
	if (confirm("로그아웃 하시겠습니까?") == true){
		location.href = "../user/sessionLogout.do";
	}else{
	    return;
	}
}