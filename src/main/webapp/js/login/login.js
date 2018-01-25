layui.config({
	base : "js/"
}).use(['form','layer'],function(){
	var form = layui.form(),
		layer = parent.layer === undefined ? layui.layer : parent.layer,
		$ = layui.jquery;
	//video背景
	$(window).resize(function(){
		if($(".video-player").width() > $(window).width()){
			$(".video-player").css({"height":$(window).height(),"width":"auto","left":-($(".video-player").width()-$(window).width())/2});
		}else{
			$(".video-player").css({"width":$(window).width(),"height":"auto","left":-($(".video-player").width()-$(window).width())/2});
		}
	}).resize();
	
	//登录按钮事件
	form.on("submit(login)",function(data){
            var account = $('#account').val();
            var password = $('#password').val();
            data = {
                password: password,
                account: account,
                rememberMe: $("#rememberMe").val
            };
            var load = layer.load();
            $.ajax({
                    url: "../login/logIn.shtml",
                    data: $('#login').serialize(),
                    type: "post",
                    dataType: "json",
                    beforeSend: function () {
                        layer.msg('开始登录，请稍后。');
                    },
                    success: function (result) {
                    	/*console.log(result)
                        layer.close(load);*/
                        if (result&& result.status != 200) {
                            layer.msg(result.message,function () {});
                            $('#password').val('');
                            return;
                        } else {
                            layer.msg('登录成功！');
                            setTimeout(function () {
                                    //登录返回
                                    window.location.href = "../../index.html";
                                },
                                1000)
                        }
                    },
                    error: function (e) {
                        console.log(e,e.message);
                        layer.msg('请联系管理员', new Function());
                    }
                });
/*		window.location.href = "../../index.html";
		return false;*/
	})
})

if (window != top) {
    top.location.href = location.href;
}
