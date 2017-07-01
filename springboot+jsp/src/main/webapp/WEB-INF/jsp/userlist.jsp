<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath}/static/assets/css/bootstrap.min.css" rel="stylesheet" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/assets/css/font-awesome.min.css" />
<!--[if IE 7]>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/assets/css/font-awesome-ie7.min.css" />
<![endif]-->
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/assets/css/ace.min.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/assets/css/ace-rtl.min.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/assets/css/ace-skins.min.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/buttons.css" />
<script src="${pageContext.request.contextPath}/static/assets/js/jquery-2.0.3.min.js"></script>
<script src="${pageContext.request.contextPath}/static/assets/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<div class="main-container" id="main-container">
		<script type="text/javascript">
				try{ace.settings.check('main-container' , 'fixed')}catch(e){}
			</script>

		<div class="main-container-inner">
			<a class="menu-toggler" id="menu-toggler" href="#"> <span class="menu-text"></span>
			</a>

			<div class="main-content">
				<div class="breadcrumbs" id="breadcrumbs">
					<script type="text/javascript">
							try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
						</script>

					<ul class="breadcrumb">
					<input type="button" class="button purple" value="添加"
							data-toggle="modal" data-target="#myModal"
							sytle="padding-bottom: 0px;padding-top:3px" />
					</ul>
					<!-- .breadcrumb -->

				</div>

				<div class="page-content">
					
					<!-- /.page-header -->

					<div class="row">
						<div class="col-xs-12">							
							<table id="sample-table-1" class="table table-striped table-bordered table-hover">
								<thead>
									<tr>
										<th class="center"><label><input type="checkbox" class="ace" autocomplete="off"/> <span class="lbl" ></span> </label></th>
										<th>用户名</th>							
										<th>操作</th>
									</tr>
								</thead>
								<tbody id="listdir">
										<c:forEach items="${userlist}" var="entry" varStatus="sta">
										<tr>
											<td class="center"><label> <input type="checkbox" class="ace" value=""   autocomplete="off"/> <span class="lbl"></span>
											</label></td>
											<td>${entry.name}</td>									
											<td>
												<button class="btn btn-xs btn-info" onclick="editName(${sta.index})" title="修改">
													<i class="icon-edit bigger-120"></i>
												</button>
												
												<button class="btn btn-xs btn-info" onclick="viewName(${sta.index})" title="删除">
													<i class="icon-eye-open bigger-120"></i>
												</button>
												
											</td>
										</tr>
										</c:forEach>
								</tbody>
							</table>
							<!-- PAGE CONTENT ENDS -->
						</div>
						<!-- /.col -->
					</div>
					<!-- /.row -->
				</div>
				<!-- /.page-content -->
			</div>
			<!-- /.main-content -->
			
			

		</div>
		<!-- /.main-container-inner -->

		<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse"> <i class="icon-double-angle-up icon-only bigger-110"></i>
		</a>
	</div>
	<!-- 模态框（Modal） -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel">添加用户</h4>
				</div>
				<form action="#" id="userform" method="post">
					<div class="modal-body">
						<div class="form-group">
						<input type="hidden" id="depId" name="depId" value="${depId}"/>
							<label class="col-sm-2 control-label no-padding-right"
								for="form-field-1"> 用户名 :</label>
							<div class="col-sm-9">
								<input type="text" id="form-field-1" placeholder="name"
									class="col-xs-4 col-sm-6" name="name" />&nbsp;(用户名必须唯一)
							</div>

						</div>
					</div>					
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal" onclick="checks()">关闭
						</button>
						<input type="submit" class="btn btn-primary" value="提交" onclick="usersave()"/>
					</div>
				</form>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal -->
	</div>
	<script type="text/javascript">
	function usersave(){
		$("#userform").attr("action","add");			  
}

</script>
</body>
</html>