<%@ page contentType ="text/html;charset=UTF-8"%>
<%@ taglib prefix="myshiro" uri="/myshiro" %>
<!DOCTYPE html>
<html>
<head>
    <jsp:include page="../../common.jsp"></jsp:include>
    <meta charset="utf-8">
    <title>用户总数--layui后台管理模板</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <link rel="stylesheet" type="text/css" href="${ctx}/js/common/webuploader/webuploader.css">
    <link rel="stylesheet" type="text/css" href=" http://fex.baidu.com/webuploader/css/demo.css?qq-pf-to=pcqq.c2c">
    <link rel="stylesheet" type="text/css" href="${ctx}/js/common/bootstrap/css/bootstrap.css">
    <script type="text/javascript" src="${ctx}/js/common/webuploader/webuploader.js"></script>
    <script type="text/javascript" src="${ctx}/js/common/bootstrap/js/bootstrap.js"></script>
    <link rel="stylesheet" href="${ctx}/css/user.css" media="all" />
</head>
<body class="childrenBody">
<div class="progress-bar" role="progressbar" style="width: 100%;"></div>
<blockquote class="layui-elem-quote news_search">
    <div class="layui-inline">
        <div class="layui-input-inline">
            <input type="text" value="" placeholder="请输入关键字" class="layui-input search_input">
        </div>
        <myshiro:by name="hello"><a class="layui-btn search_btn">查询</a></myshiro:by>
    </div>
    <div class="layui-inline">
        <a class="layui-btn layui-btn-normal" onclick="add()">添加用户</a>
    </div>

    <div id="uploader" class="wu-example">
        <!--用来存放文件信息-->
        <div id="thelist" class="uploader-list"></div>
        <div class="btns">
            <div id="picker">选择文件</div>
            <button id="btnClick" class="uploadBtn btn-default">开始上传</button>
        </div>
    </div>

    <div class="layui-inline">
        <div class="layui-form-mid layui-word-aux">　本页面刷新后除新添加的文章外所有操作无效，关闭页面所有数据重置</div>
    </div>
    <div id="delete"></div>
</blockquote>
<div class="layui-form users_list">
    <table id="roleList" lay-filter="roleEvent"></table>
</div>
<div id="page"></div>
<script type="text/javascript" src="${ctx}/js/user/userList.js"></script>
<script type="text/javascript">

    var uploader = WebUploader.create({

        // swf文件路径
        swf:'js/common/webuploader/Uploader.swf',

        // 文件接收服务端。
        server: '${ctx}/main/uploadPic.shtml',

        // 选择文件的按钮。可选。
        // 内部根据当前运行是创建，可能是input元素，也可能是flash.
        pick: '#picker',

        // 不压缩image, 默认如果是jpeg，文件上传前会压缩一把再上传！
        resize: false
    });


    // 当有文件被添加进队列的时候
    uploader.on('fileQueued', function( file ) {
        $('#thelist').append( '<div id="' + file.id + '" class="item">' +
            '<h4 class="info">' + file.name + '</h4>' +
            '<p class="state">等待上传...</p>' +
            '</div>' );
    });

    // 文件上传过程中创建进度条实时显示。
    uploader.on( 'uploadProgress', function( file, percentage ) {
        var $li = $( '#'+file.id ),
            $percent = $li.find('.progress .progress-bar');

        // 避免重复创建
        if ( !$percent.length ) {
            $percent = $('<div class="progress progress-striped active">' +
                '<div class="progress-bar" role="progressbar" style="width: 0%">' +
                '</div>' +
                '</div>').appendTo( $li ).find('.progress-bar');
        }

        $li.find('p.state').text('上传中');

        $percent.css( 'width', percentage * 100 + '%' );
    });


    uploader.on( 'uploadAccept', function( file, response ) {
        console.log(response)
        if ( response ) {
            // 通过return false来告诉组件，此文件上传有错。
            return true;
        }
    });

    uploader.on( 'uploadSuccess', function( file ,res) {
        console.log("sss")
        $( '#'+file.id ).find('p.state').text('已上传');
    });

    uploader.on( 'uploadError', function( file ,res) {
        console.log(res)
        $( '#'+file.id ).find('p.state').text('上传出错');
    });

    uploader.on( 'uploadComplete', function( file ) {
        $( '#'+file.id ).find('.progress').fadeOut();
    });

    //点击上传按钮触发事件
    $("#btnClick").click(function(){
        uploader.upload();
    });

    function add() {
        $('#delete').html('<AA>d</AA>')
    }

    layui.use('table', function(){
        var table = layui.table;

        //第一个实例
        table.render({
            elem: '#roleList'
            ,id:'roleListTable'
            ,url: '${ctx}/system/sysRole/roleList.shtml' //数据接口
            ,page: true //开启分页
            ,limit: 10
            ,cols: [[ //表头
                {field: 'roleId', title: 'ID', sort: true, fixed: 'left'}
                ,{field: 'roleName', title: '角色名称'}
                ,{field: 'roleType', title: '角色类型'}
                ,{field: 'sort', title: '排序字段'}
                ,{field: 'createTime', title: '创建时间', sort: true,templet:function (d) {
                    return new Date(d.createTime).Format("yyyy-MM-dd hh:mm:ss");
                }}
//                ,{title:'操作', align:'center',fixed:'right', toolbar: '#bar',align:'center'} //这里的toolbar值是模板元素的选择器
            ]]
        });


        var $ =layui.$,
            active ={reload:function(){
                var username =$('#username');
                var departName =$('#departName');

                table.reload('userlistTable',{
                    where:{
                        username:username.val(),
                        departName:departName.val()
                    }
                });
            }
            };

        $('.layui-elem-quote .layui-inline .search_btn').on('click',function(){
            var type =$(this).data('type');
            active[type] ?active[type].call(this) :'';});

//监听工具条
        table.on('tool(roleEvent)', function(obj){ //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
            var data = obj.data; //获得当前行数据
            var layEvent = obj.event; //获得 lay-event 对应的值
            var tr = obj.tr; //获得当前行 tr 的DOM对象

            if(layEvent === 'detail'){ //查看
                window.location.href='${ctx}/sysUser/detail.shtml?id='+data.id
                //do somehing
            } else if(layEvent === 'del'){ //删除
                layer.confirm('确定删除此数据？', function(index){
                    obj.del(); //删除对应行（tr）的DOM结构，并更新缓存
                    layer.close(index);
                    $.ajax("${ctx}/user/delete.shtml?id="+data.id)
                    //向服务端发送删除指令
                });
            }else if(layEvent === 'edit'){ //修改
                window.location.href='${ctx}/user/update.shtml?id='+data.id
                //向服务端发送删除指令

            }
        });

    });
</script>
</body>
</html>